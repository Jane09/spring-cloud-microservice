git clone https://github.com/openzipkin/zipkin
cd zipkin
./mvnw -DskipTests --also-make -pl zipkin-server clean install
java -jar ./zipkin-server/target/zipkin-server-*exec.jar