package com.yueny.demo.common.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author yueny09 <deep_blue_yang@163.com>
 *
 * @DATE 2018年8月14日 下午4:40:29
 *
 */
@SpringBootApplication
public class Bootstrap {
	/**
	 * 日志记录器
	 */
	private static final Logger logger = LoggerFactory.getLogger(Bootstrap.class);

	public static void main(final String[] args) {
		try {
			SpringApplication.run(Bootstrap.class, args);
		} catch (final Exception e) {
			logger.error("服务启动异常:", e);
			e.printStackTrace();
		}
	}

}