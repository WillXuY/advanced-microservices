package org.willxu.helloh2jpa.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.willxu.helloh2jpa.entity.UserInfo;
import org.willxu.helloh2jpa.service.UserInfoWriteService;

@RestController
public class WriteController {
    private final ObjectMapper objectMapper;

    private final UserInfoWriteService userInfoWriteService;

    public WriteController(UserInfoWriteService userInfoWriteService) {
        this.userInfoWriteService = userInfoWriteService;
        this.objectMapper = new ObjectMapper();
    }

    @GetMapping("/addUser")
    public String addUser(@RequestParam String username, @RequestParam String nickname) throws JsonProcessingException {
        UserInfo userInfo = new UserInfo();
        userInfo.setUsername(username);
        userInfo.setNickname(nickname);
        UserInfo userAdded = userInfoWriteService.addUser(userInfo);
        return objectMapper.writeValueAsString(userAdded);
    }
}
