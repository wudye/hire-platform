package com.mwu.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 面试邀约表
本表为次表，可做冗余，可以用mongo或者es替代
 * @TableName interview
 */
@TableName(value ="interview")
@Data
public class Interview {
    /**
     * 
     */
    @TableId(value = "id")
    private String id;

    /**
     * 本面试属于哪个hr的
     */
    @TableField(value = "hr_user_id")
    private String hrUserId;

    /**
     * 本面试属于哪一个公司的
     */
    @TableField(value = "company_id")
    private String companyId;

    /**
     * 面试者，候选人id
     */
    @TableField(value = "cand_user_id")
    private String candUserId;

    /**
     * 面试的岗位id
     */
    @TableField(value = "job_id")
    private String jobId;

    /**
     * 面试的岗位名称
     */
    @TableField(value = "job_name")
    private String jobName;

    /**
     * 面试时间
     */
    @TableField(value = "interview_time")
    private Date interviewTime;

    /**
     * 面试地点
     */
    @TableField(value = "interview_address")
    private String interviewAddress;

    /**
     * 备注信息
     */
    @TableField(value = "remark")
    private String remark;

    /**
     * 面试邀约的状态
1：等待候选人接受面试
2：候选人已接受面试
3：候选人已拒绝面试
4：HR已取消面试
5：面试通过
     */
    @TableField(value = "status")
    private Integer status;

    /**
     * 候选人名称（候选人名称）  
简历名称与职位使用字段冗余，目的相当于快照，只记录当时信息
     */
    @TableField(value = "cand_name")
    private String candName;

    /**
     * 候选人头像  
简历名称与职位使用字段冗余，目的相当于快照，只记录当时信息
     */
    @TableField(value = "cand_face")
    private String candFace;

    /**
     * 候选人职位  
简历名称与职位使用字段冗余，目的相当于快照，只记录当时信息
     */
    @TableField(value = "cand_position")
    private String candPosition;

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
        Interview other = (Interview) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getHrUserId() == null ? other.getHrUserId() == null : this.getHrUserId().equals(other.getHrUserId()))
            && (this.getCompanyId() == null ? other.getCompanyId() == null : this.getCompanyId().equals(other.getCompanyId()))
            && (this.getCandUserId() == null ? other.getCandUserId() == null : this.getCandUserId().equals(other.getCandUserId()))
            && (this.getJobId() == null ? other.getJobId() == null : this.getJobId().equals(other.getJobId()))
            && (this.getJobName() == null ? other.getJobName() == null : this.getJobName().equals(other.getJobName()))
            && (this.getInterviewTime() == null ? other.getInterviewTime() == null : this.getInterviewTime().equals(other.getInterviewTime()))
            && (this.getInterviewAddress() == null ? other.getInterviewAddress() == null : this.getInterviewAddress().equals(other.getInterviewAddress()))
            && (this.getRemark() == null ? other.getRemark() == null : this.getRemark().equals(other.getRemark()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getCandName() == null ? other.getCandName() == null : this.getCandName().equals(other.getCandName()))
            && (this.getCandFace() == null ? other.getCandFace() == null : this.getCandFace().equals(other.getCandFace()))
            && (this.getCandPosition() == null ? other.getCandPosition() == null : this.getCandPosition().equals(other.getCandPosition()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getHrUserId() == null) ? 0 : getHrUserId().hashCode());
        result = prime * result + ((getCompanyId() == null) ? 0 : getCompanyId().hashCode());
        result = prime * result + ((getCandUserId() == null) ? 0 : getCandUserId().hashCode());
        result = prime * result + ((getJobId() == null) ? 0 : getJobId().hashCode());
        result = prime * result + ((getJobName() == null) ? 0 : getJobName().hashCode());
        result = prime * result + ((getInterviewTime() == null) ? 0 : getInterviewTime().hashCode());
        result = prime * result + ((getInterviewAddress() == null) ? 0 : getInterviewAddress().hashCode());
        result = prime * result + ((getRemark() == null) ? 0 : getRemark().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getCandName() == null) ? 0 : getCandName().hashCode());
        result = prime * result + ((getCandFace() == null) ? 0 : getCandFace().hashCode());
        result = prime * result + ((getCandPosition() == null) ? 0 : getCandPosition().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", hrUserId=").append(hrUserId);
        sb.append(", companyId=").append(companyId);
        sb.append(", candUserId=").append(candUserId);
        sb.append(", jobId=").append(jobId);
        sb.append(", jobName=").append(jobName);
        sb.append(", interviewTime=").append(interviewTime);
        sb.append(", interviewAddress=").append(interviewAddress);
        sb.append(", remark=").append(remark);
        sb.append(", status=").append(status);
        sb.append(", candName=").append(candName);
        sb.append(", candFace=").append(candFace);
        sb.append(", candPosition=").append(candPosition);
        sb.append("]");
        return sb.toString();
    }
}