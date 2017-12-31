package pers.east.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ServiceZuulApplication {

    /**
     * Zuul的主要功能是路由转发和过滤器。
     * 路由功能是微服务的一部分，
     * 比如
     * ／api/user转发到到user服务，
     * /api/shop转发到到shop服务。
     * zuul默认和Ribbon结合实现了负载均衡的功能。
     */

	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulApplication.class, args);
	}
}
