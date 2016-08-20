# POC Liquibase Spring

#### Spring boot , Liquibase, PostgreSql

### install postgresql ,create user and create database 
```bash
//login user postgres
user@demo:~$ sudo -i -u postgres

//create db
postgres@demo:~$ createdb demoDB
postgres@demo:~$ psql demoDB

//create user access db
demoDB=# CREATE USER userdemo WITH PASSWORD 'password@demo';
demoDB=# GRANT ALL PRIVILEGES ON DATABASE "demoDB" to userdemo;
demoDB=# \q
```

### `build.gradle`
```
compile('org.liquibase:liquibase-core')
compile('org.postgresql:postgresql:9.3-1104-jdbc4')
```


### `application.properties`
```
#PostgreSQL
spring.jpa.database-platform=org.hibernate.dialect.PostgreSQL82Dialect
spring.datasource.dataSourceClassName=org.postgresql.Driver
spring.datasource.url=jdbc:postgresql://localhost:5432/demoDB
spring.datasource.username=userdemo
spring.datasource.password=password@demo
spring.datasource.sqlScriptEncoding=UTF-8
spring.datasource.platform=postgresql
spring.jpa.show_sql=true

liquibase.change-log=classpath:/db/changelog/changelog.yaml
liquibase.user=userdemo
liquibase.password=password@demo
```

### `/db/changelog/changelog.yaml`
```
databaseChangeLog:
  - changeSet:
      id: 1
      author: userdemo
      changes:
        - createTable:
            tableName: person
            columns:
              - column:
                  name: id
                  type: int
                  autoIncrement: true
                  constraints:
                    primaryKey: true
                    nullable: false
              - column:
                  name: firstName
                  type: varchar(255)
                  constraints:
                    nullable: false
              - column:
                  name: lastName
                  type: varchar(255)
                  constraints:
                    nullable: false
  - changeSet:
      id: 2
      author: userdemo
      changes:
        - insert:
            tableName: person
            columns:
              - column:
                  name: firstName
                  value: guutong
              - column:
                  name: lastName
                  value: yahoo
  - changeSet:
      id: 3
      author: guutong
      changes:
        - renameColumn:
            catalogName: demoDB
            columnDataType: String
            newColumnName: first_name
            oldColumnName: firstName
            remarks: renameColumn firstName
            schemaName: public
            tableName: person
  - changeSet:
      id: rename-lastName
      author: guutong
      changes:
        - renameColumn:
            catalogName: demoDB
            columnDataType: String
            newColumnName: last_name
            oldColumnName: lastName
            remarks: renameColumn lastName
            schemaName: public
            tableName: person
```

### Test
```
gradle build
gradle bootRun
```
1. `curl -X GET  http://localhost:8080/persons`
```
[
  {
    "id": 1,
    "firstName": "guutong",
    "lastName": "yahoo"
  }
]
```
2.Add changeSet `/db/changelog/changelog.yaml`
```
  - changeSet:
      id: add-persons-2
      author: userdemo
      changes:
        - insert:
            tableName: person
            columns:
              - column:
                  name: firstName
                  value: pokemon
              - column:
                  name: lastName
                  value: go
```
ctrl+c to stop `gradle bootRun` and run `gradle bootRun` to reload data

`curl -X GET  http://localhost:8080/persons`
```
[
  {
    "id": 1,
    "firstName": "guutong",
    "lastName": "yahoo"
  },
  {
    "id": 2,
    "firstName": "pokemon",
    "lastName": "go"
  }
]
```