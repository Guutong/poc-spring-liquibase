# poc spring liquibase

#### Spring boot , Liquibase, PostgreSql

-----------------------------------

```
gradle update
--------------
:update
liquibase-plugin: Running the 'main' activity...
INFO 8/21/16 3:30 PM: liquibase: Successfully acquired change log lock
INFO 8/21/16 3:30 PM: liquibase: Creating database history table with name: public.databasechangelog
INFO 8/21/16 3:30 PM: liquibase: Reading from public.databasechangelog
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::version-0.0.1::guutong: Tag '0.0.1' applied to database
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::version-0.0.1::guutong: ChangeSet src/main/resources/db/changelog/changelog-20160820.yaml::version-0.0.1::guutong ran successfully in 1ms
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::001_createTable_person::userdemo: Table person created
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::001_createTable_person::userdemo: ChangeSet src/main/resources/db/changelog/changelog-20160820.yaml::001_createTable_person::userdemo ran successfully in 5ms
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::version-1.0.0::guutong: Tag '1.0.0' applied to database
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::version-1.0.0::guutong: ChangeSet src/main/resources/db/changelog/changelog-20160820.yaml::version-1.0.0::guutong ran successfully in 1ms
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::002_add_person_guutong::userdemo: New row inserted into person
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::002_add_person_guutong::userdemo: ChangeSet src/main/resources/db/changelog/changelog-20160820.yaml::002_add_person_guutong::userdemo ran successfully in 1ms
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::version-1.0.1::guutong: Tag '1.0.1' applied to database
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::version-1.0.1::guutong: ChangeSet src/main/resources/db/changelog/changelog-20160820.yaml::version-1.0.1::guutong ran successfully in 0ms
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::003_renameColumn_person::guutong: Column person.firstname renamed to first_name
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::003_renameColumn_person::guutong: Column person.lastname renamed to last_name
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::003_renameColumn_person::guutong: ChangeSet src/main/resources/db/changelog/changelog-20160820.yaml::003_renameColumn_person::guutong ran successfully in 4ms
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::version-1.1.0::guutong: Tag '1.1.0' applied to database
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::version-1.1.0::guutong: ChangeSet src/main/resources/db/changelog/changelog-20160820.yaml::version-1.1.0::guutong ran successfully in 0ms
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160821.yaml::004_add_person_2::userdemo: New row inserted into person
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160821.yaml::004_add_person_2::userdemo: ChangeSet src/main/resources/db/changelog/changelog-20160821.yaml::004_add_person_2::userdemo ran successfully in 1ms
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160821.yaml::version-1.1.1::guutong: Tag '1.1.1' applied to database
INFO 8/21/16 3:30 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160821.yaml::version-1.1.1::guutong: ChangeSet src/main/resources/db/changelog/changelog-20160821.yaml::version-1.1.1::guutong ran successfully in 1ms
INFO 8/21/16 3:30 PM: liquibase: Successfully released change log lock
Liquibase Update Successful
```

#### table person (version 1.1.1)

<table class="data" cellspacing="0">
      <tr>
        <th>id</th>
        <th>first_name</th>
        <th>last_name</th>
      </tr>
      <tr class="even">
        <td align="right">1</td>
        <td>guutong</td>
        <td>yahoo</td>
      </tr>
      <tr class="odd">
              <td align="right">2</td>
              <td>pokemon</td>
              <td>go</td>
            </tr>
    </table>
    
