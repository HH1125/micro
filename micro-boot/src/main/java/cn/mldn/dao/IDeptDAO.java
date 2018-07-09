package cn.mldn.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import cn.mldn.vo.Dept;

@Mapper
public interface IDeptDAO {
	public List<Dept> findAll() ;	
}
