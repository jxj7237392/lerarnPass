package cn.jxj.filter;

import cn.jxj.exception.BizException;
import cn.jxj.vo.RestResult;
import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;
import java.util.List;

/**
 * @Author: jxj
 * @Date: 2020/12/8 13:33
 */
//@Component
public class MyFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        /*List<String> token = exchange.getRequest().getQueryParams().get("token");
        if (CollectionUtils.isEmpty(token)) {
            ServerHttpResponse response = exchange.getResponse();
            RestResult restResult = RestResult.fail("参数丢失");
            restResult.setCode(String.valueOf(HttpStatus.UNAUTHORIZED.value()));
            String content = JSONObject.toJSONString(restResult);
            response.setStatusCode(HttpStatus.UNAUTHORIZED);
            byte[] bytes = content.getBytes(StandardCharsets.UTF_8);
            DataBuffer buffer = response.bufferFactory().wrap(bytes);
            response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
            return response.writeWith(Mono.just(buffer));
        }*/
        return chain.filter(exchange);
    }

}
