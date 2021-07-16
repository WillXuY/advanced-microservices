package org.willxu.helloh2jpa.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.willxu.helloh2jpa.entity.UserInfo;
import org.willxu.helloh2jpa.service.UserInfoReadService;

@RestController
public class ReadController {
    private final ObjectMapper objectMapper;

    private final UserInfoReadService userInfoReadService;

    public ReadController(UserInfoReadService userInfoReadService) {
        this.userInfoReadService = userInfoReadService;
        this.objectMapper = new ObjectMapper();
    }

    @GetMapping("/getUserInfoById")
    public String getUserInfoById(@RequestParam Long userInfoId) throws JsonProcessingException {
        UserInfo userInfo = userInfoReadService.getUserInfoById(userInfoId);
        return objectMapper.writeValueAsString(userInfo);
    }
}
