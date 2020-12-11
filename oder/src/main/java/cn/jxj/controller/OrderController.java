package cn.jxj.controller;

import cn.jxj.vo.RestResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: jxj
 * @Date: 2020/12/7 14:35
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/hashOrder")
    public RestResult hashOrder() {
        return RestResult.success("we have a lot orders");
    }
}
