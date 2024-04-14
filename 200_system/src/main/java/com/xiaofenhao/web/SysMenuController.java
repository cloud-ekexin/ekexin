package com.xiaofenhao.web;

import com.xiaofenhao.bean.SysMenuForShowRespInfo;
import com.xiaofenhao.common.response.R;
import com.xiaofenhao.service.SysMenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 系统菜单
 *
 * @author ekexin
 * @version 0.0.1
 * @date 2024/4/13
 */
@RestController
@RequestMapping("/sysMenu")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;

    /**
     * 获取系统菜单列表
     *
     * @return 系统菜单列表
     */
    @PostMapping("/getSysMenuForShowList")
    public R<List<SysMenuForShowRespInfo>> getSysMenuForShowList() {
        return R.success(sysMenuService.getSysMenuForShowList());
    }
}
