package org.gonduyil.consumer.controller;

import lombok.extern.slf4j.Slf4j;
import org.gonduyil.consumer.infrastructure.feign.UserDetailFeignService;
import org.gonduyil.provider.client.req.GetUserDetailReq;
import org.gonduyil.provider.client.res.UserDetailRes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestController
@Slf4j
public class ConsumerTestController {

    @Autowired
    private UserDetailFeignService userDetailFeignService;

    @GetMapping("test1")
    public UserDetailRes test() {
        log.info("test1|thread:{}", Thread.currentThread().getName());
        UserDetailRes userDetail = userDetailFeignService.getUserDetail(new GetUserDetailReq());
        return userDetail;
    }

    @GetMapping("test2")
    public UserDetailRes testNo(HttpServletRequest httpServletRequest, HttpServletResponse servletResponse) {


        log.info("test2|thread:{}", Thread.currentThread().getName());
        UserDetailRes userDetail = userDetailFeignService.getUserDetail2(new GetUserDetailReq());

        if (1==1) {
            servletResponse.setStatus(400);
        }
        return userDetail;
    }
}
