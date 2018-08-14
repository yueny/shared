package com.yueny.demo.common.example.service;

import com.yueny.demo.common.example.bo.DemoBo;

/**
 * @author yueny09 <deep_blue_yang@163.com>
 *
 * @DATE 2016年8月5日 上午9:56:50
 *
 */
public interface IDemoService {
	/**
	 * 根据主键查询
	 */
	DemoBo findById(Long primaryId);

}
