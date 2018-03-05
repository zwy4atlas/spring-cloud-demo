package discovery;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


/**
 * 此处添加该类的概要说明
 * @author      zhongwenyue
 * @version     1.0
 * @Project 	discovery
 * @Package	    discovery	
 * @Title	    Discovery.java
 * @Email		zhonGwenyue@atlasdata.com.cn
 * @modified	
 * @date		2018年3月2日 下午5:53:44
 * @Copyright   海量云图(北京)数据技术有限公司
 * @Description 此处添加该类的详细说明
 */
@SpringBootApplication
@EnableEurekaServer
public class Discovery {
    public static void main(String[] args) {
        SpringApplication.run(Discovery.class, args);
    }
}
