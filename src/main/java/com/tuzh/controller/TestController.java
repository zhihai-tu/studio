package com.tuzh.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhihai.tu
 *
 */
@Controller
public class TestController {

	@RequestMapping(value="/test")
	@ResponseBody
	public String test() {
		return "test";
	}
}
