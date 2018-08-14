package com.yueny.demo.common.example.service.impl;

import org.springframework.stereotype.Service;

import com.yueny.demo.common.example.bo.DemoBo;
import com.yueny.demo.common.example.service.BaseSevice;
import com.yueny.demo.common.example.service.IDemoService;

/**
 * @author yueny09 <deep_blue_yang@163.com>
 *
 * @DATE 2018年8月14日 下午4:04:32
 *
 */
@Service
public class DemoServiceImpl extends BaseSevice implements IDemoService {
	@Override
	public DemoBo findById(final Long primaryId) {
		return null;
	}

}