#### table databasechangelog

  <br>
    <table class="data" cellspacing="0">
      <tr>
        <th>id</th>
        <th>author</th>
        <th>filename</th>
        <th>dateexecuted</th>
        <th>orderexecuted</th>
        <th>exectype</th>
        <th>md5sum</th>
        <th>description</th>
        <th>comments</th>
        <th>tag</th>
        <th>liquibase</th>
        <th>contexts</th>
        <th>labels</th>
      </tr>
      <tr class="even">
        <td>version-0.0.1</td>
        <td>guutong</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:30:41</td>
        <td align="right">1</td>
        <td>EXECUTED</td>
        <td>7:86370721ddf1042ac631002f68c500d3</td>
        <td>tagDatabase</td>
        <td>&nbsp;</td>
        <td>0.0.1</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="odd">
        <td>001_createTable_person</td>
        <td>userdemo</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:30:41</td>
        <td align="right">2</td>
        <td>EXECUTED</td>
        <td>7:e2115c964b97e6bb71a736ed2feb8271</td>
        <td>createTable</td>
        <td>&nbsp;</td>
        <td>(null)</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="even">
        <td>version-1.0.0</td>
        <td>guutong</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:30:41</td>
        <td align="right">3</td>
        <td>EXECUTED</td>
        <td>7:96a18b7b1807f334ea204127021bec68</td>
        <td>tagDatabase</td>
        <td>&nbsp;</td>
        <td>1.0.0</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="odd">
        <td>002_add_person_guutong</td>
        <td>userdemo</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:30:41</td>
        <td align="right">4</td>
        <td>EXECUTED</td>
        <td>7:e8610206cc963be483fc57c9275f1e05</td>
        <td>insert</td>
        <td>&nbsp;</td>
        <td>(null)</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="even">
        <td>version-1.0.1</td>
        <td>guutong</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:30:41</td>
        <td align="right">5</td>
        <td>EXECUTED</td>
        <td>7:f949a2af30a38ea0fc448b5cfe82e09f</td>
        <td>tagDatabase</td>
        <td>&nbsp;</td>
        <td>1.0.1</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="odd">
        <td>003_renameColumn_person</td>
        <td>guutong</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:30:41</td>
        <td align="right">6</td>
        <td>EXECUTED</td>
        <td>7:a8982717e8156ef77a1b0320016646dc</td>
        <td>renameColumn (x2)</td>
        <td>&nbsp;</td>
        <td>(null)</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="even">
        <td>version-1.1.0</td>
        <td>guutong</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:30:41</td>
        <td align="right">7</td>
        <td>EXECUTED</td>
        <td>7:ff1f2128ff5511cabcecd5d67be1d107</td>
        <td>tagDatabase</td>
        <td>&nbsp;</td>
        <td>1.1.0</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="odd">
        <td>004_add_person_2</td>
        <td>userdemo</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160821.yaml</td>
        <td>2016-08-21 15:30:41</td>
        <td align="right">8</td>
        <td>EXECUTED</td>
        <td>7:0eb07bdb842549b382d70aeae26f20a0</td>
        <td>insert</td>
        <td>&nbsp;</td>
        <td>(null)</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="even">
        <td>version-1.1.1</td>
        <td>guutong</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160821.yaml</td>
        <td>2016-08-21 15:30:41</td>
        <td align="right">9</td>
        <td>EXECUTED</td>
        <td>7:cc04d46dd418cf2fbed891886d651afb</td>
        <td>tagDatabase</td>
        <td>&nbsp;</td>
        <td>1.1.1</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
    </table>
    
-----------------------------------    

### Test rollback to tag 1.0.0

```
gradle rollback -PliquibaseCommandValue="1.0.0"

-------------
:rollback
liquibase-plugin: Running the 'main' activity...
INFO 8/21/16 3:36 PM: liquibase: Successfully acquired change log lock
INFO 8/21/16 3:36 PM: liquibase: Reading from public.databasechangelog
INFO 8/21/16 3:36 PM: liquibase: null: src/main/resources/db/changelog/changelog-20160821.yaml::version-1.1.1::guutong: Rolling Back Changeset:src/main/resources/db/changelog/changelog-20160821.yaml::version-1.1.1::guutong
INFO 8/21/16 3:36 PM: liquibase: null: src/main/resources/db/changelog/changelog-20160821.yaml::004_add_person_2::userdemo: Rolling Back Changeset:src/main/resources/db/changelog/changelog-20160821.yaml::004_add_person_2::userdemo
INFO 8/21/16 3:36 PM: liquibase: null: src/main/resources/db/changelog/changelog-20160820.yaml::version-1.1.0::guutong: Rolling Back Changeset:src/main/resources/db/changelog/changelog-20160820.yaml::version-1.1.0::guutong
INFO 8/21/16 3:36 PM: liquibase: null: src/main/resources/db/changelog/changelog-20160820.yaml::003_renameColumn_person::guutong: Rolling Back Changeset:src/main/resources/db/changelog/changelog-20160820.yaml::003_renameColumn_person::guutong
INFO 8/21/16 3:36 PM: liquibase: null: src/main/resources/db/changelog/changelog-20160820.yaml::version-1.0.1::guutong: Rolling Back Changeset:src/main/resources/db/changelog/changelog-20160820.yaml::version-1.0.1::guutong
INFO 8/21/16 3:36 PM: liquibase: null: src/main/resources/db/changelog/changelog-20160820.yaml::002_add_person_guutong::userdemo: Rolling Back Changeset:src/main/resources/db/changelog/changelog-20160820.yaml::002_add_person_guutong::userdemo
INFO 8/21/16 3:36 PM: liquibase: Successfully released change log lock
Liquibase Rollback Successful
```

