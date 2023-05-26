package org.gonduyil.provider.client.service;

import org.gonduyil.provider.client.req.GetUserDetailReq;
import org.gonduyil.provider.client.res.UserDetailRes;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

public interface UserServiceFeign {

    @PostMapping("/user/detail")
    UserDetailRes getUserDetail(@RequestBody GetUserDetailReq req);

    @PostMapping("/user/detail2")
    UserDetailRes getUserDetail2(@RequestBody GetUserDetailReq req);
}
