package com.mwu.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 简历表
 * @TableName resume
 */
@TableName(value ="resume")
@Data
public class Resume {
    /**
     * 
     */
    @TableId(value = "id")
    private String id;

    /**
     * 谁的简历，用户id
     */
    @TableField(value = "user_id")
    private String userId;

    /**
     * 个人优势
     */
    @TableField(value = "advantage")
    private String advantage;

    /**
     * 个人优势的html内容，用于展示
     */
    @TableField(value = "advantage_html")
    private String advantageHtml;

    /**
     * 资格证书
     */
    @TableField(value = "credentials")
    private String credentials;

    /**
     * 技能标签
     */
    @TableField(value = "skills")
    private String skills;

    /**
     * 求职状态
     */
    @TableField(value = "status")
    private String status;

    /**
     * 刷新简历时间
     */
    @TableField(value = "refresh_time")
    private Date refreshTime;

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
        Resume other = (Resume) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getUserId() == null ? other.getUserId() == null : this.getUserId().equals(other.getUserId()))
            && (this.getAdvantage() == null ? other.getAdvantage() == null : this.getAdvantage().equals(other.getAdvantage()))
            && (this.getAdvantageHtml() == null ? other.getAdvantageHtml() == null : this.getAdvantageHtml().equals(other.getAdvantageHtml()))
            && (this.getCredentials() == null ? other.getCredentials() == null : this.getCredentials().equals(other.getCredentials()))
            && (this.getSkills() == null ? other.getSkills() == null : this.getSkills().equals(other.getSkills()))
            && (this.getStatus() == null ? other.getStatus() == null : this.getStatus().equals(other.getStatus()))
            && (this.getRefreshTime() == null ? other.getRefreshTime() == null : this.getRefreshTime().equals(other.getRefreshTime()))
            && (this.getCreateTime() == null ? other.getCreateTime() == null : this.getCreateTime().equals(other.getCreateTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getUserId() == null) ? 0 : getUserId().hashCode());
        result = prime * result + ((getAdvantage() == null) ? 0 : getAdvantage().hashCode());
        result = prime * result + ((getAdvantageHtml() == null) ? 0 : getAdvantageHtml().hashCode());
        result = prime * result + ((getCredentials() == null) ? 0 : getCredentials().hashCode());
        result = prime * result + ((getSkills() == null) ? 0 : getSkills().hashCode());
        result = prime * result + ((getStatus() == null) ? 0 : getStatus().hashCode());
        result = prime * result + ((getRefreshTime() == null) ? 0 : getRefreshTime().hashCode());
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
        sb.append(", advantage=").append(advantage);
        sb.append(", advantageHtml=").append(advantageHtml);
        sb.append(", credentials=").append(credentials);
        sb.append(", skills=").append(skills);
        sb.append(", status=").append(status);
        sb.append(", refreshTime=").append(refreshTime);
        sb.append(", createTime=").append(createTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append("]");
        return sb.toString();
    }
}