http://hirecompany.t.mukewang.com/#/login?redirect=%2Fdashboard

http://hireadmin.t.mukewang.com/#/login?redirect=%2Fdashboard


SAAS service


IAAS : Infrastructure as a service
PAAS : Platform as a service
SAAS : Software as a service
DAAS : Date as a service

Mysql 8

内网互通原则：
    关闭本地防火墙
    关闭linux 防火墙 或者开启安全组端口
    连接同一个wifi 下的网段
    保证同一个网段设备同处于一个网段
    前端不要使用localhost，使用网址
内网：
    局域网， 私有网络， 专有网络

使用内网

docker：
    设置docker镜像
    1.安装mysql

开启IPV4(涉及网络命令设置都要重启网络)
    vim /usr/lib/sysctl.d/00-system.conf
        net.ipv4.ip_forward=1
    systemctl restart network 
    systemctl restart docker


docker 安装 redis， redis 备份 (RDB，ROD)
mysql + redis + Portainer + MariaDB

Maven + 服务接口API + 优雅的Restful + lombok +  数据初始化 + Mybastisplus 整合 + git与sourcTree


Maven 聚合工程
    common 通用工具包
    POJO 实体（entity...)
    聊天服务
    微服务网关
    服务API（用户微服务， 企业微服务， 文件微服务， 资源微服务， 工作微服务， 鉴权中心，支付中心）


packing type: jar, war(tomcat), pom



parent project pom.xml file build
    是否需要保留 `<build>` 配置？
    这取决于你的项目需求。以下是分析：

    1. `<finalName>${project.artifactId}</finalName>`
    作用：指定构建后的文件名（如 my-project.jar 而不是默认的 my-project-1.0.0.jar）。
    是否需要？
    ✅ 需要：如果你想自定义输出文件名（去掉版本号）。
    ❌ 不需要：如果默认命名（带版本号）可以接受，可以删除。
    2. `maven-site-plugin` 插件
    作用：用于生成 Maven 项目站点（包含项目文档、报告等）。
    是否需要？
    ✅ 需要：如果你计划使用 mvn site 生成项目文档（如 Javadoc、测试报告等）。
    ❌ 不需要：如果项目不需要生成站点，可以删除。
    3. 是否需要整个 `<build>` 配置？
    如果：
    你不需要自定义 finalName，并且
    你不需要 maven-site-plugin，
    那么：可以删除整个 `<build>` 配置，Maven 会使用默认行为。
    建议
    保留 `<finalName>`（简化构建文件名）。
    删除 `maven-site-plugin`（除非你真的需要生成站点）。
    最终精简版：
    <build>
        <finalName>${project.artifactId}</finalName>
    </build>
    总结
    配置项	是否必要？	建议
    <finalName>	可选（但推荐）	✅ 保留
    maven-site-plugin	仅需站点时	❌ 删除（除非需要）
    如果你的项目不需要站点生成，可以简化成：

    <build>
        <finalName>${project.artifactId}</finalName>
    </build>



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




add dependencies
 problem is : zookeeper, java sdk baidu,  knife4j vs sprind doc



 以下是 springdoc-openapi-ui 、 springdoc-openapi-starter-webmvc-ui 和 springdoc-openapi-starter-webflux-ui 的主要区别：

