package com.forezp.servicefeign.clients;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 *
 * 1，首先使用Feign的时候，定义一个接口，接口的定义一个注解@FeignClient(),指名对应的调用服务
 * 2，定义一个方法，指定对应的方法的调用参数数据信息和对应的需要调用的服务保持一致
 * Email miles02@163.com
 *
 * @author fangzhipeng
 * create 2018-07-09
 **/
@FeignClient(value = "service-hi")
public interface SchedualServiceHi {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);
}

