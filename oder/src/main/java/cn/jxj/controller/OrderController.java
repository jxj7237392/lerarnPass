package cn.jxj.controller;

import cn.jxj.client.GoodsClient;
import cn.jxj.entity.Good;
import cn.jxj.entity.Order;
import cn.jxj.vo.RestResult;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Author: jxj
 * @Date: 2020/12/7 14:35
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private GoodsClient goodsClient;

    @GetMapping("/hashOrder")
    public RestResult<String> hashOrder() {
        return RestResult.success("we have a lot orders");
    }

    @GetMapping("/getOrders")
    public RestResult<List<Order>> getOrders() {
        Order order = new Order();
        order.setId(1);
        order.setGoodId(1);
        order.setMoney(new BigDecimal("100"));
        order.setOrderNo("1");
        order.setRemark("这是第一笔订单");
        return RestResult.success(Lists.newArrayList(order));
    }


    @GetMapping("/feignClientTest")
    public RestResult<List<Good>> feignClientTest() {
        RestResult<List<Good>> goods = goodsClient.getGoods();
        return goods;
    }

}
