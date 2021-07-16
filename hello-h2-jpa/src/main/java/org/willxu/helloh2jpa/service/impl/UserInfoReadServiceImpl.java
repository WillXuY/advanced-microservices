package org.willxu.helloh2jpa.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.willxu.helloh2jpa.entity.UserInfo;
import org.willxu.helloh2jpa.repository.UserInfoRepository;
import org.willxu.helloh2jpa.service.UserInfoReadService;

@Service
public class UserInfoReadServiceImpl implements UserInfoReadService {
    private final UserInfoRepository userInfoRepository;

    @Autowired
    public UserInfoReadServiceImpl(UserInfoRepository userInfoRepository) {
        this.userInfoRepository = userInfoRepository;
    }

    @Override
    public UserInfo getUserInfoById(Long userInfoId) {
        return userInfoRepository.getOne(userInfoId);
    }
}