#### table person  (version 1.0.0)

<table class="data" cellspacing="0">
      <tr>
        <th>id</th>
        <th>firstname</th>
        <th>lastname</th>
      </tr>
      <tr class="even">
        <td align="right"></td>
        <td></td>
        <td></td>
      </tr>
    </table>
    
#### table databasechangelog

<table class="data" cellspacing="0">
      <tr>
        <th>id</th>
        <th>author</th>
        <th>filename</th>
        <th>dateexecuted</th>
        <th>orderexecuted</th>
        <th>exectype</th>
        <th>md5sum</th>
        <th>description</th>
        <th>comments</th>
        <th>tag</th>
        <th>liquibase</th>
        <th>contexts</th>
        <th>labels</th>
      </tr>
      <tr class="even">
        <td>version-0.0.1</td>
        <td>guutong</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:30:41</td>
        <td align="right">1</td>
        <td>EXECUTED</td>
        <td>7:86370721ddf1042ac631002f68c500d3</td>
        <td>tagDatabase</td>
        <td>&nbsp;</td>
        <td>0.0.1</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="odd">
        <td>001_createTable_person</td>
        <td>userdemo</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:30:41</td>
        <td align="right">2</td>
        <td>EXECUTED</td>
        <td>7:e2115c964b97e6bb71a736ed2feb8271</td>
        <td>createTable</td>
        <td>&nbsp;</td>
        <td>(null)</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="even">
        <td>version-1.0.0</td>
        <td>guutong</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:30:41</td>
        <td align="right">3</td>
        <td>EXECUTED</td>
        <td>7:96a18b7b1807f334ea204127021bec68</td>
        <td>tagDatabase</td>
        <td>&nbsp;</td>
        <td>1.0.0</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
    </table>

-----------------------------------

### Test updateToTag 1.1.0

```
gradle updateToTag -PliquibaseCommandValue="1.1.0"

----------
:updateToTag
liquibase-plugin: Running the 'main' activity...
INFO 8/21/16 3:45 PM: liquibase: Successfully acquired change log lock
INFO 8/21/16 3:45 PM: liquibase: Reading from public.databasechangelog
INFO 8/21/16 3:45 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::002_add_person_guutong::userdemo: New row inserted into person
INFO 8/21/16 3:45 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::002_add_person_guutong::userdemo: ChangeSet src/main/resources/db/changelog/changelog-20160820.yaml::002_add_person_guutong::userdemo ran successfully in 7ms
INFO 8/21/16 3:45 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::version-1.0.1::guutong: Tag '1.0.1' applied to database
INFO 8/21/16 3:45 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::version-1.0.1::guutong: ChangeSet src/main/resources/db/changelog/changelog-20160820.yaml::version-1.0.1::guutong ran successfully in 1ms
INFO 8/21/16 3:45 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::003_renameColumn_person::guutong: Column person.firstname renamed to first_name
INFO 8/21/16 3:45 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::003_renameColumn_person::guutong: Column person.lastname renamed to last_name
INFO 8/21/16 3:45 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::003_renameColumn_person::guutong: ChangeSet src/main/resources/db/changelog/changelog-20160820.yaml::003_renameColumn_person::guutong ran successfully in 3ms
INFO 8/21/16 3:45 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::version-1.1.0::guutong: Tag '1.1.0' applied to database
INFO 8/21/16 3:45 PM: liquibase: src/main/resources/db/changelog/changelog.yaml: src/main/resources/db/changelog/changelog-20160820.yaml::version-1.1.0::guutong: ChangeSet src/main/resources/db/changelog/changelog-20160820.yaml::version-1.1.0::guutong ran successfully in 1ms
INFO 8/21/16 3:45 PM: liquibase: Successfully released change log lock
Liquibase 'updateToTag' Successful
```

