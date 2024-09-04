package org.example.feign.interfaces;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * Create by Administrator
 * Data 12:04 2021/12/16 星期四
 */
//@FeignClient(value = "provider-user", url = "http://123.249.43.78:7900/")
@FeignClient(value = "provider-user")
public interface ProviderUserFeign {

    @GetMapping("/user/hello/{name}")
    String hi(@PathVariable(name = "name") String name);

}
