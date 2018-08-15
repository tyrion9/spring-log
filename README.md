# Test Spring with logging 

## Prerequisites
Eclipse with colorful console.
Install new software.

```
http://www.mihai-nita.net/eclipse
```
## Rolling Log TimeBased
Good resource
```
https://lankydanblog.com/2017/08/31/configuring-logback-with-spring-boot/
```
Detail
```
    <appender name="RollingFile"
        class="ch.qos.logback.core.rolling.RollingFileAppender">
        <file>${LOGS_FOLDER}/log.log</file>
        <encoder
            class="ch.qos.logback.classic.encoder.PatternLayoutEncoder">
            <Pattern>%d %p %C{1.} [%t] %m%n</Pattern>
        </encoder>
 
        <rollingPolicy
            class="ch.qos.logback.core.rolling.TimeBasedRollingPolicy">
            <fileNamePattern>${LOGS_FOLDER}/log-%d{yyyy-MM-dd}.log</fileNamePattern>
            <maxHistory>2</maxHistory>
        </rollingPolicy>
    </appender>
```