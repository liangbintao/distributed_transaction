package com.example.po.db1;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;

/**
 * @Description TODO
 * @Author bingfeng
 * @Date 2019/11/20 18:24
 */
@Data
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "user")
public class UserPO implements Serializable {

    @Id
    private String id;
    private String username;
    private String sex;
    private Integer age;
}
