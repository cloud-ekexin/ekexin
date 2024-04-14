package com.xiaofenhao.database.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 系统菜单表
 *
 * @author generator
 * @version 0.0.1
 * @date 2024-04-13 15:55:45
 */
@Data
public class SysMenu implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物理主键
     */
    private Integer id;
    /**
     * 父菜单ID
     */
    private Integer parentId;
    /**
     * 编号
     */
    private String code;
    /**
     * 名称
     */
    private String name;
    /**
     * 描述
     */
    private String description;
    /**
     * 地址
     */
    private String url;
    /**
     * 参数
     */
    private String parameter;
    /**
     * 是否显示（0-不显示，1-显示）
     */
    private Integer showFlag;
    /**
     * 序号
     */
    private Integer sequence;
    /**
     * 图标
     */
    private String icon;
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