1. 功能与适用场景
依赖项	适用框架	主要功能	版本支持
springdoc-openapi-ui (1.8.0)	Spring WebMVC	提供基础的 OpenAPI 3.0 文档生成和 Swagger UI 集成。	Spring Boot 2.x
springdoc-openapi-starter-webmvc-ui (2.6.0)	Spring WebMVC	在 springdoc-openapi-ui 基础上提供 Starter 自动配置，简化集成。	Spring Boot 2.7+ 和 3.x
springdoc-openapi-starter-webflux-ui (2.6.0)	Spring WebFlux (Reactive)	专为响应式编程设计，支持 Reactive 风格的 API 文档生成。	Spring Boot 2.7+ 和 3.x
2. 核心区别
(1) springdoc-openapi-ui vs springdoc-openapi-starter-webmvc-ui
配置方式：
springdoc-openapi-ui 需要手动配置 Spring WebMVC 依赖。
springdoc-openapi-starter-webmvc-ui 是 Starter 包，自动配置所有必要依赖（如 spring-webmvc ）。
版本兼容性：
springdoc-openapi-ui 1.8.0 仅支持 Spring Boot 2.x。
springdoc-openapi-starter-webmvc-ui 2.6.0 支持 Spring Boot 2.7+ 和 3.x。
(2) springdoc-openapi-starter-webmvc-ui vs springdoc-openapi-starter-webflux-ui
编程模型：
webmvc-ui 适用于传统的同步阻塞式编程（Spring WebMVC）。
webflux-ui 适用于响应式非阻塞编程（Spring WebFlux）。
技术栈：
如果项目使用 @RestController 和同步 IO，选择 webmvc-ui 。
如果项目使用 @RestController 和 Reactive 编程（如 Mono / Flux ），选择 webflux-ui 。
3. 如何选择？
Spring Boot 2.x + WebMVC：
使用 springdoc-openapi-ui (1.8.0)。
Spring Boot 2.7+/3.x + WebMVC：
使用 springdoc-openapi-starter-webmvc-ui (2.6.0)。
Spring Boot 2.7+/3.x + WebFlux：
使用 springdoc-openapi-starter-webflux-ui (2.6.0)。
4. 注意事项
不要混用：
避免同时引入 webmvc-ui 和 webflux-ui ，可能导致冲突。
版本对齐：
确保 springdoc 版本与 Spring Boot 版本兼容（如 Spring Boot 3.x 需使用 springdoc 2.x）。
总结
springdoc-openapi-ui ：旧版基础功能，需手动配置。
springdoc-openapi-starter-webmvc-ui ：现代化 Starter，适合 WebMVC 项目。
springdoc-openapi-starter-webflux-ui ：专为响应式编程设计，适合 WebFlux 项目。
根据项目技术栈和 Spring Boot 版本选择即可！

如果项目使用 @RestController 和 Reactive 编程（如 Mono / Flux ），这意味着项目采用了 响应式编程模型（Reactive Programming），通常基于 Spring WebFlux 框架。以下是详细解释：

1. 核心概念
@RestController ：
用于定义 RESTful API 的 Spring 注解，与传统的 Spring WebMVC 相同，但支持返回响应式类型（如 Mono / Flux ）。
Reactive 编程：
一种基于数据流和变化传播的编程范式，核心特点是 非阻塞 和 异步，适合高并发、低延迟的场景。
Mono ：表示 0 或 1 个 异步结果的容器。
Flux ：表示 0 到 N 个 异步结果的流式容器。
2. 技术栈选择
框架：
使用 Spring WebFlux（而非 Spring WebMVC）作为底层框架。
依赖 spring-boot-starter-webflux （而非 spring-boot-starter-web ）。
文档工具：
选择 springdoc-openapi-starter-webflux-ui （专为 WebFlux 设计），而不是 webmvc-ui 。
3. 代码示例
(1) 典型的 Reactive Controller
Java
插入
复制
新建文件
保存
应用代码
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/api")
public class ReactiveController {

    // 返回单个结果（Mono）
    @GetMapping("/user/{id}")
    public Mono<User> getUserById(@PathVariable String id) {
        return userRepository.findById(id); // 假设返回 Mono<User>
    }

    // 返回流式结果（Flux）
    @GetMapping("/users")
    public Flux<User> getAllUsers() {
        return userRepository.findAll(); // 假设返回 Flux<User>
    }
}
(2) 依赖配置（ pom.xml ）
Xml
插入
复制
新建文件
保存
应用代码
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-webflux</artifactId>
</dependency>
<dependency>
    <groupId>org.springdoc</groupId>
    <artifactId>springdoc-openapi-starter-webflux-ui</artifactId>
    <version>2.6.0</version>
</dependency>
4. 适用场景
高并发请求：如实时聊天、股票行情推送。
低延迟需求：如物联网（IoT）设备数据采集。
流式数据处理：如文件上传/下载、实时日志分析。
5. 与传统 WebMVC 的区别
特性	WebMVC ( @RestController )	WebFlux ( @RestController + Reactive)
编程模型	同步阻塞	异步非阻塞
线程模型	每个请求占用一个线程	少量线程处理大量请求（事件循环）
吞吐量	较低（受线程数限制）	更高（适合高并发）
适用场景	CRUD 应用、传统业务逻辑	实时系统、流式数据处理
6. 注意事项
数据库兼容性：
确保数据库驱动支持 Reactive（如 MongoDB Reactive、R2DBC for SQL）。
调试复杂性：
Reactive 代码的调试和日志记录比同步代码更复杂。
学习曲线：
需要理解 Reactive 编程的核心概念（如背压、订阅者模式）。
总结
如果项目使用 @RestController 和 Reactive 编程（ Mono / Flux ），说明它是一个 基于 Spring WebFlux 的响应式应用，适合高并发和实时场景。需选择正确的技术栈（如 webflux-ui 文档工具）并注意 Reactive 生态的兼容性。

