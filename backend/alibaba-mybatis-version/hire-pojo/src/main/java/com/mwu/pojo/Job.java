package com.mwu.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * HR发布的职位表
 * @TableName job
 */
@TableName(value ="job")
@Data
public class Job {
    /**
     * 
     */
    @TableId(value = "id")
    private String id;

    /**
     * 谁的职位，HR角色用户id
     */
    @TableField(value = "hr_id")
    private String hrId;

    /**
     * 职位所属哪家公司的，HR离职后则不能查询到
     */
    @TableField(value = "company_id")
    private String companyId;

    /**
     * 职位名称
     */
    @TableField(value = "job_name")
    private String jobName;

    /**
     * 职位类别
     */
    @TableField(value = "job_type")
    private String jobType;

    /**
     * 工作经验年限
     */
    @TableField(value = "exp_years")
    private String expYears;

    /**
     * 技能标签
     */
    @TableField(value = "edu")
    private String edu;

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
     * 总共几个月工资
     */
    @TableField(value = "monthly_salary")
    private Integer monthlySalary;

    /**
     * 职位描述
     */
    @TableField(value = "job_desc")
    private String jobDesc;

    /**
     * 职位标签
     */
    @TableField(value = "tags")
    private String tags;

    /**
     * 工作城市
     */
    @TableField(value = "city")
    private String city;

    /**
     * 工作地点
     */
    @TableField(value = "address")
    private String address;

    /**
     * 1：招聘中，open
2：已关闭，close
3：违规删除，delete
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 违规原因
     */
    @TableField(value = "violate_reason")
    private String violateReason;

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
        Job other = (Job) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHrId() == null ? other.getHrId() == null : this.getHrId().equals(other.getHrId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getJobName() == null ? other.getJobName() == null : this.getJobName().equals(other.getJobName()))
            && (this.getJobType() == null ? other.getJobType() == null : this.getJobType().equals(other.getJobType()))
            && (this.getExpYears() == null ? other.getExpYears() == null : this.getExpYears().equals(other.getExpYears()))
            && (this.getEdu() == null ? other.getEdu() == null : this.getEdu().equals(other.getEdu()))
            && (this.getBeginSalary() == null ? other.getBeginSalary() == null : this.getBeginSalary().equals(other.getBeginSalary()))
            && (this.getEndSalary() == null ? other.getEndSalary() == null : this.getEndSalary().equals(other.getEndSalary()))
            && (this.getMonthlySalary() == null ? other.getMonthlySalary() == null : this.getMonthlySalary().equals(other.getMonthlySalary()))
            && (this.getJobDesc() == null ? other.getJobDesc() == null : this.getJobDesc().equals(other.getJobDesc()))
            && (this.getTags() == null ? other.getTags() == null : this.getTags().equals(other.getTags()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getViolateReason() == null ? other.getViolateReason() == null : this.getViolateReason().equals(other.getViolateReason()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHrId() == null) ? 0 : getHrId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getJobName() == null) ? 0 : getJobName().hashCode());
        result = prime * result + ((getJobType() == null) ? 0 : getJobType().hashCode());
        result = prime * result + ((getExpYears() == null) ? 0 : getExpYears().hashCode());
        result = prime * result + ((getEdu() == null) ? 0 : getEdu().hashCode());
        result = prime * result + ((getBeginSalary() == null) ? 0 : getBeginSalary().hashCode());
        result = prime * result + ((getEndSalary() == null) ? 0 : getEndSalary().hashCode());
        result = prime * result + ((getMonthlySalary() == null) ? 0 : getMonthlySalary().hashCode());
        result = prime * result + ((getJobDesc() == null) ? 0 : getJobDesc().hashCode());
        result = prime * result + ((getTags() == null) ? 0 : getTags().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getViolateReason() == null) ? 0 : getViolateReason().hashCode());
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
        sb.append(", hrId=").append(hrId);
        sb.append(", companyId=").append(companyId);
        sb.append(", jobName=").append(jobName);
        sb.append(", jobType=").append(jobType);
        sb.append(", expYears=").append(expYears);
        sb.append(", edu=").append(edu);
        sb.append(", beginSalary=").append(beginSalary);
        sb.append(", endSalary=").append(endSalary);
        sb.append(", monthlySalary=").append(monthlySalary);
        sb.append(", jobDesc=").append(jobDesc);
        sb.append(", tags=").append(tags);
        sb.append(", city=").append(city);
        sb.append(", address=").append(address);
        sb.append(", status=").append(status);
        sb.append(", violateReason=").append(violateReason);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append("]");
        return sb.toString();
    }
}