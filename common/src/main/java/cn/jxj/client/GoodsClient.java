package cn.jxj.client;

import cn.jxj.entity.Good;
import cn.jxj.entity.Order;
import cn.jxj.vo.RestResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @Author: jxj
 * @Date: 2020/12/11 14:33
 */
@FeignClient(contextId = "goodsClient", value = "goodsServer")
public interface GoodsClient {
    @GetMapping("/good/hashGood")
     RestResult<String> hashOrder();


    @GetMapping("/good/getGoods")
    RestResult<List<Good>> getGoods();


}
