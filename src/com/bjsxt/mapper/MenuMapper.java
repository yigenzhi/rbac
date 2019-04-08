package com.bjsxt.mapper;

import java.util.List;

import com.bjsxt.pojo.Menu;

/**
* @ClassName:MenuMapper
* @Description:
* @Company: 北京尚学堂科技有限公司 www.bjsxt.com
* @author mengqx
* @date 2017年7月17日
*/

public interface MenuMapper {
	
	//	根据用的id查询菜单
	public List<Menu> selectByIdFindMenu(int id);
}
