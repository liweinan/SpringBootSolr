http://javasampleapproach.com/spring-framework/spring-data/solr-start-spring-data-solr-springboot

```bash
$ mvn -q spring-boot:run

  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v2.0.3.RELEASE)

2018-07-21 20:23:53.825  INFO 665 --- [           main] c.j.solr.SpringBootSolrApplication       : Starting SpringBootSolrApplication on ovpn-12-200.pek2.redhat.com with PID 665 (/Users/weli/projs/SpringBootSolr/target/classes started by weli in /Users/weli/projs/SpringBootSolr)
2018-07-21 20:23:53.828  INFO 665 --- [           main] c.j.solr.SpringBootSolrApplication       : No active profile set, falling back to default profiles: default
2018-07-21 20:23:53.862  INFO 665 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@5750fd7e: startup date [Sat Jul 21 20:23:53 CST 2018]; root of context hierarchy
2018-07-21 20:23:54.874  INFO 665 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
2018-07-21 20:23:54.882  INFO 665 --- [           main] c.j.solr.SpringBootSolrApplication       : Started SpringBootSolrApplication in 1.259 seconds (JVM running for 3.411)
--------------------------------
Select all Customers:
--------------------------------
Customer [id=1, name=Jack, age=20]
Customer [id=2, name=Adam, age=24]
Customer [id=3, name=Kim, age=27]
Customer [id=4, name=David, age=30]
Customer [id=5, name=Peter, age=21]
--------------------------------
Find Customers that have names EndsWith m:
--------------------------------
Customer [id=2, name=Adam, age=24]
Customer [id=3, name=Kim, age=27]
2018-07-21 20:23:55.067  INFO 665 --- [       Thread-2] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@5750fd7e: startup date [Sat Jul 21 20:23:53 CST 2018]; root of context hierarchy
2018-07-21 20:23:55.068  INFO 665 --- [       Thread-2] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown
$
```