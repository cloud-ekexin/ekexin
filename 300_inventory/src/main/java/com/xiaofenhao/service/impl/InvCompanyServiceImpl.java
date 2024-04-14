package com.xiaofenhao.service.impl;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xiaofenhao.bean.InvCompanyRequestInfo;
import com.xiaofenhao.bean.InvCompanyResponseInfo;
import com.xiaofenhao.common.page.PagedResponseInfo;
import com.xiaofenhao.dao.InvCompanyDao;
import com.xiaofenhao.service.InvCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

/**
 * 公司信息
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/14
 */
@Service
public class InvCompanyServiceImpl implements InvCompanyService {

    @Autowired
    private InvCompanyDao invCompanyDao;

    /**
     * 获取公司分页数据
     *
     * @param paramBean 请求参数
     * @return 公司分页数据
     */
    @Override
    public PagedResponseInfo<InvCompanyResponseInfo> getPagedInvCompany(InvCompanyRequestInfo paramBean) {
        Map<String, Object> conditions = new HashMap<>();
        if (!StringUtils.isEmpty(paramBean.getCodeLike())) {
            conditions.put("codeLike", paramBean.getCodeLike());
        }
        if (!StringUtils.isEmpty(paramBean.getNameLike())) {
            conditions.put("nameLike", paramBean.getNameLike());
        }
        if (paramBean.getCompanyType() != null) {
            conditions.put("companyType", paramBean.getCompanyType());
        }
        if (!StringUtils.isEmpty(paramBean.getAddressLike())) {
            conditions.put("addressLike", paramBean.getAddressLike());
        }
        if (!StringUtils.isEmpty(paramBean.getLinkManLike())) {
            conditions.put("linkManLike", paramBean.getLinkManLike());
        }
        if (!StringUtils.isEmpty(paramBean.getLinkManPhoneLike())) {
            conditions.put("linkManPhoneLike", paramBean.getLinkManPhoneLike());
        }

        Page<InvCompanyResponseInfo> pagedInfo = PageHelper.startPage(paramBean.getPageNum(), paramBean.getPageSize())
                .doSelectPage(() -> invCompanyDao.getInvCompanyList(conditions));

        return new PagedResponseInfo<>(pagedInfo.getPages(), pagedInfo.getTotal(), pagedInfo.getResult());
    }
}
