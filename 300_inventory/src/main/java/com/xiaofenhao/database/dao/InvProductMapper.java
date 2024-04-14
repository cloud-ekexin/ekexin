package com.xiaofenhao.database.dao;

import com.xiaofenhao.database.bean.InvProduct;

import java.util.List;
import java.util.Map;

/**
 * 针对表【inv_product(产品表)】的数据库操作Mapper
 *
 * @author generator
 * @version 0.0.1
 * @date 2024-04-14 12:21:34
 */
public interface InvProductMapper {

    int insert(InvProduct record);

    int insertSelective(InvProduct record);

    InvProduct selectByPrimaryKey(Long id);

    List<InvProduct> selectList(Map<String, Object> conditions);

    int updateByPrimaryKeySelective(InvProduct record);

    int updateByPrimaryKey(InvProduct record);
}
