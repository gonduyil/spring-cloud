package org.gonduyil.provider.facade;

import lombok.extern.slf4j.Slf4j;
import org.gonduyil.consumer.provider.GetUserDetailReq;
import org.gonduyil.consumer.provider.UserDetailRes;
import org.gonduyil.consumer.provider.service.UserServiceFeign;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserServiceFeignImpl implements UserServiceFeign {
    @Override
    public UserDetailRes getUserDetail(final GetUserDetailReq req) {
        log.info("getUserDetail|req:{}", req);
        return UserDetailRes.builder().id(1L).username("test123").build();
    }
}
