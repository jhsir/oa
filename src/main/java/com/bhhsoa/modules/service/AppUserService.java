package com.bhhsoa.modules.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.bhhsoa.modules.entity.AppUser;
import com.bhhsoa.modules.mapper.AppUserMapper;

/**
 * 
 * @version 2016年9月8日
 * @author fjh
 */
@Service
public class AppUserService {

	@Autowired
	private AppUserMapper appUserMapper;
	
	/**
	 *  description:登录
	 *	@return: boolean
	 **/
	@Transactional
	public boolean login(String userName, String password) {
		AppUser user = appUserMapper.getByUsername(userName);
		boolean is = false;
		if(user != null) {
			if(user.getPassword().equals(password)) {
				is = true;
				return is;
			}
		}
		return is;
	}
	
	
}
