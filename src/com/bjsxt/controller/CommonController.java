package com.bjsxt.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
* @ClassName:CommonController
* @Description:
* @Company: 北京尚学堂科技有限公司 www.bjsxt.com
* @author mengqx
* @date 2017年7月17日
*/
@Controller
public class CommonController {
	
	@RequestMapping("/{path}")
	public String index(@PathVariable(value="path") String path){
		System.out.println("走了resutfull");
		return path;
	}
}
