package com.mwu.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 系统参数配置表，本表仅有一条记录
 * @TableName sys_params
 */
@TableName(value ="sys_params")
@Data
public class SysParams {
    /**
     * 
     */
    @TableId(value = "id")
    private Integer id;

    /**
     * 每日最大简历被刷新的次数
     */
    @TableField(value = "max_resume_refresh_counts")
    private Integer maxResumeRefreshCounts;

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
        SysParams other = (SysParams) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getMaxResumeRefreshCounts() == null ? other.getMaxResumeRefreshCounts() == null : this.getMaxResumeRefreshCounts().equals(other.getMaxResumeRefreshCounts()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getMaxResumeRefreshCounts() == null) ? 0 : getMaxResumeRefreshCounts().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", maxResumeRefreshCounts=").append(maxResumeRefreshCounts);
        sb.append("]");
        return sb.toString();
    }
}