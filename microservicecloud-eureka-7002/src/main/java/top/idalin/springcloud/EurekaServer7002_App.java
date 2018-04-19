package top.idalin.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer	// Eureka服务端启动类，接收其它微服务注册进来
public class EurekaServer7002_App {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServer7002_App.class, args);
	}
	
}
