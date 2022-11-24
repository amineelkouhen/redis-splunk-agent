# Splunk-Logback Agent
Sample Logging Agent to send messages (Java logging using logback) to Splunk HTTP Event Collector (HEC)

## Usage
Clone the Repository:
```
git clone https://github.com/amineelkouhen/redis-splunk-agent.git
```

Execute the Following Commands:
```
./gradlew fatJar
```
Then, 
```bash
java -jar \
-Dlogback.configurationFile=config/logback.xml \
-Dsplunk.url=<HEC_ENDPOINT> \
-Dsplunk.token=<HEC_TOKEN> \
-Dsplunk.index=<HEC_INDEX_NAME> \
-Diter=1 \
build/libs/redis-splunk-agent-1.0.0.jar
```

Example:
```bash
java -jar \
-Dlogback.configurationFile=config/logback.xml \
-Dsplunk.url=http://localhost:8686 \
-Dsplunk.token=RedisToken12345 \
-Dsplunk.index=main \
-Diter=1 \
build/libs/redis-splunk-agent-1.0.0.jar
```