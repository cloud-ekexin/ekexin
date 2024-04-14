package com.xiaofenhao.service;

import com.xiaofenhao.bean.InvCompanyRequestInfo;
import com.xiaofenhao.bean.InvCompanyResponseInfo;
import com.xiaofenhao.common.page.PagedResponseInfo;

/**
 * 公司信息
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/14
 */
public interface InvCompanyService {

    /**
     * 获取公司分页数据
     *
     * @param paramBean 请求参数
     * @return 公司分页数据
     */
    PagedResponseInfo<InvCompanyResponseInfo> getPagedInvCompany(InvCompanyRequestInfo paramBean);
}
