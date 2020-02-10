package com.open.upms.biz.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.open.upms.api.entity.SysUserRole;
import org.apache.ibatis.annotations.Param;

public interface SysUserRoleMapper extends BaseMapper<SysUserRole> {
	/**
	 * 根据用户Id删除该用户的角色关系
	 *
	 * @param userId 用户ID
	 * @return boolean
	 */
	Boolean deleteByUserId(@Param("userId") Integer userId);
}
