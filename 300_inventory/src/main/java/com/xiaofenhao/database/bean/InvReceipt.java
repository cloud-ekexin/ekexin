package com.xiaofenhao.database.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * 单据表
 *
 * @author generator
 * @version 0.0.1
 * @date 2024-04-14 12:21:34
 */
@Data
public class InvReceipt implements Serializable {

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
     * 单据类型（0-盘盈入库、1-手动入库、2-手动出库、9-盘亏出库、10-报损出库）
     */
    private Integer receiptType;
    /**
     * 企业ID
     */
    private Integer companyId;
    /**
     * 单据状态（0-新建、1-提交）
     */
    private Integer status;
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
