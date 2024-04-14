package com.xiaofenhao.database.dao;

import com.xiaofenhao.database.bean.SysMenu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * 针对表【sys_menu(系统菜单表)】的数据库操作Mapper
 *
 * @author generator
 * @version 0.0.1
 * @date 2024-04-13 15:55:45
 */
@Mapper
public interface SysMenuMapper {

    int insert(SysMenu record);

    int insertSelective(SysMenu record);

    SysMenu selectByPrimaryKey(Long id);

    List<SysMenu> selectList(Map<String, Object> conditions);

    int updateByPrimaryKeySelective(SysMenu record);

    int updateByPrimaryKey(SysMenu record);
}
