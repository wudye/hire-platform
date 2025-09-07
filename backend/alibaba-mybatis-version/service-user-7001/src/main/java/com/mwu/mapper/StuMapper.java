package com.mwu.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.mwu.pojo.test.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
* @author mwu42
* @description 针对表【stu】的数据库操作Mapper
* @createDate 2025-09-05 21:56:59
* @Entity generator.domain.Stu
*/
@Mapper
public interface StuMapper extends BaseMapper<Stu> {

}




