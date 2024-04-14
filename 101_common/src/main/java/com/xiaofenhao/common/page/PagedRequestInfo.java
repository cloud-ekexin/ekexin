package com.xiaofenhao.common.page;

import lombok.Data;

import java.io.Serializable;

/**
 * 分页请求通用类
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/13
 */
@Data
public class PagedRequestInfo implements Serializable {

    private static final long serialVersionUID = -4736192510502130018L;

    /**
     * 当前页码
     */
    private Integer pageNum = 1;
    /**
     * 页大小
     */
    private Integer pageSize = 10;
    /**
     * 排序字段
     */
    private String sortString;
}
