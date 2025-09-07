package com.mwu.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 举报职位
 * @TableName report_job
 */
@TableName(value ="report_job")
@Data
public class ReportJob {
    /**
     * 
     */
    @TableId(value = "id")
    private String id;

    /**
     * 被举报的职位id
     */
    @TableField(value = "job_id")
    private String jobId;

    /**
     * 举报人id
     */
    @TableField(value = "report_user_id")
    private String reportUserId;

    /**
     * 举报人姓名
     */
    @TableField(value = "report_user_name")
    private String reportUserName;

    /**
     * 举报原因
     */
    @TableField(value = "report_reason")
    private String reportReason;

    /**
     * 被举报的职位名称
     */
    @TableField(value = "job_name")
    private String jobName;

    /**
     * 被举报的公司名称
     */
    @TableField(value = "company_name")
    private String companyName;

    /**
     * 处理状态：0：待处理，1：已处理，2：忽略、无需处理
     */
    @TableField(value = "deal_status")
    private Integer dealStatus;

    /**
     * 
     */
    @TableField(value = "created_time")
    private Date createdTime;

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
        ReportJob other = (ReportJob) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getJobId() == null ? other.getJobId() == null : this.getJobId().equals(other.getJobId()))
            && (this.getReportUserId() == null ? other.getReportUserId() == null : this.getReportUserId().equals(other.getReportUserId()))
            && (this.getReportUserName() == null ? other.getReportUserName() == null : this.getReportUserName().equals(other.getReportUserName()))
            && (this.getReportReason() == null ? other.getReportReason() == null : this.getReportReason().equals(other.getReportReason()))
            && (this.getJobName() == null ? other.getJobName() == null : this.getJobName().equals(other.getJobName()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getDealStatus() == null ? other.getDealStatus() == null : this.getDealStatus().equals(other.getDealStatus()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getJobId() == null) ? 0 : getJobId().hashCode());
        result = prime * result + ((getReportUserId() == null) ? 0 : getReportUserId().hashCode());
        result = prime * result + ((getReportUserName() == null) ? 0 : getReportUserName().hashCode());
        result = prime * result + ((getReportReason() == null) ? 0 : getReportReason().hashCode());
        result = prime * result + ((getJobName() == null) ? 0 : getJobName().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getDealStatus() == null) ? 0 : getDealStatus().hashCode());
        result = prime * result + ((getCreatedTime() == null) ? 0 : getCreatedTime().hashCode());
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
        sb.append(", jobId=").append(jobId);
        sb.append(", reportUserId=").append(reportUserId);
        sb.append(", reportUserName=").append(reportUserName);
        sb.append(", reportReason=").append(reportReason);
        sb.append(", jobName=").append(jobName);
        sb.append(", companyName=").append(companyName);
        sb.append(", dealStatus=").append(dealStatus);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append("]");
        return sb.toString();
    }
}