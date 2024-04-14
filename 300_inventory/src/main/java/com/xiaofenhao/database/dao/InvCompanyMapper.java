package com.xiaofenhao.database.dao;

import com.xiaofenhao.database.bean.InvCompany;

import java.util.List;
import java.util.Map;

/**
 * 针对表【inv_company(供应商表)】的数据库操作Mapper
 *
 * @author generator
 * @version 0.0.1
 * @date 2024-04-14 12:21:34
 */
public interface InvCompanyMapper {

    int insert(InvCompany record);

    int insertSelective(InvCompany record);

    InvCompany selectByPrimaryKey(Long id);

    List<InvCompany> selectList(Map<String, Object> conditions);

    int updateByPrimaryKeySelective(InvCompany record);

    int updateByPrimaryKey(InvCompany record);
}
