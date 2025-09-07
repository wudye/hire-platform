package com.mwu.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 求职期望表
 * @TableName resume_expect
 */
@TableName(value ="resume_expect")
@Data
public class ResumeExpect {
    /**
     * 
     */
    @TableId(value = "id")
    private String id;

    /**
     * 谁的求职期望，用户id
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 属于哪份简历id
     */
    @TableField(value = "resume_id")
    private String resumeId;

    /**
     * 期望职位
     */
    @TableField(value = "job_name")
    private String jobName;

    /**
     * 工作所在城市
     */
    @TableField(value = "city")
    private String city;

    /**
     * 工作对应所处行业
     */
    @TableField(value = "industry")
    private String industry;

    /**
     * 薪资要求区间-起始
     */
    @TableField(value = "begin_salary")
    private Integer beginSalary;

    /**
     * 薪资要求区间-结束
     */
    @TableField(value = "end_salary")
    private Integer endSalary;

    /**
     * 
     */
    @TableField(value = "create_time")
    private Date createTime;

    /**
     * 
     */
    @TableField(value = "updated_time")
    private Date updatedTime;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        ResumeExpect other = (ResumeExpect) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getResumeId() == null ? other.getResumeId() == null : this.getResumeId().equals(other.getResumeId()))
            && (this.getJobName() == null ? other.getJobName() == null : this.getJobName().equals(other.getJobName()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getIndustry() == null ? other.getIndustry() == null : this.getIndustry().equals(other.getIndustry()))
            && (this.getBeginSalary() == null ? other.getBeginSalary() == null : this.getBeginSalary().equals(other.getBeginSalary()))
            && (this.getEndSalary() == null ? other.getEndSalary() == null : this.getEndSalary().equals(other.getEndSalary()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getResumeId() == null) ? 0 : getResumeId().hashCode());
        result = prime * result + ((getJobName() == null) ? 0 : getJobName().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        result = prime * result + ((getBeginSalary() == null) ? 0 : getBeginSalary().hashCode());
        result = prime * result + ((getEndSalary() == null) ? 0 : getEndSalary().hashCode());
        result = prime * result + ((getCreateTime() == null) ? 0 : getCreateTime().hashCode());
        result = prime * result + ((getUpdatedTime() == null) ? 0 : getUpdatedTime().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", userId=").append(userId);
        sb.append(", resumeId=").append(resumeId);
        sb.append(", jobName=").append(jobName);
        sb.append(", city=").append(city);
        sb.append(", industry=").append(industry);
        sb.append(", beginSalary=").append(beginSalary);
        sb.append(", endSalary=").append(endSalary);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append("]");
        return sb.toString();
    }
}