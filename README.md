> http://javasampleapproach.com/spring-framework/spring-data/solr-start-spring-data-solr-springboot

```bash
$ solr create -c customer
WARNING: Using _default configset with data driven schema functionality. NOT RECOMMENDED for production use.
         To turn off: bin/solr config -c customer -p 8983 -action set-user-property -property update.autoCreateFields -value false
INFO  - 2018-07-21 22:05:16.433; org.apache.solr.util.configuration.SSLCredentialProviderFactory; Processing SSL Credential Provider chain: env;sysprop

Created new core 'customer'
```


![](https://github.com/liweinan/SpringBootSolr/blob/master/2018-07-21%208.27.05%20PM.gif)
