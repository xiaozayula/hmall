package com.hmall.api.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhangyu
 * @Date: 2025/08/12/16:33
 * @Description:
 */
@FeignClient("cart-service")
public interface CartClient {
    @DeleteMapping("/carts")
     void deleteCartItemByIds(@RequestParam("ids") Collection<Long> ids);
}
