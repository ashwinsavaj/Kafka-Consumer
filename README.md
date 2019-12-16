# Kafka-Consumer
Implementing kafka in spring boot application. This application is use to see the producer message

Apache Kafka is an open-source stream-processing software platform. I'm implementing producer with spring boot. Producer can send the message to consumer and Message will store in apache broker.

#Zookeeper zookeeper is another server which is made by apache.First we need to install zookeeper. Here is the step to configure.

Download zookeeper : https://zookeeper.apache.org/releases.html(28MB)
Extract zookeeper file.
Set the path in path variable.
Change the zoo_sample.cfg to zoo.cfg (zookeeper\conf\zoo.cfg)
Run the command on cmd : zkserver
#kafka

Once we have done configuration for zookeeper. we need to start kafka server. here is the configuration for kafka server.

1.Download apache kafka : https://kafka.apache.org/downloads (68MB- User binary download) 2.Extract files. 3. Go to kafka\config\server.properties and make this change log.dirs = tmp/logs to log.dirs=\kafka\kafka-logs

4.start your kafka : kafka\bin\windows > kafka-server-start.bat *\kafka\config\server.properties


Added dependency in pom file : Spring kafka.


Reference sites: 
  
  1. https://memorynotfound.com/spring-kafka-json-serializer-deserializer-example/
  2. https://kafka.apache.org/documentation/
  3. https://www.confluent.io/blog/apache-kafka-spring-boot-application/
