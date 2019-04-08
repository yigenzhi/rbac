package com.bjsxt.service;

import com.bjsxt.pojo.User;

/**
* @ClassName:UserService
* @Description:
* @Company: 北京尚学堂科技有限公司 www.bjsxt.com
* @author mengqx
* @date 2017年7月17日
*/

public interface UserService {
	User login(String username,String password);
}
