package pers.east.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.sleuth.sampler.AlwaysSampler;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.logging.Level;
import java.util.logging.Logger;

@SpringBootApplication
//@EnableEurekaClient
@RestController
public class ServiceHiApplication {

    private static final Logger LOG = Logger.getLogger(ServiceHiApplication.class.getName());


	public static void main(String[] args) {
		SpringApplication.run(ServiceHiApplication.class, args);
	}

//
//    @Value("${server.port}")
//    String port;
//
//    @RequestMapping("/hi")
//    public String home(@RequestParam String name) {
//        return "hi "+name+",i am from port:" +port;
//    }


    
    @Autowired
    private RestTemplate restTemplate;

    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

    @RequestMapping("/hi")
    public String callHome(){
        LOG.log(Level.INFO, "calling trace service-hi  ");
        return restTemplate.getForObject("http://localhost:8989/hi", String.class);
    }
    @RequestMapping("/info1")
    public String info(){
        LOG.log(Level.INFO, "calling trace service-hi ");
        return "i'm service-hi";

    }

    @Bean
    public AlwaysSampler defaultSampler(){
        return new AlwaysSampler();
    }
}
