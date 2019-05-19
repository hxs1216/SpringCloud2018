package com.biyao.dao;
import java.util.List;
import com.biyao.entities.Dept;
import org.apache.ibatis.annotations.Mapper;
/**
 * @Author:hxs
 * @Description:Dept表增删改查
 */
@Mapper
public interface DeptDao
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
