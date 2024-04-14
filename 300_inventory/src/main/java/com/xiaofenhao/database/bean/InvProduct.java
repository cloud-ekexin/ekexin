package com.xiaofenhao.database.bean;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * 产品表
 *
 * @author generator
 * @version 0.0.1
 * @date 2024-04-14 12:21:34
 */
@Data
public class InvProduct implements Serializable {

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
     * 条码
     */
    private String barCode;
    /**
     * 规格
     */
    private String specification;
    /**
     * 型号
     */
    private String model;
    /**
     * 批准文号
     */
    private String registerNumber;
    /**
     * 保质期时间（天）
     */
    private Integer qaTime;
    /**
     * 分类编码
     */
    private String classCode;
    /**
     * 品牌编码
     */
    private String brandCode;
    /**
     * 单价
     */
    private BigDecimal defaultPrice;
    /**
     * 商品基准包装单位名称
     */
    private String basePackName;
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
