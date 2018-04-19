package top.idalin.myrule;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;

@Configuration
public class MySelfRule {

	@Bean
	public IRule myRule() {
		// return new RandomRule(); 		// Ribbon默认使用的是轮询算法，这里自定义为随机的算法  
		// return new RoundRobinRule();
		return new MyRandomRule();		// 调用自定义的负载均衡的算法，这里定义为每个机器访问5次
	}
	
}
