package cn.jxj.controller;

import cn.hutool.core.bean.BeanUtil;
import cn.jxj.client.GoodsClient;
import cn.jxj.entity.Good;
import cn.jxj.entity.Order;
import cn.jxj.entity.OrderTest;
import cn.jxj.service.OrderTestService;
import cn.jxj.service.impl.OrderTestServiceImpl;
import cn.jxj.vo.OrderTestVo;
import cn.jxj.vo.RestResult;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Author: jxj
 * @Date: 2020/12/7 14:35
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private GoodsClient goodsClient;

    @Autowired
    private OrderTestService orderTestService;



    @GetMapping("/hashOrder")
    public RestResult<String> hashOrder() {
        return RestResult.success("we have a lot orders");
    }

    @GetMapping("/getOrders")
    public RestResult<List<OrderTest>> getOrders() {
        List<OrderTest> list = orderTestService.list();
        List<OrderTestVo> collect = list.stream().map(OrderTestServiceImpl::apply).collect(Collectors.toList());
        return RestResult.success(collect);
    }

    @GetMapping("/feignClientTest")
    public RestResult<List<Good>> feignClientTest() {
        RestResult<List<Good>> goods = goodsClient.getGoods();
        return goods;
    }

    @PostMapping("/saveOrder")
    public RestResult saveOrder() {
        orderTestService.saveOrder();
        return RestResult.success();
    }


}
