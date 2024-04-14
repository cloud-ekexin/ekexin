package com.xiaofenhao.database.bean;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;
import java.math.BigDecimal;

/**
 * 单据明细表
 *
 * @author generator
 * @version 0.0.1
 * @date 2024-04-14 12:21:34
 */
@Data
public class InvReceiptDetail implements Serializable {

    private static final long serialVersionUID = 1L;

    /**
     * 物理主键
     */
    private Integer id;
    /**
     * 商品ID
     */
    private Long productId;
    /**
     * 企业ID
     */
    private Integer companyId;
    /**
     * 单据类型（0-盘盈入库、1-手动入库、2-手动出库、9-盘亏出库、10-报损出库）
     */
    private Integer receiptType;
    /**
     * 批号
     */
    private String batchNumber;
    /**
     * 生产日期
     */
    private Date productDate;
    /**
     * 有效日期
     */
    private Date validDate;
    /**
     * 单价
     */
    private BigDecimal price;
    /**
     * 数量
     */
    private BigDecimal quantity;
    /**
     * 金额
     */
    private BigDecimal amount;
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
