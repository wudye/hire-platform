common module:
    common package, tools, enums, errors source
pojo module: 
    entity, pojo, bean, bo,vo, dto
api module:
    web api dependencies
service-user-7001:
    user service
service-company:
    company service

use swagger3 (webmvc-ui)
    swagger3 is impletation of OpenApi spec.

baidu  java sdk will be checked later and maybe changed by google java sdk or default sdk

zookeeper may be deleted according to the envole.

spring-boot-starter-webmvc-ui vs springdoc-openapi-starter-webflux-ui
SDK -> JDK -> JVM
@Value vs spring-boot-configuration-processor


in application.yml can use spring.profile.active to config which type yml file 
use banner to config the banner
lombok @Slf4j use log.info() print log 
    working with logging.level in applicaton.yml

response class


 spring-cloud-starter-bootstrap 的设计初衷是为了与 Spring Cloud Config 协同工作


 1. if the database exists can use mybatisx plugin to generate the table
 2. deploy eureka and config
 3. deploy gateway
 4. create global response and error handle

 
spring boot actuator
https://medium.com/@pratik.941/a-comprehensive-guide-to-spring-boot-actuator-c2bd63a32ede
https://www.geeksforgeeks.org/java/spring-boot-actuator/
https://www.baeldung.com/spring-boot-actuators


zipkin + sleuth(micrometer trace)
https://juejin.cn/post/7173914390352101412
http://192.168.80.128:9411

openApi(swagger3)
https://www.baeldung.com/spring-rest-openapi-documentation
https://springdoc.org/

log
https://www.baeldung.com/spring-boot-logging

spring config
    spring.profiles.active can only set in config client, in config server repo should not set
    config server can use security
        if it is name and password 
            spring.security.user.name=root
            spring.security.user.password=s3cr3t
    in config client should set
        spring.config.import=optional:configserver:http://root:s3cr3t@localhost:8888
    can use encrypt,should set enable encrpt in application file true
    and config the websecurity to ignore the encrypt request
    and can work with keycloak 
https://www.baeldung.com/spring-cloud-configuration


future to do
    spring cloud gateway from spring cloud 2025.0.0 is deprecated
    the new one to use 
    and also use filter
    https://www.geeksforgeeks.org/java/spring-cloud-gateway/
    when change somethings in other modules, how to not start the config , eureka, gateway and still work, get changed result?



todo:
    global response
    global error exception


if do the blogger should give them questions to do deeply, also show self the knowledge deep.