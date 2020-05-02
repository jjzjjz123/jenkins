package com.getvip;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class A {
	@RequestMapping("a")
	@ResponseBody
	public String getbya() {
		System.out.println("成功!");
		return "a";
	}

}
