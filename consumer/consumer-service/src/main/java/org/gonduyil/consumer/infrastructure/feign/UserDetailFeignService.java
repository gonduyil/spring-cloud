package org.gonduyil.consumer.infrastructure.feign;

import org.gonduyil.consumer.provider.service.UserServiceFeign;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;

@Service
@FeignClient(url = "localhost:8080")
public interface UserDetailFeignService extends UserServiceFeign {
}
