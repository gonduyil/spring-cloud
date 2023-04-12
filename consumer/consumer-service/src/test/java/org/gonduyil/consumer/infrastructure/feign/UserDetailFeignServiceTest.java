package org.gonduyil.consumer.infrastructure.feign;

import lombok.extern.slf4j.Slf4j;
import org.gonduyil.consumer.ConsumerApp;
import org.gonduyil.consumer.provider.UserDetailRes;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest(classes = ConsumerApp.class)
@Slf4j
class UserDetailFeignServiceTest {

    @Autowired
    UserDetailFeignService userDetailFeignService;

    @Test
    void test() {

        UserDetailRes userDetail = userDetailFeignService.getUserDetail(null);
        log.info("userDetail:{}", userDetail);
    }

}