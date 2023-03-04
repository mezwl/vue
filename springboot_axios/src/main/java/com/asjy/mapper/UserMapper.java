package com.asjy.mapper;

import com.asjy.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * ClassName: UserMapper
 * Package: com.asjy.mapper
 * Description:
 *
 * @Author 梓维李
 * @Create 2023/2/26 15:56
 * @Version 2.0
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
}
