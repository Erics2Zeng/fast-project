package com.company.project.service.impl;

import com.company.project.dao.DeptMapper;
import com.company.project.model.Dept;
import org.springframework.stereotype.Service;
import com.company.project.service.DeptService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/28.
 */
@Service
@Transactional
public class DeptServiceImpl implements DeptService {
    @Resource
    private DeptMapper deptMapper;
	
	@Override
	public int deleteById(String id) {
		return deptMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int save(Dept record) {
		return deptMapper.insert(record);
	}

	@Override
	public Dept findById(String id) {
		return deptMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<Dept> findAll() {
		return deptMapper.selectAll();
	}
	
	@Override
	public int update(Dept record) {
		return deptMapper.updateByPrimaryKey(record);
	}
}
