package org.gonduyil.consumer.infrastructure.feign;

import org.gonduyil.provider.client.service.UserServiceFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@Service
@FeignClient(
        name = "provider",
        url = "localhost:8080",
       // fallback = UserServiceFeignFallback.class,
        fallbackFactory = UserServiceFeignFallbackFactory.class
)
public interface UserDetailFeignService extends UserServiceFeign {
}
