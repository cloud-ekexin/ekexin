package com.xiaofenhao.database.dao;

import com.xiaofenhao.database.bean.InvReceiptDetail;

import java.util.List;
import java.util.Map;

/**
 * 针对表【inv_receipt_detail(单据明细表)】的数据库操作Mapper
 *
 * @author generator
 * @version 0.0.1
 * @date 2024-04-14 12:21:34
 */
public interface InvReceiptDetailMapper {

    int insert(InvReceiptDetail record);

    int insertSelective(InvReceiptDetail record);

    InvReceiptDetail selectByPrimaryKey(Long id);

    List<InvReceiptDetail> selectList(Map<String, Object> conditions);

    int updateByPrimaryKeySelective(InvReceiptDetail record);

    int updateByPrimaryKey(InvReceiptDetail record);
}
