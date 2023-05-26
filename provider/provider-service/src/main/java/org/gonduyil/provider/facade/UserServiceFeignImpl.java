package org.gonduyil.provider.facade;

import lombok.extern.slf4j.Slf4j;
import org.gonduyil.provider.client.req.GetUserDetailReq;
import org.gonduyil.provider.client.res.UserDetailRes;
import org.gonduyil.provider.client.service.UserServiceFeign;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class UserServiceFeignImpl implements UserServiceFeign {
    @Override
    public UserDetailRes getUserDetail(final GetUserDetailReq req) {
        log.info("getUserDetail|req:{}", req);
        return UserDetailRes.builder().id(1L).username("test123").build();
    }

    @Override
    public UserDetailRes getUserDetail2(final GetUserDetailReq req) {

        try {
            Thread.sleep(100*1000L);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        if (1==1) {
            throw new RuntimeException();

        }
        return null;
    }
}
