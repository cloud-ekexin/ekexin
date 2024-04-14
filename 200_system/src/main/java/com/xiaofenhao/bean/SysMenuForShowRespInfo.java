package com.xiaofenhao.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 用于展示的系统菜单返回参数
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/13
 */
@Data
public class SysMenuForShowRespInfo implements Serializable {

    private static final long serialVersionUID = -8025788201731801239L;

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
     * 图标
     */
    private String icon;
    /**
     * 备注信息
     */
    private String remark;

    private List<SysMenuForShowRespInfo> children;
}
