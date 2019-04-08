package com.bjsxt.pojo;
/**
* @ClassName:Menu
* @Description:
* @Company: 北京尚学堂科技有限公司 www.bjsxt.com
* @author mengqx
* @date 2017年7月17日
*/

public class Menu {
	
	private Integer menuId;
	private String menuName;
	private Integer pMenuId;
	public Integer getMenuId() {
		return menuId;
	}
	public void setMenuId(Integer menuId) {
		this.menuId = menuId;
	}
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public Integer getpMenuId() {
		return pMenuId;
	}
	public void setpMenuId(Integer pMenuId) {
		this.pMenuId = pMenuId;
	}
	@Override
	public String toString() {
		return "Menu [menuId=" + menuId + ", menuName=" + menuName + ", pMenuId=" + pMenuId + "]";
	}
	public Menu(Integer menuId, String menuName, Integer pMenuId) {
		super();
		this.menuId = menuId;
		this.menuName = menuName;
		this.pMenuId = pMenuId;
	}
	public Menu() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
