package com.liucl.test2.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.liucl.test2.dormain.Actcompany;
import com.liucl.test2.dormain.ActcompanyExample;

public interface ActcompanyMapper {
    int countByExample(ActcompanyExample example);
    
    int deleteByExample(ActcompanyExample example);
    
    int deleteByPrimaryKey(Integer ID);
    
    int insert(Actcompany record);
    
    int insertSelective(Actcompany record);
    
    List<Actcompany> selectByExampleWithBLOBs(ActcompanyExample example);
    
    List<Actcompany> selectByExample(ActcompanyExample example);
    
    Actcompany selectByPrimaryKey(Integer ID);
    
    int updateByExampleSelective(@Param("record") Actcompany record, @Param("example") ActcompanyExample example);
    
    int updateByExampleWithBLOBs(@Param("record") Actcompany record, @Param("example") ActcompanyExample example);
    
    int updateByExample(@Param("record") Actcompany record, @Param("example") ActcompanyExample example);
    
    int updateByPrimaryKeySelective(Actcompany record);
    
    int updateByPrimaryKeyWithBLOBs(Actcompany record);
    
    int updateByPrimaryKey(Actcompany record);
}