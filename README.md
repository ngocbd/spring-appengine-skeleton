# Spring project skeleton 

Spring project skeleton that can run alone , in servlet container (tomcat,jetty,etc ..) , or in appengine ( include both Standard and Flexible enviroment)


## Getting Started
### Clone this repository
```
git clone https://github.com/ngocbd/spring-appengine-skeleton.git
```

### Prerequisites
- Jdk 8+
- Maven or maven wrapper 
- Gcloud tools

### Run alone
```
mvn clean package spring-boot:run
```

### Run in appengine local development
```
mvn clean package appengine:run
```


### Deploy to appengine Standard


```
mvn clean package appengine:deploy

```

### Deploy to appengine Flexible

Create file app.yaml and deploy

```
mvn clean package appengine:deploy

```
