package org.willxu.helloh2jpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.willxu.helloh2jpa.entity.UserInfo;

public interface UserInfoRepository extends JpaRepository<UserInfo, Long> {
}
