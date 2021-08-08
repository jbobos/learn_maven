## MacOS

### Prepare

1. jdk

   * `brew install openjdk@8`
   * `brew install openjdk@11`

2. jenv

   * `brew install jenv`
   * `jenv add  /usr/local/opt/openjdk@8/`
   * `jenv add  /usr/local/opt/openjdk@11/`
   * `jenv versions`
   * `jenv local 1.8.0.302`

3. maven

   * `brew install maven`

### Setup

1. [Maven in 5 minutes](https://maven.apache.org/guides/getting-started/maven-in-five-minutes.html)
2. [Log4j 2 in Maven](https://logging.apache.org/log4j/2.x/maven-artifacts.html#Using_Log4j_in_your_Apache_Maven_build)
3. [Maven Assembly Plugin](https://maven.apache.org/plugins/maven-assembly-plugin/)

### Execute

* `cd my-app`
* `mvn clean package`
* `java -cp target/my-app-1.0-SNAPSHOT-jar-with-dependencies.jar com.mycompany.app.App`

