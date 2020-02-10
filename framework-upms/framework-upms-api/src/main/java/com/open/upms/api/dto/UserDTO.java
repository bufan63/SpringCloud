package com.open.upms.api.dto;

import com.open.upms.api.entity.SysUser;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

/**
 * @author lengleng
 * @date 2019/2/1
 */
@Data
@EqualsAndHashCode(callSuper = true)
public class UserDTO extends SysUser {
	/**
	 * 角色ID
	 */
	private List<Integer> role;

	private Integer deptId;

	/**
	 * 新密码
	 */
	private String newpassword1;
}
