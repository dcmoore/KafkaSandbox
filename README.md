# Kafka Sandbox

__The point of this project is to provide a space where you can play with Kafka in a basic Maven/Java environment.__

To execute the program first start zookeper in a separate tab:

```bash
cd downloads/kafka_2.11-0.11.0.0/
bin/zookeeper-server-start.sh config/zookeeper.properties
```

Then in yet another tab, start the kafka server:

```bash
cd downloads/kafka_2.11-0.11.0.0/
bin/kafka-server-start.sh config/server.properties
```

Then you can start the consumer and producers in (you guessed it) more new tabs:

```bash
mvn clean install
java -jar target/KafkaSandbox-1.0-SNAPSHOT.jar consumer
java -jar target/KafkaSandbox-1.0-SNAPSHOT.jar producer
```
