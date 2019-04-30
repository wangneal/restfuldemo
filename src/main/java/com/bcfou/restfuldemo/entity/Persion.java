package com.bcfou.restfuldemo.entity;

import java.io.Serializable;

/**
 * @author: wangneal
 * @Date: 2019/4/30 10:15
 * @Description:
 * json格式是
 * {
 *     success: true,
 *     data: {
 *         name: zhangsan,
 *         age: 10
 *     }
 *     {
 *         name: lisi,
 *         age: 11
 *     }
 * }
 */
public class Persion implements Serializable {
    private static final long serialVersionUID = 3667503563149150428L;
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
