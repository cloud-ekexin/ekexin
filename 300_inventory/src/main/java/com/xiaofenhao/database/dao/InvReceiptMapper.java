package com.xiaofenhao.database.dao;

import com.xiaofenhao.database.bean.InvReceipt;

import java.util.List;
import java.util.Map;

/**
 * 针对表【inv_receipt(单据表)】的数据库操作Mapper
 *
 * @author generator
 * @version 0.0.1
 * @date 2024-04-14 12:21:34
 */
public interface InvReceiptMapper {

    int insert(InvReceipt record);

    int insertSelective(InvReceipt record);

    InvReceipt selectByPrimaryKey(Long id);

    List<InvReceipt> selectList(Map<String, Object> conditions);

    int updateByPrimaryKeySelective(InvReceipt record);

    int updateByPrimaryKey(InvReceipt record);
}
