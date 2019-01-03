package com.softmax.zipkin;

import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import zipkin2.server.internal.EnableZipkinServer;

import java.io.IOException;

/**
 * amqp搜集消息，es存储
 * java -jar zipkin.jar --RABBIT_URI=amqp://admin:12345@localhost:5672/sleuth --STORAGE_TYPE=elasticsearch --ES_HOSTS=http//:localhost:9200 --ES_HTTP_LOGGING=BASIC
 *
 * @author tb
 * @date 2019/1/3 15:58
 */
@SpringBootApplication
@EnableZipkinServer
public class ZipkinServerApplication {

    public static void main(String[] args) throws IOException, InterruptedException {
        new SpringApplicationBuilder(ZipkinServerApplication.class).web(WebApplicationType.SERVLET).run(args);
//        String cmd = "java -jar zipkin-server-*exec.jar";
//        Process process = Runtime.getRuntime().exec(cmd);
//        if(!process.waitFor(10, TimeUnit.SECONDS)) {
//            System.out.println("启动zipkin失败");
//            process.destroy();
//        }
    }
}
