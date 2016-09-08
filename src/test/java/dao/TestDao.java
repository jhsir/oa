package dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.bhhsoa.modules.entity.AppUser;
import com.bhhsoa.modules.mapper.AppUserMapper;

/**
 * 
 * @version 2016年9月8日
 * @author fjh
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:spring-context.xml","classpath:mybatis-config.xml"})
public class TestDao {
	
	@Autowired
	private AppUserMapper appUserMapper;

	@Test
	public void test1() {
		AppUser user= appUserMapper.get(new Long("1"));
		System.out.println(user.getEmail());
	}
	
	@Test
	public void testGetByUserName() {
		AppUser user= appUserMapper.getByUsername("admin");
		System.out.println(user.getEmail());
	}
}
