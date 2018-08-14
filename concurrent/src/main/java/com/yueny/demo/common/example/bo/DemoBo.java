package com.yueny.demo.common.example.bo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author yueny09 <deep_blue_yang@163.com>
 *
 * @DATE 2018年8月14日 下午4:03:24
 *
 */
@Data
@EqualsAndHashCode(callSuper = false, of = { "serialVersionUID" })
@AllArgsConstructor
@NoArgsConstructor
public class DemoBo {
	/**
	 *
	 */
	private static final long serialVersionUID = 3956781862810941495L;

	/** 描述 */
	private String desc;
	/** 主键 */
	private long id;
	/** 名称 */
	private String name;
	/** 类型 */
	private String type;

}