#### table person (version 1.1.0)
<table class="data" cellspacing="0">
      <tr>
        <th>id</th>
        <th>first_name</th>
        <th>last_name</th>
      </tr>
      <tr class="even">
        <td align="right">3</td>
        <td>guutong</td>
        <td>yahoo</td>
      </tr>
    </table>
    
#### table databasechangelog

<table class="data" cellspacing="0">
      <tr>
        <th>id</th>
        <th>author</th>
        <th>filename</th>
        <th>dateexecuted</th>
        <th>orderexecuted</th>
        <th>exectype</th>
        <th>md5sum</th>
        <th>description</th>
        <th>comments</th>
        <th>tag</th>
        <th>liquibase</th>
        <th>contexts</th>
        <th>labels</th>
      </tr>
      <tr class="even">
        <td>version-0.0.1</td>
        <td>guutong</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:30:41</td>
        <td align="right">1</td>
        <td>EXECUTED</td>
        <td>7:86370721ddf1042ac631002f68c500d3</td>
        <td>tagDatabase</td>
        <td>&nbsp;</td>
        <td>0.0.1</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="odd">
        <td>001_createTable_person</td>
        <td>userdemo</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:30:41</td>
        <td align="right">2</td>
        <td>EXECUTED</td>
        <td>7:e2115c964b97e6bb71a736ed2feb8271</td>
        <td>createTable</td>
        <td>&nbsp;</td>
        <td>(null)</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="even">
        <td>version-1.0.0</td>
        <td>guutong</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:30:41</td>
        <td align="right">3</td>
        <td>EXECUTED</td>
        <td>7:96a18b7b1807f334ea204127021bec68</td>
        <td>tagDatabase</td>
        <td>&nbsp;</td>
        <td>1.0.0</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="odd">
        <td>002_add_person_guutong</td>
        <td>userdemo</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:45:08</td>
        <td align="right">4</td>
        <td>EXECUTED</td>
        <td>7:e8610206cc963be483fc57c9275f1e05</td>
        <td>insert</td>
        <td>&nbsp;</td>
        <td>(null)</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="even">
        <td>version-1.0.1</td>
        <td>guutong</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:45:09</td>
        <td align="right">5</td>
        <td>EXECUTED</td>
        <td>7:f949a2af30a38ea0fc448b5cfe82e09f</td>
        <td>tagDatabase</td>
        <td>&nbsp;</td>
        <td>1.0.1</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="odd">
        <td>003_renameColumn_person</td>
        <td>guutong</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:45:09</td>
        <td align="right">6</td>
        <td>EXECUTED</td>
        <td>7:a8982717e8156ef77a1b0320016646dc</td>
        <td>renameColumn (x2)</td>
        <td>&nbsp;</td>
        <td>(null)</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
      <tr class="even">
        <td>version-1.1.0</td>
        <td>guutong</td>
        <td>src&#47;main&#47;resources&#47;db&#47;changelog&#47;changelog-20160820.yaml</td>
        <td>2016-08-21 15:45:09</td>
        <td align="right">7</td>
        <td>EXECUTED</td>
        <td>7:ff1f2128ff5511cabcecd5d67be1d107</td>
        <td>tagDatabase</td>
        <td>&nbsp;</td>
        <td>1.1.0</td>
        <td>3.4.2</td>
        <td>(null)</td>
        <td>(null)</td>
      </tr>
    </table>
    
