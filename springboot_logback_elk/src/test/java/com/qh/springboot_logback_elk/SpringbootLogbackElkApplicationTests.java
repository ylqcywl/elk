package com.qh.springboot_logback_elk;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringbootLogbackElkApplicationTests {
	private final static Logger log = LoggerFactory.getLogger(SpringbootLogbackElkApplication.class);

	@Before
	public void setUp() {

	}

	@Test
	public void test() {
		log.trace("trace 成功了");
		log.debug("debug 成功了");
		log.info("info 成功了");
		log.warn("warn 成功了");
		log.error("error 成功了");
	}

}
