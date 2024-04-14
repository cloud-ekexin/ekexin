package com.xiaofenhao.service;

import com.xiaofenhao.bean.SysMenuForShowRespInfo;

import java.util.List;

/**
 * 系统菜单
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/13
 */
public interface SysMenuService {

    /**
     * 获取系统参数列表
     *
     * @return 系统参数列表
     */
    List<SysMenuForShowRespInfo> getSysMenuForShowList();
}
