package com.bjsxt.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bjsxt.pojo.Menu;
import com.bjsxt.pojo.User;
import com.bjsxt.service.MenuService;

/**
* @ClassName:IndexController
* @Description:
* @Company: 北京尚学堂科技有限公司 www.bjsxt.com
* @author mengqx
* @date 2017年7月17日
*/
@Controller
public class IndexController {
	@Autowired
	private MenuService menuService;
	//	index ---- resutful index........ 如果有精确匹配，，resutfull就会失效。
	@RequestMapping("index")
	public List<Menu> index(HttpSession session,HttpServletRequest request){
		//	查询菜单然后将菜单返回给index.jsp。 最后在index.jsp 中显示菜单！ // 
		//	取得session 中存储的用户id
		User user = (User) session.getAttribute("u");
		List<Menu> menu = menuService.selectByIdFindMenu(user.getUserId());
		//	存储在作用域中，在页面中再取出来！
		request.setAttribute("menu", menu);
		return menu;
	}
}
