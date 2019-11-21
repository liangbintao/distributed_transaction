package com.example.mapper.db2;

import com.example.po.db1.UserPO;
import com.example.po.db2.GradePO;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

/**
 * @Description TODO
 * @Author bingfeng
 * @Date 2019/11/20 18:23
 */
@Component
public interface IGradeMapper extends Mapper<GradePO> {

    @Select("select * from grade where user_id = #{userId}")
    GradePO getGradeByUserId(String userId);
}
