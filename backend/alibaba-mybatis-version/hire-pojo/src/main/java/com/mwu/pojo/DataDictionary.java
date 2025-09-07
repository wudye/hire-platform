package com.mwu.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * 数据字典表
 * @TableName data_dictionary
 */
@TableName(value ="data_dictionary")
@Data
public class DataDictionary {
    /**
     * 
     */
    @TableId(value = "id")
    private String id;

    /**
     * 数据字典的类别代码code，根据本code可以找到对应的所有下属的value列表，例如：benefits（同一类型item所对应的code都是一致的）
     */
    @TableField(value = "type_code")
    private String typeCode;

    /**
     * 数据字典的类别名称，例如：福利待遇（同一类型item所对应的name都是一致的）
     */
    @TableField(value = "type_name")
    private String typeName;

    /**
     * 字典项，数据字典类别下的所有key，每个key对应一个value，可以根据类型key和字典key同时找到具体某一项字典value，例如：travel-旅游
     */
    @TableField(value = "item_key")
    private String itemKey;

    /**
     * 每个单个的数据字典的值，唯一key所对应的值value，例如：旅游
     */
    @TableField(value = "item_value")
    private String itemValue;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 对应的字体图标，可以为空
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 是否开启，1：启用，0：停用
     */
    @TableField(value = "enable")
    private Integer enable;

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
        DataDictionary other = (DataDictionary) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getTypeCode() == null ? other.getTypeCode() == null : this.getTypeCode().equals(other.getTypeCode()))
            && (this.getTypeName() == null ? other.getTypeName() == null : this.getTypeName().equals(other.getTypeName()))
            && (this.getItemKey() == null ? other.getItemKey() == null : this.getItemKey().equals(other.getItemKey()))
            && (this.getItemValue() == null ? other.getItemValue() == null : this.getItemValue().equals(other.getItemValue()))
            && (this.getSort() == null ? other.getSort() == null : this.getSort().equals(other.getSort()))
            && (this.getIcon() == null ? other.getIcon() == null : this.getIcon().equals(other.getIcon()))
            && (this.getEnable() == null ? other.getEnable() == null : this.getEnable().equals(other.getEnable()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getTypeCode() == null) ? 0 : getTypeCode().hashCode());
        result = prime * result + ((getTypeName() == null) ? 0 : getTypeName().hashCode());
        result = prime * result + ((getItemKey() == null) ? 0 : getItemKey().hashCode());
        result = prime * result + ((getItemValue() == null) ? 0 : getItemValue().hashCode());
        result = prime * result + ((getSort() == null) ? 0 : getSort().hashCode());
        result = prime * result + ((getIcon() == null) ? 0 : getIcon().hashCode());
        result = prime * result + ((getEnable() == null) ? 0 : getEnable().hashCode());
        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", typeCode=").append(typeCode);
        sb.append(", typeName=").append(typeName);
        sb.append(", itemKey=").append(itemKey);
        sb.append(", itemValue=").append(itemValue);
        sb.append(", sort=").append(sort);
        sb.append(", icon=").append(icon);
        sb.append(", enable=").append(enable);
        sb.append("]");
        return sb.toString();
    }
}