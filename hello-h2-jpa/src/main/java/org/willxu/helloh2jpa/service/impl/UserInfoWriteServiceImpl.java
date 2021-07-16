package org.willxu.helloh2jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.willxu.helloh2jpa.entity.UserInfo;
import org.willxu.helloh2jpa.repository.UserInfoRepository;
import org.willxu.helloh2jpa.service.UserInfoWriteService;

@Service
public class UserInfoWriteServiceImpl implements UserInfoWriteService {
    private final UserInfoRepository userInfoRepository;

    @Autowired
    public UserInfoWriteServiceImpl(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @Override
    public UserInfo addUser(UserInfo userInfo) {
        return userInfoRepository.save(userInfo);
    }
}
