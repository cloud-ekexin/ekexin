package com.xiaofenhao.common.page;

import lombok.Data;
import lombok.NonNull;

import java.io.Serializable;
import java.util.List;

/**
 * 分页统一返回信息
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/13
 */
@Data
public class PagedResponseInfo<T> implements Serializable {

    private static final long serialVersionUID = -2858470910457677484L;

    /**
     * 总页数
     */
    private Integer totalPage;
    /**
     * 总记录数
     */
    private Long totalRecord;
    /**
     * 记录列表
     */
    private List<T> recordList;

    public PagedResponseInfo(@NonNull Integer totalPage, @NonNull Long totalRecord, @NonNull List<T> recordList) {
        this.totalPage = totalPage;
        this.totalRecord = totalRecord;
        this.recordList = recordList;
    }
}
