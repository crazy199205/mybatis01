package com.shsxt.mapper;

import com.shsxt.po.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Administrator on 2019/5/30.
 */
public interface UserMapper {
    public List<User> queryUserByName(@Param("userName") String userName);

    public List<User> queryUserByNation(@Param("nation") String nation);
}
