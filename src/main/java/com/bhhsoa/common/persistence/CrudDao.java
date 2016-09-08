package com.bhhsoa.common.persistence;

import java.util.List;

/**
 * @description：Dao增删改查类
 * @version: 2016年5月27日
 * @author: fjh
 */
public interface CrudDao<T> {
	
	public T get(Long id);
	
	/*public T get(T entity);*/
	
	/**
	 *  @description：如果需要分页对象，可以像：entity.setPage(new Page<T>());
	 *  @param: 
	 *	@return: List<T>
	 **/
	public List<T> findList(T entity);
	
	public List<T> findAllList(T entity);
	
	public int insert(T entity);
	
	public int update(T entity);
	
	public int delete(T entity);	
	
}
