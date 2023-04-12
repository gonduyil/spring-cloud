package org.gonduyil.consumer.provider.service;

import org.gonduyil.consumer.provider.GetUserDetailReq;
import org.gonduyil.consumer.provider.UserDetailRes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserServiceFeign {

    @PostMapping("/user/detail")
    UserDetailRes getUserDetail(@RequestBody GetUserDetailReq req);
}