pom.xml
give me an example to explain webmvc and webflux
以下是 Spring WebMVC 和 Spring WebFlux 的对比示例，通过代码和架构图展示两者的核心区别：

1. 示例场景
假设我们需要实现一个简单的 REST API，根据用户 ID 返回用户信息。

2. Spring WebMVC（同步阻塞）
(1) 代码示例
Java
插入
复制
新建文件
保存
应用代码
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mvc/users")
public class UserMvcController {

    private final UserRepository userRepository; // 假设是同步的 JPA 或 MyBatis 仓库

    @GetMapping("/{id}")
    public User getUserById(@PathVariable String id) {
        return userRepository.findById(id); // 同步阻塞调用
    }
}
(2) 特点
同步阻塞：每个请求占用一个线程，直到数据库返回结果。
线程模型：基于 Servlet 的线程池（如 Tomcat 的 200 线程默认配置）。
适用场景：传统 CRUD 应用，低并发场景。
(3) 架构图
代码
图表
插入
复制
新建文件
保存
sequenceDiagram
    participant Client
    participant Tomcat
    participant Database

    Client->>Tomcat: HTTP Request (GET /users/1)
    Tomcat->>Database: Blocking SQL Query
    Database-->>Tomcat: Result
    Tomcat-->>Client: HTTP Response
3. Spring WebFlux（响应式非阻塞）
(1) 代码示例
Java
插入
复制
新建文件
保存
应用代码
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/flux/users")
public class UserFluxController {

    private final ReactiveUserRepository userRepository; // 假设是响应式的 MongoDB 或 R2DBC 仓库

    @GetMapping("/{id}")
    public Mono<User> getUserById(@PathVariable String id) {
        return userRepository.findById(id); // 非阻塞调用，返回 Mono
    }
}
(2) 特点
异步非阻塞：请求线程立即释放，数据就绪时通过事件回调通知。
线程模型：基于事件循环（如 Netty 的少量 EventLoop 线程）。
适用场景：高并发、实时流式数据处理（如聊天、IoT）。
(3) 架构图
代码
图表
下载
Database
Netty
Client
Database
Netty
Client
HTTP Request (GET /users/1)
Non-blocking Query
Result (via callback)
HTTP Response
4. 关键对比
特性	WebMVC	WebFlux
编程模型	同步阻塞（Imperative）	异步非阻塞（Reactive）
线程消耗	高（每个请求一个线程）	低（少量线程处理大量请求）
吞吐量	受限于线程池大小	更高（适合 10K+ 并发）
数据库支持	JDBC（阻塞驱动）	R2DBC / MongoDB Reactive（非阻塞驱动）
调试难度	简单（线性逻辑）	复杂（需理解 Reactive 流）
5. 如何选择？
选 WebMVC 如果：
项目依赖阻塞式数据库（如 MySQL JDBC）。
团队熟悉传统同步编程。
选 WebFlux 如果：
需要处理高并发或实时流数据。
使用响应式数据库（如 MongoDB、PostgreSQL R2DBC）。
6. 混合使用场景
Spring 允许同时使用 WebMVC 和 WebFlux，但需注意：

避免在同一个 Controller 中混用同步和异步代码。
推荐用 @Async 或 DeferredResult 作为过渡方案。
pom.xml
    private final ReactiveUserRepository userRepository; // 假设是响应式的 MongoDB 或 R2DBC 仓库 响应式的 MongoDB 或 R2DBC 仓库
以下是关于 响应式 MongoDB 和 R2DBC 仓库 的详细解释和代码示例：

