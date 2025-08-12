package com.hmall.api.client;


import com.hmall.api.dto.ItemDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Collection;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 *
 * @Author: zhangyu
 * @Date: 2025/08/11/16:33
 * @Description:
 */
@FeignClient("item-service")
public interface ItemClient {
    @GetMapping("/items")
    List<ItemDTO> queryItemByIds(@RequestParam("ids") Collection<Long> ids);
}