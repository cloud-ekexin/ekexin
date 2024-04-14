-- 系统菜单表
DROP TABLE IF EXISTS `sys_menu`;
CREATE TABLE `sys_menu`
(
    `id`           INT UNSIGNED PRIMARY KEY AUTO_INCREMENT NOT NULL COMMENT '物理主键',
    `fk_parent_id` INT UNSIGNED                            NULL COMMENT '父菜单ID',
    `code`         CHAR(12)                                NOT NULL COMMENT '编号',
    `name`         VARCHAR(100)                            NOT NULL COMMENT '名称',
    `description`  VARCHAR(100)                            NOT NULL COMMENT '描述',
    `url`          VARCHAR(100)                            NOT NULL COMMENT '地址',
    `parameter`    VARCHAR(100)                            NULL COMMENT '参数',
    `show_flag`    TINYINT(1) DEFAULT 1                    NOT NULL COMMENT '是否显示（0-不显示，1-显示）',
    `sequence`     INT UNSIGNED                            NULL COMMENT '序号',
    `icon`         VARCHAR(100)                            NULL COMMENT '图标',
    `remark`       TEXT                                    NULL COMMENT '备注信息',
    `deleted_time` DATETIME                                NULL COMMENT '删除时间',
    `created_time` DATETIME   DEFAULT CURRENT_TIMESTAMP    NOT NULL COMMENT '创建时间',
    `created_by`   INT UNSIGNED                            NOT NULL COMMENT '创建人ID',
    `updated_time` DATETIME   DEFAULT CURRENT_TIMESTAMP    NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `updated_by`   INT UNSIGNED                            NOT NULL COMMENT '更新人ID',
    CONSTRAINT `uk_code` UNIQUE (`code`)
) COMMENT '系统菜单表' COLLATE = `utf8mb4_bin`
                       ROW_FORMAT = DYNAMIC;


-- 系统字典表
CREATE TABLE `sys_dictionary`
(
    `id`           INT UNSIGNED PRIMARY KEY AUTO_INCREMENT NOT NULL COMMENT '物理主键',
    `code`         VARCHAR(200)                            NOT NULL COMMENT '编号',
    `name`         VARCHAR(500)                            NOT NULL COMMENT '名称',
    `remark`       TEXT                                    NULL COMMENT '备注信息',
    `deleted_time` DATETIME                                NULL COMMENT '删除时间',
    `created_time` DATETIME DEFAULT CURRENT_TIMESTAMP      NOT NULL COMMENT '创建时间',
    `created_by`   INT UNSIGNED                            NOT NULL COMMENT '创建人ID',
    `updated_time` DATETIME DEFAULT CURRENT_TIMESTAMP      NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `updated_by`   INT UNSIGNED                            NOT NULL COMMENT '更新人ID',
    CONSTRAINT `uk_code` UNIQUE (`code`)
) COMMENT '系统字典表' COLLATE = `utf8mb4_bin`
                       ROW_FORMAT = DYNAMIC;


-- 系统字典明细表
CREATE TABLE `sys_dictionary_list`
(
    `id`               INT UNSIGNED PRIMARY KEY AUTO_INCREMENT NOT NULL COMMENT '物理主键',
    `fk_dictionary_id` INT UNSIGNED                            NOT NULL COMMENT '系统字典ID',
    `option_key`       INT UNSIGNED                            NOT NULL COMMENT '编号',
    `option_value`     VARCHAR(500)                            NOT NULL COMMENT '名称',
    `sequence`         INT UNSIGNED                            NULL COMMENT '序号',
    `remark`           TEXT                                    NULL COMMENT '备注信息',
    `deleted_time`     DATETIME                                NULL COMMENT '删除时间',
    `created_time`     DATETIME DEFAULT CURRENT_TIMESTAMP      NOT NULL COMMENT '创建时间',
    `created_by`       INT UNSIGNED                            NOT NULL COMMENT '创建人ID',
    `updated_time`     DATETIME DEFAULT CURRENT_TIMESTAMP      NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `updated_by`       INT UNSIGNED                            NOT NULL COMMENT '更新人ID'
) COMMENT '系统字典明细表' COLLATE = `utf8mb4_bin`
                           ROW_FORMAT = DYNAMIC;


