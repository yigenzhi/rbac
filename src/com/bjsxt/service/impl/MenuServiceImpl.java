package com.bjsxt.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bjsxt.mapper.MenuMapper;
import com.bjsxt.pojo.Menu;
import com.bjsxt.service.MenuService;

/**
* @ClassName:MenuServiceImpl
* @Description:
* @Company: 北京尚学堂科技有限公司 www.bjsxt.com
* @author mengqx
* @date 2017年7月17日
*/
@Service
public class MenuServiceImpl implements MenuService {

	@Autowired
	private MenuMapper menuMapper;
	@Override
	public List<Menu> selectByIdFindMenu(int id) {
		return menuMapper.selectByIdFindMenu(id);
	}

}
