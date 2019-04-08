package com.bjsxt.controller;

import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
* @ClassName:UserController
* @Description:
* @Company: 北京尚学堂科技有限公司 www.bjsxt.com
* @author mengqx
* @date 2017年7月17日
*/
@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	@RequestMapping("login")
	@ResponseBody
	public String login(String code,User user,HttpServletRequest request,HttpSession session){
		Map map = new HashMap<>();
		//	验证码验证，验证通 过，然后对密码进行加密，
		String codes = (String) session.getAttribute("code");
		if (codes.equalsIgnoreCase(code)) {
			//		对密码进行加密，然后验证
			/*String pwd = Md5Util.GetMD5(user.getPassword());*/
			User u = userService.login(user.getUsername(), user.getPassword());
			if (u!=null) {
				session.setAttribute("u", u);
				map.put("flag", "ok");
			}else{
				map.put("flag", "ng");
			}
		}else{
			map.put("flag", "ng");
		}
		Gson gson = new Gson();
		String json = gson.toJson(map);
		return json;
	}
}
