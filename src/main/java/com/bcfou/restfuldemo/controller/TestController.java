package com.bcfou.restfuldemo.controller;

import com.bcfou.restfuldemo.entity.Persion;
import com.bcfou.restfuldemo.result.Result;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author: wangneal
 * @Date: 2019/4/30 10:19
 * @Description:
 */
@RestController
public class TestController {

    @GetMapping("/test")
    public Result test(){
        Result result = new Result();
        Persion persion = new Persion();
        List<Persion> persions = new ArrayList<>();
        persion.setName("zhangsan");
        persion.setAge(10);
        persions.add(persion);
        Persion persion1 = new Persion();
        persion1.setName("lisi");
        persion1.setAge(11);
        persions.add(persion1);
        result.setData(persions);
        return result;
    }
}
