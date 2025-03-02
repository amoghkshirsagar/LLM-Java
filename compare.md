
### xml

```xml
<?xml version="1.0" encoding="UTF-8"?>
<Configuration status="WARN">
    <Appenders>
        <Console name="Console" target="SYSTEM_OUT">
            <PatternLayout pattern="%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"/>
        </Console>
    </Appenders>
    <Loggers>
        <Root level="info">
            <AppenderRef ref="Console"/>
        </Root>
    </Loggers>
</Configuration>
```


```yaml
Configuration:
  status: WARN
  Appenders:
    Console:
      name: Console
      target: SYSTEM_OUT
      PatternLayout:
        pattern: "%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"
  Loggers:
    Root:
      level: info
      AppenderRef:
        ref: Console
```

```json
{
  "Configuration": {
    "status": "WARN",
    "Appenders": {
      "Console": {
        "name": "Console",
        "target": "SYSTEM_OUT",
        "PatternLayout": {
          "pattern": "%d{HH:mm:ss.SSS} [%t] %-5level %logger{36} - %msg%n"
        }
      }
    },
    "Loggers": {
      "Root": {
        "level": "info",
        "AppenderRef": {
          "ref": "Console"
        }
      }
    }
  }
}
```