-- 产品表
CREATE TABLE `inv_product`
(
    `id`              INT UNSIGNED PRIMARY KEY AUTO_INCREMENT  NOT NULL COMMENT '物理主键',
    `code`            CHAR(12)                                 NOT NULL COMMENT '编号',
    `name`            VARCHAR(100)                             NOT NULL COMMENT '名称',
    `pinyin_name`     VARCHAR(100)                             NOT NULL COMMENT '拼音名称',
    `alias_name`      VARCHAR(100)                             NULL COMMENT '别名',
    `bar_code`        VARCHAR(100)                             NOT NULL COMMENT '条码',
    `specification`   VARCHAR(100)                             NULL COMMENT '规格',
    `model`           VARCHAR(100)                             NULL COMMENT '型号',
    `register_number` VARCHAR(100)                             NULL COMMENT '批准文号',
    `qa_time`         INT UNSIGNED   DEFAULT 0                 NOT NULL COMMENT '保质期时间（天）',
    `class_code`      VARCHAR(100)                             NULL COMMENT '分类编码',
    `brand_code`      VARCHAR(100)                             NULL COMMENT '品牌编码',
    `default_price`   DECIMAL(27, 4) DEFAULT 0.0000            NOT NULL COMMENT '单价',
    `base_pack_name`  VARCHAR(100)                             NULL COMMENT '商品基准包装单位名称',
    `remark`          TEXT                                     NULL COMMENT '备注信息',
    `deleted_time`    DATETIME                                 NULL COMMENT '删除时间',
    `created_time`    DATETIME       DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    `created_by`      INT UNSIGNED                             NOT NULL COMMENT '创建人ID',
    `updated_time`    DATETIME       DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `updated_by`      INT UNSIGNED                             NOT NULL COMMENT '更新人ID',
    CONSTRAINT `uk_code` UNIQUE (`code`)
) COMMENT '产品表' COLLATE = `utf8mb4_bin`
                   ROW_FORMAT = DYNAMIC;

CREATE INDEX `idx_code` ON `inv_product` (`code`);
CREATE INDEX `idx_name` ON `inv_product` (`name`);
CREATE INDEX `idx_pinyin_name` ON `inv_product` (`pinyin_name`);
CREATE INDEX `idx_alias_name` ON `inv_product` (`alias_name`);


-- 公司表
CREATE TABLE `inv_company`
(
    `id`             INT UNSIGNED PRIMARY KEY AUTO_INCREMENT NOT NULL COMMENT '物理主键',
    `code`           CHAR(12)                                NULL COMMENT '编号',
    `name`           VARCHAR(100)                            NOT NULL COMMENT '名称',
    `pinyin_name`    VARCHAR(100)                            NOT NULL COMMENT '拼音名称',
    `alias_name`     VARCHAR(100)                            NULL COMMENT '别名',
    `company_type`   TINYINT(1)                              NOT NULL COMMENT '公司类型',
    `address`        VARCHAR(100)                            NULL COMMENT '地址',
    `tax_no`         VARCHAR(100)                            NULL COMMENT '税号',
    `bank_no`        VARCHAR(100)                            NULL COMMENT '开户行账号',
    `bank_name`      VARCHAR(100)                            NULL COMMENT '开户行名称',
    `link_man`       VARCHAR(100)                            NULL COMMENT '联系人',
    `link_man_phone` VARCHAR(100)                            NULL COMMENT '联系人电话',
    `remark`         TEXT                                    NULL COMMENT '备注信息',
    `deleted_time`   DATETIME                                NULL COMMENT '删除时间',
    `created_time`   DATETIME DEFAULT CURRENT_TIMESTAMP      NOT NULL COMMENT '创建时间',
    `created_by`     INT UNSIGNED                            NOT NULL COMMENT '创建人ID',
    `updated_time`   DATETIME DEFAULT CURRENT_TIMESTAMP      NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `updated_by`     INT UNSIGNED                            NOT NULL COMMENT '更新人ID',
    CONSTRAINT `uk_code` UNIQUE (`code`)
) COMMENT '供应商表' COLLATE = `utf8mb4_bin`
                     ROW_FORMAT = DYNAMIC;

