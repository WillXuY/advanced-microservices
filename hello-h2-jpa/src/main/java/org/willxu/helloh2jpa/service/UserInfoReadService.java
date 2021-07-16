package org.willxu.helloh2jpa.service;

import org.willxu.helloh2jpa.entity.UserInfo;

public interface UserInfoReadService {
    UserInfo getUserInfoById(Long userInfoId);
}
