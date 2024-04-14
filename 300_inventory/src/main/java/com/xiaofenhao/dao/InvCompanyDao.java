package com.xiaofenhao.dao;

import com.xiaofenhao.bean.InvCompanyResponseInfo;

import java.util.List;
import java.util.Map;

/**
 * 公司信息
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/14
 */
public interface InvCompanyDao {

    /**
     * 获取公司信息列表
     *
     * @param conditions 查询条件
     * @return 公司信息列表
     */
    List<InvCompanyResponseInfo> getInvCompanyList(Map<String, Object> conditions);
}
