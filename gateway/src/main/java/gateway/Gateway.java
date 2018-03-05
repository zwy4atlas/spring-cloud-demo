package gateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;


/**
 * 此处添加该类的概要说明
 * @author      zhongwenyue
 * @version     1.0
 * @Project 	gateway
 * @Package	    gateway	
 * @Title	    Gateway.java
 * @Email		zhongwenyue@atlasdata.com.cn
 * @modified	
 * @date		2018年3月5日 上午10:43:17
 * @Copyright   海量云图(北京)数据技术有限公司
 * @Description 此处添加该类的详细说明
 */
@SpringBootApplication
@EnableZuulProxy
@EnableEurekaClient
public class Gateway {
	 public static void main(String[] args) {
	        SpringApplication.run(Gateway.class, args);
	    }
}
