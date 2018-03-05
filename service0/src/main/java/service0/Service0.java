package service0;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 此处添加该类的概要说明
 * @author      zhongwenyue
 * @version     1.0
 * @Project 	service0
 * @Package	    service0	
 * @Title	    Service0.java
 * @Email		zhongwenyue@atlasdata.com.cn
 * @modified	
 * @date		2018年3月2日 下午6:16:19
 * @Copyright   海量云图(北京)数据技术有限公司
 * @Description 此处添加该类的详细说明
 */
@SpringBootApplication
@EnableDiscoveryClient
@RestController
public class Service0 {
	
	@GetMapping("/service0")
	public String service0() {
		return "hello service0";
	}
	
	@GetMapping("/getmap")
	public String getMap() {
		return "getMap";
	}
	
	public String noMap() {
		return "noMap";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(Service0.class, args);
	}
	

}
