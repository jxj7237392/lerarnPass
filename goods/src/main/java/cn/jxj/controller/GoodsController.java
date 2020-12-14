package cn.jxj.controller;

import cn.jxj.client.OrderClient;
import cn.jxj.entity.Good;
import cn.jxj.entity.KaUser;
import cn.jxj.service.KaUserService;
import cn.jxj.vo.RestResult;
import com.google.common.collect.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.HashMap;
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
    private RestTemplate restTemplate;


    @Autowired
    private KaUserService kaUserService;

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
    @Transactional
    public RestResult feignClientTest() {
//        RestResult<List<OrderTestVo>> orders = orderClient.getOrders();
        KaUser kaUser = new KaUser();
        kaUser.setName("888");
        kaUserService.save(kaUser);
//        RestResult restResult = orderClient.saveOrder();
        //设置访问参数
        HashMap<String, Object> params = new HashMap<>();
        HttpEntity entity = new HttpEntity(params);
        restTemplate.exchange("http://127.0.0.1:8500/api/orderServer/order/saveOrder", HttpMethod.POST, entity, RestResult.class);
        int a = 1 / 0;
        return RestResult.success("成功了");
    }

}
