package com.bjsxt.mapper;

import com.bjsxt.pojo.User;

/**
* @ClassName:UserMapper
* @Description:
* @Company: 北京尚学堂科技有限公司 www.bjsxt.com
* @author mengqx
* @date 2017年7月17日
*/

public interface UserMapper {
	
	User login(String username,String password);
}
