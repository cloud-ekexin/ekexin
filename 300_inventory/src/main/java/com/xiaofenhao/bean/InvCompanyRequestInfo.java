package com.xiaofenhao.bean;

import com.xiaofenhao.common.page.PagedRequestInfo;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 获取公司分页数据请求参数
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/14
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class InvCompanyRequestInfo extends PagedRequestInfo {

    private static final long serialVersionUID = -7218304056368340901L;

    /**
     * 公司编号
     */
    private String codeLike;
    /**
     * 公司名称
     */
    private String nameLike;
    /**
     * 公司类型
     */
    private Short companyType;
    /**
     * 公司地址
     */
    private String addressLike;
    /**
     * 联系人
     */
    private String linkManLike;
    /**
     * 联系人电话
     */
    private String linkManPhoneLike;
}
