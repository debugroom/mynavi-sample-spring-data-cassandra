# Dockerfile for cassandra

FROM            docker.io/centos:latest
MAINTAINER      debugroom

RUN yum install -y \
       java-1.8.0-openjdk \
       java-1.8.0-openjdk-devel \
       wget tar iproute

ENV JAVA_HOME /etc/alternatives/java_sdk
ADD datastax.repo /etc/yum.repos.d/
RUN yum -y install dsc30
RUN yum -y install cassandra30-tools
RUN sed -i s/\#-Xms4G/-Xms1G/g /etc/cassandra/conf/jvm.options
RUN sed -i s/\#-Xmx4G/-Xmx2G/g /etc/cassandra/conf/jvm.options
RUN sed -i s/seeds\:\ \"127\.0\.0\.1\"/seeds\:\ \"172\.17\.0\.2\"/g /etc/cassandra/conf/cassandra.yaml
RUN sed -i s/listen\_address\:\ localhost/listen\_address\:\ 172\.17\.0\.2/g /etc/cassandra/conf/cassandra.yaml
RUN sed -i s/rpc\_address\:\ localhost/\rpc\_address\:\ 172\.17\.0\.2/g /etc/cassandra/conf/cassandra.yaml
RUN systemctl enable cassandra
ADD create-keyspace.cql /root/
#cqlsh 172.17.0.2 9042 -f /root/create-keyspace.cql

EXPOSE 7199 7000 7001 9160 9042 22 8012 61621