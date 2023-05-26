package org.gonduyil.consumer.infrastructure.feign;

import lombok.extern.slf4j.Slf4j;
import org.gonduyil.provider.client.req.GetUserDetailReq;
import org.gonduyil.provider.client.res.UserDetailRes;
import org.gonduyil.provider.client.service.UserServiceFeign;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class UserServiceFeignFallback implements UserDetailFeignService {
    @Override
    public UserDetailRes getUserDetail(final GetUserDetailReq req) {
        log.error("service circuit break");
        return null;
    }

    @Override
    public UserDetailRes getUserDetail2(final GetUserDetailReq req) {
        log.error("test2|service circuit break");

        return null;
    }
}
