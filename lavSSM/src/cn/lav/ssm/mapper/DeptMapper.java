package cn.lav.ssm.mapper;

import java.util.List;

import org.springframework.stereotype.Repository;

import cn.lav.ssm.pojo.Dept;

@Repository
public interface DeptMapper {
	
	List<Dept> getAllDepts() throws Exception;

}
