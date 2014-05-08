dataSource {
    pooled = true
    //dbCreate = "none"
    properties {
        maxActive="20"
        maxIdle="10"
        minEvictableIdleTimeMillis=1800000
        timeBetweenEvictionRunsMillis=1800000
        numTestsPerEvictionRun=3
        testOnBorrow=true
        testWhileIdle=true
        testOnReturn=false
        validationQuery="SELECT 1"
        jdbcInterceptors="ConnectionState"
    }
}
hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}

environments {
     development {
         
        dataSource {
            pooled = true
            driverClassName = "org.hsqldb.jdbcDriver"
            username = "sa"
            password = ""
            url = "jdbc:hsqldb:file:devDb;shutdown=true"
            dbCreate = "update" //create create-drop update
        }
    }
    test {
        dataSource {
            driverClassName = "org.hsqldb.jdbcDriver"
            dbCreate = "update"
            url = "jdbc:hsqldb:file:testDb;shutdown=true"
            username = "sa"
            password = ""
        }
   }
    production {
        
        dataSource {
            driverClassName = "oracle.jdbc.OracleDriver"
            //driverClassName = "oracle.jdbc.driver.OracleDriver"
            dialect = "org.hibernate.dialect.Oracle10gDialect"
            //url = "jdbc:oracle:thin:@cerndb1"
            url = "jdbc:oracle:thin:@dbsrvg3305.cern.ch:10121:DEVDB11"
            username = "trecservicetool_admin"
            password = "Tr3cs3rvic3t00l;"
            dbCreate = "update"
            properties {
                validationQuery="SELECT 1 FROM DUAL"
            }
            }
          /*  
          dataSource {
            driverClassName = "org.hsqldb.jdbcDriver"
            dbCreate = "update"
            url = "jdbc:hsqldb:file:testDb;shutdown=true"
            username = "sa"
            password = ""
        } */
        
    }
   
}
