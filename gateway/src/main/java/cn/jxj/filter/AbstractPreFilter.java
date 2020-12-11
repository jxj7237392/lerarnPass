package cn.jxj.filter;

import cn.jxj.vo.RestResult;
import com.alibaba.fastjson.JSONObject;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.core.io.buffer.DataBuffer;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpResponse;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.nio.charset.StandardCharsets;

public abstract class AbstractPreFilter {

    public abstract Mono<Void> doFilter(ServerWebExchange exchange, GatewayFilterChain chain);


    protected Mono<Void> processResponse(ServerHttpResponse response, String errorText, HttpStatus status, String code) {
        RestResult restResult = RestResult.fail(errorText);
        restResult.setCode(code);
        String content = JSONObject.toJSONString(restResult);
        response.setStatusCode(status);
        byte[] bytes = content.getBytes(StandardCharsets.UTF_8);
        DataBuffer buffer = response.bufferFactory().wrap(bytes);
        response.getHeaders().add("Content-Type", "application/json;charset=UTF-8");
        return response.writeWith(Mono.just(buffer));
    }
}
