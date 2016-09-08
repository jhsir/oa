package com.bhhsoa.modules.mapper;

import com.bhhsoa.common.persistence.CrudDao;
import com.bhhsoa.modules.entity.AppUser;

/**
 * 
 * @version 2016年9月8日
 * @author fjh
 */
public interface AppUserMapper extends CrudDao<AppUser>{
    
	public AppUser getByUsername(String userName);
}