1. 响应式仓库的核心特点
非阻塞 IO：基于 Reactive Streams 规范（ Publisher-Subscriber 模型）。
返回类型：返回 Mono （单结果）或 Flux （多结果流）。
线程高效：避免线程阻塞，适合高并发场景。
2. 响应式 MongoDB 仓库示例
(1) 依赖配置（ pom.xml ）
Xml
插入
复制
新建文件
保存
应用代码
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-mongodb-reactive</artifactId>
</dependency>
(2) 定义实体和仓库接口
Java
插入
复制
新建文件
保存
应用代码
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String name;
    // getters/setters
}

// 响应式仓库接口
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import reactor.core.publisher.Mono;

public interface ReactiveUserRepository 
    extends ReactiveMongoRepository<User, String> {
    
    Mono<User> findByName(String name); // 自定义查询
}
(3) 使用示例
Java
插入
复制
新建文件
保存
应用代码
@RestController
@RequestMapping("/reactive/users")
public class ReactiveUserController {

    private final ReactiveUserRepository repository;

    @GetMapping("/{id}")
    public Mono<User> getUserById(@PathVariable String id) {
        return repository.findById(id); // 返回 Mono<User>
    }

    @GetMapping
    public Flux<User> getAllUsers() {
        return repository.findAll(); // 返回 Flux<User>
    }
}
3. 响应式 R2DBC 仓库示例
(1) 依赖配置（ pom.xml ）
Xml
插入
复制
新建文件
保存
应用代码
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-starter-data-r2dbc</artifactId>
</dependency>
<dependency>
    <groupId>io.r2dbc</groupId>
    <artifactId>r2dbc-postgresql</artifactId> <!-- 或其他数据库驱动 -->
</dependency>
(2) 定义实体和仓库接口
Java
插入
复制
新建文件
保存
应用代码
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
public class User {
    @Id
    private Long id;
    private String name;
    // getters/setters
}

// 响应式仓库接口
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface ReactiveUserRepository 
    extends R2dbcRepository<User, Long> {
    
    Mono<User> findByName(String name); // 自定义查询
}
(3) 使用示例
Java
插入
复制
新建文件
保存
应用代码
@RestController
@RequestMapping("/reactive/users")
public class ReactiveUserController {

    private final ReactiveUserRepository repository;

    @GetMapping("/{id}")
    public Mono<User> getUserById(@PathVariable Long id) {
        return repository.findById(id); // 返回 Mono<User>
    }
}
4. 关键区别
特性	MongoDB Reactive	R2DBC
数据库类型	NoSQL（文档型）	关系型数据库（PostgreSQL/MySQL等）
查询语言	MongoDB 原生语法	SQL
事务支持	有限（多文档事务需配置）	完整 ACID 事务
适用场景	灵活数据结构、高吞吐	需要 SQL 和强事务的场景
5. 注意事项
线程模型：
避免在 Reactive 流中调用阻塞代码（如 JDBC）。
背压处理：
使用 onBackpressureBuffer 或 onBackpressureError 处理流量控制。
调试工具：
使用 .log() 记录 Reactive 流日志（如 repository.findAll().log() ）。
总结
响应式 MongoDB：适合灵活数据模型和高吞吐场景。
R2DBC：适合需要 SQL 和事务的关系型数据库。
两者均通过 ReactiveCrudRepository 提供一致的响应式编程接口。
pom.xml
响应式 MongoDB 和同步的 JPA 仓库有什么区别——
以下是 响应式 MongoDB 仓库 和 同步的 JPA 仓库 的核心区别，从技术实现到适用场景的全面对比：

1. 编程模型
特性	响应式 MongoDB	同步 JPA
编程范式	异步非阻塞（Reactive Streams）	同步阻塞（Imperative）
返回类型	Mono<T> （单结果）或 Flux<T> （流式结果）	直接返回 T 或 List<T>
线程模型	事件循环（少量线程处理高并发）	每个请求占用一个线程
2. 技术实现
(1) 响应式 MongoDB
Java
插入
复制
新建文件
保存
应用代码
// 仓库接口
public interface ReactiveUserRepository 
    extends ReactiveMongoRepository<User, String> {
    
    Flux<User> findByAgeGreaterThan(int age); // 非阻塞查询
}

// 使用示例
@GetMapping("/users/age/{age}")
public Flux<User> getUsersByAge(@PathVariable int age) {
    return repository.findByAgeGreaterThan(age); // 流式返回
}
底层驱动：基于 MongoDB 的 Reactive Streams 驱动。
执行流程：
代码
图表
插入
复制
新建文件
保存
sequenceDiagram
    Client->>Server: 请求 /users/age/25
    Server->>MongoDB: 异步查询 (age > 25)
    MongoDB-->>Server: 流式返回数据
    Server-->>Client: 流式响应 (SSE/HTTP/2)
