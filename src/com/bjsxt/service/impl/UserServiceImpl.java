package com.bjsxt.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjsxt.mapper.UserMapper;
import com.bjsxt.pojo.User;
import com.bjsxt.service.UserService;

/**
* @ClassName:UserServiceImpl
* @Description:
* @Company: 北京尚学堂科技有限公司 www.bjsxt.com
* @author mengqx
* @date 2017年7月17日
*/

@Service
public class UserServiceImpl implements UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Override
	public User login(String username, String password) {
		return userMapper.login(username, password);
	}

}
