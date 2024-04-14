package com.xiaofenhao.bean;

import lombok.Data;

import java.io.Serializable;

/**
 * 获取公司分页数据返回参数
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/14
 */
@Data
public class InvCompanyResponseInfo implements Serializable {

    private static final long serialVersionUID = -8779999007004667763L;

    /**
     * ID
     */
    private Integer id;
    /**
     * 公司编号
     */
    private String code;
    /**
     * 公司名称
     */
    private String name;
    /**
     * 公司类型名称
     */
    private String companyTypeName;
    /**
     * 公司地址
     */
    private String address;
    /**
     * 联系人
     */
    private String linkMan;
    /**
     * 联系人电话
     */
    private String linkManPhone;
    /**
     * 备注
     */
    private String remark;
}
