# 我的学习
## 资料
[Spring 文档](https://spring.io/guides)

[Spring Web](https://spring.io/guides/gs/serving-web-content/)

[es](https://elasticsearch.cn/explore)

[Github deploy key](https://developer.github.com/v3/guides/managing-deploy-keys/#deploy-keys)

[BootStrap](https://v3.bootcss.com/getting-started/)

[Github OAuth](https://developer.github.com/apps/building-oauth-apps/creating-an-oauth-app/)

[Spring](https://docs.spring.io/spring-boot/docs/2.0.0.RC1/reference/htmlsingle/#boot-features-embedded-database-support)

[菜鸟教程](https://www.runoob.com/mysql/mysql-select-query.html)

[Thymeleaf](https://www.thymeleaf.org/doc/tutorials/3.0/usingthymeleaf.html#setting-attribute-values)

## 工具
[Git](https://git-scm.com/)

[Visual Paradigm](https://www.visual-paradigm.com)

[Flyway](https://flywaydb.org/getstarted/firststeps/maven)

[Lombok](https://projectlombok.org)
## 脚本
```sql
    create table USER
    (
      ID INT AUTO_INCREMENT PRIMARY KEY NOT NULL,
      ACCOUNT_ID   VARCHAR(100),
      NAME         VARCHAR(50),
      TOKEN        CHAR(36),
      GMT_CREATE   BIGINT,
      GMT_MODIFIED BIGINT
    );
```

```bash
    mvn flyway:migrate
```
