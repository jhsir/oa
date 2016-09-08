package com.bhhsoa.modules.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.bhhsoa.common.persistence.ResponseModel;
import com.bhhsoa.modules.entity.AppUser;
import com.bhhsoa.modules.service.AppUserService;

/**
 * 
 * @version 2016年9月8日
 * @author fjh
 */
@Controller
@RequestMapping("/user")
public class AppUserController {
	
	@Autowired
	private AppUserService appUserService;
	
	@RequestMapping("login")
	public @ResponseBody ResponseModel login(AppUser user) {
		ResponseModel re = new ResponseModel();
		boolean is = appUserService.login(user.getUsername(), user.getPassword());
		if(is) {
			re.setSuccess(true);
			re.setMsg("登陆成功");
		}else  {
			re.setSuccess(false);
			re.setMsg("登录失败");
		}
		return re;
	}

}
