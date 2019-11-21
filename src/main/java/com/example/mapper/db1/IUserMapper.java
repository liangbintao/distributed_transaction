package com.example.mapper.db1;

import com.example.po.db1.UserPO;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Description TODO
 * @Author bingfeng
 * @Date 2019/11/20 18:25
 */
@Component
public interface IUserMapper extends Mapper<UserPO> {
}
