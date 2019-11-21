package com.example.controller;

import com.example.mapper.db1.IUserMapper;
import com.example.mapper.db2.IGradeMapper;
import com.example.po.db1.UserPO;
import com.example.po.db2.GradePO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Description TODO
 * @Author bingfeng
 * @Date 2019/11/20 17:20
 */
@RestController
public class TestController {

    @Autowired
    private IUserMapper userMapper;

    @Autowired
    private IGradeMapper gradeMapper;


    @RequestMapping("/list")
    public Object list() {

        List<UserPO> userPOS = userMapper.selectAll();
        List<GradePO> gradePOS = gradeMapper.selectAll();

        Map<String, Object> result = new HashMap<>();
        result.put("userInfo", userPOS);
        result.put("gradeInfo", gradePOS);

        return result;
    }

    // @Transactional
    @RequestMapping("/update")
    public Object update(String userId, String username, Integer score) {

        UserPO user = userMapper.selectByPrimaryKey(userId);
        user.setUsername(username);

        userMapper.updateByPrimaryKeySelective(user);

        GradePO gradePO = gradeMapper.getGradeByUserId(userId);
        gradePO.setScore(score);

        gradeMapper.updateByPrimaryKeySelective(gradePO);

        // int i = 1/ 0;

        return "SUCCESS";
    }
}
