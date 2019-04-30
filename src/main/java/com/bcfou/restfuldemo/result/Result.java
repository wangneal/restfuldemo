package com.bcfou.restfuldemo.result;

import com.bcfou.restfuldemo.entity.Persion;

import java.util.List;

/**
 * @author: wangneal
 * @Date: 2019/4/30 10:18
 * @Description:
 * json格式是
 *  * {
 *  *     success: true,
 *  *     data: {
 *  *         name: zhangsan,
 *  *         age: 10
 *  *     }
 *  *     {
 *  *         name: lisi,
 *  *         age: 11
 *  *     }
 */
public class Result {
    private Boolean success = true;

    List<Persion> data;

    public Boolean getSuccess() {
        return success;
    }

    public void setSuccess(Boolean success) {
        this.success = success;
    }

    public List<Persion> getData() {
        return data;
    }

    public void setData(List<Persion> data) {
        this.data = data;
    }
}
