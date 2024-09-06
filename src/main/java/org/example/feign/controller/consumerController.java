package org.example.feign.controller;

import io.swagger.annotations.Api;
import org.example.feign.interfaces.CommonsFeign;
import org.example.feign.interfaces.ProviderUserFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by Administrator
 * Data 12:01 2021/12/16 星期四
 */
@Api(tags = "Feign测试")
@RestController
@RequestMapping("feign")
public class consumerController {

    @Autowired
    private ProviderUserFeign providerUserFeign;

    @Autowired
    private CommonsFeign commonsFeign;

    @PostMapping("/user/hi")
    public String userHi(@RequestParam String name){
        return this.providerUserFeign.hi(name);
    }

    @PostMapping("/commons/hi")
    public String commonsHi(@RequestParam String name){
        return this.commonsFeign.hi(name);
    }

}
