package com.hmall.gateway.filters;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhangyu
 * @Date: 2025/08/13/16:16
 * @Description:
 */
@Component
public class MyGlobalFilter implements GlobalFilter , Ordered {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        // TODO: 模拟登录校验
        return chain.filter( exchange);
    }

    @Override
    public int getOrder() {
        return 0;
    }
}
