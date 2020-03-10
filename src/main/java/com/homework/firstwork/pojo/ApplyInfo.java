package com.homework.firstwork.pojo;

import java.util.Date;

/*
@Note：apply_info的实体类

@User：NineSun
@Time:2020/3/4   16:24
*/
public class ApplyInfo {
    private String applyId;
    private String applyNum;
    private String companyId;
    private String applyStatus;
    private String applyName;
    private String industryId;
    private String serviceId;
    private Date applyDate;
    private String verifier;
    private String securityAssessmentLevel;
    private String Identification;

    public String getApplyId() {
        return applyId;
    }

    public void setApplyId(String applyId) {
        this.applyId = applyId;
    }

    public String getApplyNum() {
        return applyNum;
    }

    public void setApplyNum(String applyNum) {
        this.applyNum = applyNum;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getApplyStatus() {
        return applyStatus;
    }

    public void setApplyStatus(String applyStatus) {
        this.applyStatus = applyStatus;
    }

    public String getApplyName() {
        return applyName;
    }

    public void setApplyName(String applyName) {
        this.applyName = applyName;
    }

    public String getIndustryId() {
        return industryId;
    }

    public void setIndustryId(String industryId) {
        this.industryId = industryId;
    }

    public String getServiceId() {
        return serviceId;
    }

    public void setServiceId(String serviceId) {
        this.serviceId = serviceId;
    }

    public Date getApplyDate() {
        return applyDate;
    }

    public void setApplyDate(Date applyDate) {
        this.applyDate = applyDate;
    }

    public String getVerifier() {
        return verifier;
    }

    public void setVerifier(String verifier) {
        this.verifier = verifier;
    }

    public String getSecurityAssessmentLevel() {
        return securityAssessmentLevel;
    }

    public void setSecurityAssessmentLevel(String securityAssessmentLevel) {
        this.securityAssessmentLevel = securityAssessmentLevel;
    }

    public String getIdentification() {
        return Identification;
    }

    public void setIdentification(String identification) {
        Identification = identification;
    }
}
