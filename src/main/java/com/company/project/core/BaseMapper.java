package com.company.project.core;

import java.io.Serializable;
import java.util.List;

public interface BaseMapper<T, PK extends Serializable> {

	int insert(T record);

	int insertSelective(T record);


	T selectByPrimaryKey(PK pk);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);
	
	int deleteByPrimaryKey(PK record);
	
	List<T> selectAll();
	
	List<T> list();
}