(2) 同步 JPA
Java
插入
复制
新建文件
保存
应用代码
// 仓库接口
public interface UserRepository 
    extends JpaRepository<User, Long> {
    
    List<User> findByAgeGreaterThan(int age); // 阻塞查询
}

// 使用示例
@GetMapping("/users/age/{age}")
public List<User> getUsersByAge(@PathVariable int age) {
    return repository.findByAgeGreaterThan(age); // 同步阻塞
}
底层驱动：基于 JDBC 的阻塞式驱动（如 Hibernate）。
执行流程：
代码
图表
插入
复制
新建文件
保存
sequenceDiagram
    Client->>Server: 请求 /users/age/25
    Server->>Database: 同步SQL查询 (age > 25)
    Database-->>Server: 一次性返回结果
    Server-->>Client: 完整List响应
3. 性能对比
指标	响应式 MongoDB	同步 JPA
吞吐量	高（1个线程可处理10K+并发）	低（受限于线程池大小，如Tomcat默认200）
延迟	更稳定（无线程阻塞）	高并发时延迟飙升
资源消耗	内存占用低（无线程堆积）	高并发时线程和内存占用高
4. 适用场景
场景	响应式 MongoDB	同步 JPA
高并发API	✔️ 实时聊天、IoT设备数据采集	❌ 线程池易耗尽
流式数据处理	✔️ 文件上传、实时日志分析	❌ 不适合流式响应
传统CRUD	⚠️ 可用但杀鸡用牛刀	✔️ 简单直接
事务需求	❌ MongoDB多文档事务有限	✔️ 完整ACID事务支持
5. 关键差异总结
阻塞 vs 非阻塞：
JPA 会阻塞线程直到数据库返回结果，而响应式 MongoDB 立即释放线程，通过回调处理结果。
背压支持：
响应式库天然支持背压（如 Flux 可控制流速），而 JPA 一次性加载所有数据。
调试复杂度：
响应式代码的调用栈和日志更难追踪，需要熟悉 reactor 调试工具（如 .log() ）。
6. 如何选择？
选响应式 MongoDB 如果：
需要处理高并发或流式数据。
使用 NoSQL 且无需复杂事务。
选同步 JPA 如果：
项目已基于关系型数据库（MySQL/PostgreSQL）。
团队对 Reactive 编程不熟悉或无需高吞吐。
混用警告
避免在同一个服务中混用：
响应式和阻塞代码混用会导致线程模型混乱（如用 block() 强制同步响应式调用）。
过渡方案：
如需混合，用 @Async 或 Schedulers 隔离阻塞代码。



术语	全称	定义	核心职责
SDK	Software Development Kit	泛指任何语言的软件开发工具包（如 Android SDK、AWS SDK）。	提供开发、调试、部署特定平台或服务的工具链。
JDK	Java Development Kit	Java 专属的开发工具包（是 SDK 的子集）。	提供 Java 编译、运行、调试工具和核心类库。
JVM	Java Virtual Machine	Java 程序的运行时环境（JDK 和 JRE 均包含 JVM）。	执行字节码，实现跨平台特性（Write Once, Run Anywhere）。
总结
SDK：广义开发工具包（语言或平台无关）。
JDK：Java 开发的唯一必备工具（含 JRE）。
JVM：Java 生态的运行时基石，保障跨平台能力。


@Value 和 @ConfigurationProperties 是 Spring 中两种不同的配置注入方式，它们的主要区别如下：

1. 功能定位
@Value :

用于单个属性的注入。
适合简单、零散的配置项。
支持 SpEL（Spring Expression Language），可以动态计算值。
@ConfigurationProperties :

用于批量绑定一组相关的属性到一个 Java 对象。
适合结构化、复杂的配置（如数据库连接、第三方服务配置）。
不支持 SpEL。
2. 使用场景
@Value 示例
Java
应用代码
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class MyService {
    @Value("${app.datasource.url}")
    private String dbUrl;

    @Value("${app.datasource.timeout:30}") // 默认值 30
    private int timeout;
}
@ConfigurationProperties 示例
Java
应用代码
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "app.datasource")
public class DataSourceProperties {
    private String url;
    private int timeout = 30; // 默认值 30
    private String username;
    private String password;

