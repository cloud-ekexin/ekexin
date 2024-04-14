package com.xiaofenhao.service.impl;

import com.xiaofenhao.bean.SysMenuForShowRespInfo;
import com.xiaofenhao.database.dao.SysMenuMapper;
import com.xiaofenhao.dao.SysMenuDao;
import com.xiaofenhao.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 系统菜单
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/13
 */
@Service
public class SysMenuServiceImpl implements SysMenuService {

    @Autowired
    private SysMenuDao sysMenuDao;
    @Autowired
    private SysMenuMapper sysMenuMapper;

    /**
     * 获取系统菜单列表
     *
     * @return 系统菜单列表
     */
    @Override
    public List<SysMenuForShowRespInfo> getSysMenuForShowList() {
        List<SysMenuForShowRespInfo> sysMenuForShowRespInfoList = sysMenuDao.getSysMenuForShowList();

        // 获取父菜单，parentId为null的默认为父菜单
        List<SysMenuForShowRespInfo> parentMenuList = sysMenuForShowRespInfoList
                .stream()
                .filter(sysMenuForShowRespInfo -> sysMenuForShowRespInfo.getParentId() == null)
                .collect(Collectors.toList());

        // 将子菜单作为children赋值给父菜单
        for (SysMenuForShowRespInfo sysMenuForShowRespInfo : parentMenuList) {
            sysMenuForShowRespInfo.setChildren(sysMenuForShowRespInfoList
                    .stream()
                    .filter(e -> Objects.equals(e.getParentId(), sysMenuForShowRespInfo.getId()))
                    .collect(Collectors.toList()));
        }
        return parentMenuList;
    }
}
