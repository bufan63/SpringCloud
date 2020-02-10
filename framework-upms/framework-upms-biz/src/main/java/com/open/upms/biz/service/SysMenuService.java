package com.open.upms.biz.service;


import com.baomidou.mybatisplus.extension.service.IService;
import com.open.upms.api.entity.SysMenu;
import com.open.upms.api.vo.MenuVO;
import com.open.common.core.util.R;

import java.util.List;

/**
 * 菜单权限表 服务类
 */
public interface SysMenuService extends IService<SysMenu> {
	/**
	 * 通过角色编号查询URL 权限
	 *
	 * @param roleId 角色ID
	 * @return 菜单列表
	 */
	List<MenuVO> getMenuByRoleId(Integer roleId);

	/**
	 * 级联删除菜单
	 *
	 * @param id 菜单ID
	 * @return 成功、失败
	 */
	R removeMenuById(Integer id);

	/**
	 * 更新菜单信息
	 *
	 * @param sysMenu 菜单信息
	 * @return 成功、失败
	 */
	Boolean updateMenuById(SysMenu sysMenu);
}
