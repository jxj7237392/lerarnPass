package cn.jxj.client;

import cn.jxj.entity.Order;
import cn.jxj.vo.RestResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author: jxj
 * @Date: 2020/12/11 14:33
 */
@FeignClient(contextId = "orderClient", value = "orderServer")
public interface OrderClient {
    @GetMapping("/order/hashOrder")
    RestResult<String> hashOrder();

    @GetMapping("/order/getOrders")
    RestResult<List<Order>> getOrders();
}
