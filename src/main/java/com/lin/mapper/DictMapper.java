package com.lin.mapper;

import com.lin.domain.Dict;

import java.util.List;

/**
 * 系统字典  数据层
 * 
 * @author linzixiang
 * @date 2019_05_133
 */
public interface DictMapper {

	/**
	 * 主键查询
	 * @param id
	 * @return
	 */
	Dict getById(Long id);

	/**
	 * 复杂查询列表
	 * @param dept
	 * @return
	 */
	List<Dict> selectList(Dict dept);

	/**
	 * 新增
	 * @param entity
	 * @return
	 */
	Long insert(Dict entity);

	/**
	 * 更新
	 * @param dept
	 * @return
	 */
	int update(Dict dept);

	/**
	 * 根据主键删除记录
	 * @param deptId
	 * @return
	 */
	int deleteById(Long deptId);

	/**
	 * 根据主键批量删除记录
	 * @param deptIds
	 * @return
	 */
	int deleteByIds(Long[] deptIds);

}