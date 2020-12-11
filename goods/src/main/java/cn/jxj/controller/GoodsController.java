package cn.jxj.controller;

import cn.jxj.client.OrderClient;
import cn.jxj.entity.Good;
import cn.jxj.entity.KaUser;
import cn.jxj.entity.Order;
import cn.jxj.service.KaUserService;
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
@RequestMapping("/good")
public class GoodsController {

    @Autowired
    private OrderClient orderClient;

    @Autowired
    private KaUserService userService;

    @GetMapping("/hashGood")
    public RestResult<String> hashOrder() {
        return RestResult.success("we have a lot goods");
    }

    @GetMapping("/getGoods")
    public RestResult<List<Good>> getGoods() {
        Good good = new Good();
        good.setId(1);
        good.setOrderId(1);
        good.setPrice(new BigDecimal("1000"));
        good.setDescription("这是第一个商品");
        return RestResult.success(Lists.newArrayList(good));
    }

    @GetMapping("/feignClientTest")
    public RestResult<List<Order>> feignClientTest() {
        RestResult<List<Order>> orders = orderClient.getOrders();
        List<KaUser> list = userService.list();
        return orders;
    }

}
