package pers.east.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @Author : east.Fu
 * @Description :
 * @Date : Created in  2017/12/30 16:24
 */
@Component
public class SchedualServiceHiHystric implements SchedualServiceHi{

    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}
