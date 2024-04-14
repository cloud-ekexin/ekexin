package com.xiaofenhao.web;

import com.xiaofenhao.bean.InvCompanyRequestInfo;
import com.xiaofenhao.bean.InvCompanyResponseInfo;
import com.xiaofenhao.common.page.PagedResponseInfo;
import com.xiaofenhao.common.response.R;
import com.xiaofenhao.service.InvCompanyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 公司信息
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/14
 */
@RestController
@RequestMapping("/invCompany")
public class InvCompanyController {

    @Autowired
    private InvCompanyService invCompanyService;

    /**
     * 获取公司分页数据
     *
     * @param paramBean 请求参数
     * @return 公司分页数据
     */
    @PostMapping("/getPagedInvCompany")
    public R<PagedResponseInfo<InvCompanyResponseInfo>> getPagedInvCompany(@RequestBody InvCompanyRequestInfo paramBean) {
        return R.success(invCompanyService.getPagedInvCompany(paramBean));
    }
}
