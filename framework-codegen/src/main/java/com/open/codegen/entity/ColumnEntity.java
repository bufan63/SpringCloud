package com.open.codegen.entity;

import lombok.Data;

/**
 * 列属性 MySQL中表的字段信息查询
 */
@Data
public class ColumnEntity {
	/**
	 * 列表
	 */
	private String columnName;
	/**
	 * 数据类型
	 */
	private String dataType;
	/**
	 * 备注
	 */
	private String comments;

	/**
	 * 驼峰属性
	 */
	private String caseAttrName;
	/**
	 * 普通属性
	 */
	private String lowerAttrName;
	/**
	 * 属性类型
	 */
	private String attrType;
	/**
	 * 其他信息
	 */
	private String extra;
	/**
	 * 字段类型
	 */
	private String columnType;
	/**
	 * 是否可以为空
	 */
	private Boolean nullable;
	/**
	 * 是否隐藏
	 */
	private Boolean hidden;
}
