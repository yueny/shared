package com.yueny.demo.common.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.yueny.demo.common.example.service.IDemoService;

/**
 * @author yueny09 <deep_blue_yang@163.com>
 *
 * @DATE 2018年8月14日 下午4:41:22
 *
 */
@Controller
public class DemoController {
	@Autowired
	private IDemoService demoService;

	@RequestMapping(value = "/get", method = RequestMethod.GET)
	@ResponseBody
	public String get(final Long primaryId) {
		demoService.findById(primaryId);

		return "ok";
	}

	/**
	 * @return 首页
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	@ResponseBody
	public String index() {
		return "index";
	}

}