CREATE INDEX `idx_code` ON `inv_company` (`code`);
CREATE INDEX `idx_name` ON `inv_company` (`name`);
CREATE INDEX `idx_pinyin_name` ON `inv_company` (`pinyin_name`);
CREATE INDEX `idx_alias_name` ON `inv_company` (`alias_name`);


-- 单据表
CREATE TABLE `inv_receipt`
(
    `id`            INT UNSIGNED PRIMARY KEY AUTO_INCREMENT NOT NULL COMMENT '物理主键',
    `code`          CHAR(12)                                NULL COMMENT '编号',
    `receipt_type`  TINYINT                                 NOT NULL COMMENT '单据类型（0-盘盈入库、1-手动入库、2-手动出库、9-盘亏出库、10-报损出库）',
    `fk_company_id` INT UNSIGNED                            NOT NULL COMMENT '企业ID',
    `status`        TINYINT(1) DEFAULT 0                    NOT NULL COMMENT '单据状态（0-新建、1-提交）',
    `deleted_time`  DATETIME                                NULL COMMENT '删除时间',
    `created_time`  DATETIME   DEFAULT CURRENT_TIMESTAMP    NOT NULL COMMENT '创建时间',
    `created_by`    INT UNSIGNED                            NOT NULL COMMENT '创建人ID',
    `updated_time`  DATETIME   DEFAULT CURRENT_TIMESTAMP    NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `updated_by`    INT UNSIGNED                            NOT NULL COMMENT '更新人ID',
    CONSTRAINT `uk_code` UNIQUE (`code`)
) COMMENT '单据表' COLLATE = `utf8mb4_bin`
                   ROW_FORMAT = DYNAMIC;


-- 单据明细表
CREATE TABLE `inv_receipt_detail`
(
    `id`            INT UNSIGNED PRIMARY KEY AUTO_INCREMENT  NOT NULL COMMENT '物理主键',
    `fk_product_id` BIGINT UNSIGNED                          NOT NULL COMMENT '商品ID',
    `fk_company_id` INT UNSIGNED                             NOT NULL COMMENT '企业ID',
    `receipt_type`  TINYINT                                  NOT NULL COMMENT '单据类型（0-盘盈入库、1-手动入库、2-手动出库、9-盘亏出库、10-报损出库）',
    `batch_number`  VARCHAR(100)                             NOT NULL COMMENT '批号',
    `product_date`  DATETIME                                 NOT NULL COMMENT '生产日期',
    `valid_date`    DATETIME                                 NOT NULL COMMENT '有效日期',
    `price`         DECIMAL(27, 4) DEFAULT 0.0000            NOT NULL COMMENT '单价',
    `quantity`      DECIMAL(27, 4) DEFAULT 0.0000            NOT NULL COMMENT '数量',
    `amount`        DECIMAL(27, 4) DEFAULT 0.0000            NOT NULL COMMENT '金额',
    `status`        TINYINT(1)     DEFAULT 0                 NOT NULL COMMENT '单据状态（0-新建、1-提交）',
    `deleted_time`  DATETIME                                 NULL COMMENT '删除时间',
    `created_time`  DATETIME       DEFAULT CURRENT_TIMESTAMP NOT NULL COMMENT '创建时间',
    `created_by`    INT UNSIGNED                             NOT NULL COMMENT '创建人ID',
    `updated_time`  DATETIME       DEFAULT CURRENT_TIMESTAMP NOT NULL ON UPDATE CURRENT_TIMESTAMP COMMENT '更新时间',
    `updated_by`    INT UNSIGNED                             NOT NULL COMMENT '更新人ID'
) COMMENT '单据明细表' COLLATE = `utf8mb4_bin`
                       ROW_FORMAT = DYNAMIC;

