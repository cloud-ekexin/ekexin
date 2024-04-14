package com.xiaofenhao.dao;

import com.xiaofenhao.bean.SysMenuForShowRespInfo;

import java.util.List;

/**
 * 系统菜单
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/13
 */
public interface SysMenuDao {

    /**
     * 获取系统菜单列表
     *
     * @return 系统菜单列表
     */
    List<SysMenuForShowRespInfo> getSysMenuForShowList();
}
