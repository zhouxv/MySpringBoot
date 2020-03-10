package com.homework.firstwork.mapper;

import com.homework.firstwork.pojo.ApplyInfo;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
@Note：apply_info的mapper

@User：NineSun
@Time:2020/3/4   16:37
*/
@Repository
public interface ApplyInfoMapper {
    @Select("select * from apply_info")
    @Results(value={
            @Result(property = "applyId", column = "apply_id"),
            @Result(property = "applyNum", column = "apply_num"),
            @Result(property = "companyId", column = "company_id"),
            @Result(property = "applyStatus", column = "apply_status"),
            @Result(property = "applyName", column = "apply_name"),
            @Result(property = "industryId", column = "industry_id"),
            @Result(property = "serviceId", column = "service_id"),
            @Result(property = "applyDate", column = "apply_date"),
            @Result(property = "verifier", column = "verifier"),
            @Result(property = "securityAssessmentLevel", column = "security_assessment_level"),
            @Result(property = "Identification", column = "Identification")
    })
    List<ApplyInfo> listAll();
}
