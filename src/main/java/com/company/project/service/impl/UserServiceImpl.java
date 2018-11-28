package com.company.project.service.impl;

import com.company.project.dao.UserMapper;
import com.company.project.model.User;
import org.springframework.stereotype.Service;
import com.company.project.service.UserService;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2018/11/28.
 */
@Service
@Transactional
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
	
	@Override
	public int deleteById(String id) {
		return userMapper.deleteByPrimaryKey(id);
	}

	@Override
	public int save(User record) {
		return userMapper.insert(record);
	}

	@Override
	public User findById(String id) {
		return userMapper.selectByPrimaryKey(id);
	}

	@Override
	public List<User> findAll() {
		return userMapper.selectAll();
	}
	
	@Override
	public int update(User record) {
		return userMapper.updateByPrimaryKey(record);
	}
}
