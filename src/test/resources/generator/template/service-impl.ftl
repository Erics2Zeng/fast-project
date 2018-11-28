package ${basePackage}.service.impl;

import ${basePackage}.dao.${modelNameUpperCamel}Mapper;
import ${basePackage}.model.${modelNameUpperCamel};
import org.springframework.stereotype.Service;
import ${basePackage}.service.${modelNameUpperCamel}Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

import javax.annotation.Resource;


/**
 * Created by ${author} on ${date}.
 */
@Service
@Transactional
public class ${modelNameUpperCamel}ServiceImpl implements ${modelNameUpperCamel}Service {
    @Resource
    private ${modelNameUpperCamel}Mapper ${modelNameLowerCamel}Mapper;
	
	@Override
	public int deleteById(String id) {
		return ${modelNameLowerCamel}Mapper.deleteByPrimaryKey(id);
	}

	@Override
	public int save(${modelNameUpperCamel} record) {
		return ${modelNameLowerCamel}Mapper.insert(record);
	}

	@Override
	public ${modelNameUpperCamel} findById(String id) {
		return ${modelNameLowerCamel}Mapper.selectByPrimaryKey(id);
	}

	@Override
	public List<${modelNameUpperCamel}> findAll() {
		return ${modelNameLowerCamel}Mapper.selectAll();
	}
	
	@Override
	public int update(${modelNameUpperCamel} record) {
		return ${modelNameLowerCamel}Mapper.updateByPrimaryKey(record);
	}
}
