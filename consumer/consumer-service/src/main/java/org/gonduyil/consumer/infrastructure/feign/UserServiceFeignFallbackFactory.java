package org.gonduyil.consumer.infrastructure.feign;

import com.google.common.base.Throwables;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserServiceFeignFallbackFactory implements FallbackFactory<UserDetailFeignService> {
    @Override
    public UserDetailFeignService create(Throwable cause) {
        log.error("createError|e:{}", Throwables.getStackTraceAsString(cause));
        return null;
    }
}