    // Getters and Setters
}
3. 配置文件的写法
@Value 对应的配置
Yaml
应用代码
app:
  datasource:
    url: jdbc:mysql://localhost:3306/mydb
    timeout: 10
@ConfigurationProperties 对应的配置
Yaml
应用代码
app:
  datasource:
    url: jdbc:mysql://localhost:3306/mydb
    timeout: 10
    username: root
    password: password
4. 元数据支持
@Value :

没有元数据生成功能，IDE 无法提供自动补全或文档提示。
@ConfigurationProperties :

结合 spring-boot-configuration-processor ，可以生成元数据文件（ META-INF/spring-configuration-metadata.json ），IDE 会提供自动补全和文档提示。
5. 类型安全
@Value :

需要手动处理类型转换（如 @Value("${timeout}") int timeout ）。
如果配置项缺失且没有默认值，会抛出异常。
@ConfigurationProperties :

自动完成类型转换（如 String → int ）。
支持宽松绑定（如 max-pool-size 可以绑定到 maxPoolSize 字段）。
可以设置默认值（直接在字段上初始化）。
6. 复杂对象支持
@Value :

无法直接绑定嵌套对象或集合。
@ConfigurationProperties :

支持嵌套对象、集合、Map 等复杂结构。
嵌套对象示例
Java
应用代码
@ConfigurationProperties(prefix = "app")
public class AppProperties {
    private DataSource datasource;
    private List<String> servers;

    // Getters and Setters
}
Yaml
应用代码
app:
  datasource:
    url: jdbc:mysql://localhost:3306/mydb
  servers:
    - server1
    - server2
7. 动态配置
@Value :

支持 SpEL，可以动态计算值：
Java
应用代码
@Value("#{systemProperties['user.home']}")
private String userHome;
@ConfigurationProperties :

不支持 SpEL。
总结
特性	@Value	@ConfigurationProperties
适用场景	简单、零散的配置	复杂、结构化的配置
批量绑定	不支持	支持
类型安全	需手动处理	自动转换
IDE 支持	无自动补全	支持自动补全
SpEL 支持	支持	不支持
嵌套对象/集合支持	不支持	支持
选择建议：
如果只是注入一两个简单属性，用 @Value 。
如果是绑定一组相关属性（如数据库配置），用 @ConfigurationProperties 。
pom.xml
@Value can use 生产环境中不需要它。
@Value 注解在生产环境中仍然需要，因为它用于从配置文件中动态注入属性值，是 Spring 应用中常见的配置管理方式。不过， spring-boot-configuration-processor 是一个开发时工具，主要用于生成配置元数据以提升开发体验，生产环境中不需要它。

关键区别
@Value :

用途: 动态注入配置值（如 application.properties 或 application.yml 中的属性）。
生产环境: 必须保留，否则配置注入会失效。
示例:
Java
应用代码
@Value("${app.datasource.url}")
private String dbUrl;
spring-boot-configuration-processor :

用途: 仅为开发时生成 IDE 提示的元数据文件（ META-INF/spring-configuration-metadata.json ）。
生产环境: 可以移除（通过 optional=true 或 scope=provided 声明）。
示例:
Xml
应用代码
<dependency>
    <groupId>org.springframework.boot</groupId>
    <artifactId>spring-boot-configuration-processor</artifactId>
    <optional>true</optional>
</dependency>
总结
@Value : 生产环境必须保留，否则配置无法注入。
spring-boot-configuration-processor : 生产环境不需要，建议标记为 optional 或 provided 。
如果需要进一步调整 pom.xml 文件，请告诉我！

1 个文件


response entity rewrite in common
database mysql utf8mb4
**/.idea
**/target/

frontend: element UI, vue-element-admin, vue, uni-app
use hbuilder for uni-app




AKF 拆分原则。 业务服务拆分，根据服务业务建立集群，最后地区数据拆分
CAP 定理 Consistency(一致性), Availability（可用性）, Partition tolerance（分区容错性）

Netflix
    Eureka， Hystrix，Ribbon， feign， zuul

import sping clout
spring alibaba
Alibaba Nacos 作为注册中心(eureka)

nacos 安装
https://hub.docker.com/r/herodotus/nacos-server
zookeeper 