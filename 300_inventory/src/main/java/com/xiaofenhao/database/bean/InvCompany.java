package com.xiaofenhao.database.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 供应商表
 *
 * @author generator
 * @version 0.0.1
 * @date 2024-04-14 12:21:34
 */
@Data
public class InvCompany implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物理主键
     */
    private Integer id;
    /**
     * 编号
     */
    private String code;
    /**
     * 名称
     */
    private String name;
    /**
     * 拼音名称
     */
    private String pinyinName;
    /**
     * 别名
     */
    private String aliasName;
    /**
     * 公司类型
     */
    private Integer companyType;
    /**
     * 地址
     */
    private String address;
    /**
     * 税号
     */
    private String taxNo;
    /**
     * 开户行账号
     */
    private String bankNo;
    /**
     * 开户行名称
     */
    private String bankName;
    /**
     * 联系人
     */
    private String linkMan;
    /**
     * 联系人电话
     */
    private String linkManPhone;
    /**
     * 备注信息
     */
    private String remark;
    /**
     * 删除时间
     */
    private Date deletedTime;
    /**
     * 创建时间
     */
    private Date createdTime;
    /**
     * 创建人ID
     */
    private Integer createdBy;
    /**
     * 更新时间
     */
    private Date updatedTime;
    /**
     * 更新人ID
     */
    private Integer updatedBy;
}
