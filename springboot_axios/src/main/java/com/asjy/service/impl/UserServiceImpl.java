package com.asjy.service.impl;

import com.asjy.mapper.UserMapper;
import com.asjy.pojo.User;
import com.asjy.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * ClassName: UserServiceImpl
 * Package: com.asjy.service.impl
 * Description:
 *
 * @Author 梓维李
 * @Create 2023/2/26 15:57
 * @Version 2.0
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {
}
