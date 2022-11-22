# redis-splunk-agent
Sample Logging Agent to send messages (Java logging using logback) to Splunk HTTP Event Collector (HEC)

## Usage
```bash
java -jar \
-Dlogback.configurationFile=config/logback.xml \
-Dsplunk.url=<HEC_ENDPOINT> \
-Dsplunk.token=<HEC_TOKEN> \
-Dsplunk.index=<HEC_INDEX_NAME> \
-Diter=1 \
redis-splunk-agent-1.0.0.jar
```