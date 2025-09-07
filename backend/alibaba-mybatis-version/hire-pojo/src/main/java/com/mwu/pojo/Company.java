package com.mwu.pojo;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.util.Date;

/**
 * 企业表
 * @TableName company
 */
@TableName(value ="company")
@Data
public class Company {
    /**
     * 
     */
    @TableId(value = "id")
    private String id;

    /**
     * 企业名称
     */
    @TableField(value = "company_name")
    private String companyName;

    /**
     * 企业短名
     */
    @TableField(value = "short_name")
    private String shortName;

    /**
     * 企业logo
     */
    @TableField(value = "logo")
    private String logo;

    /**
     * 营业执照
     */
    @TableField(value = "biz_license")
    private String bizLicense;

    /**
     * 企业所在国家
     */
    @TableField(value = "country")
    private String country;

    /**
     * 所在省份
     */
    @TableField(value = "province")
    private String province;

    /**
     * 所在市
     */
    @TableField(value = "city")
    private String city;

    /**
     * 所在区县
     */
    @TableField(value = "district")
    private String district;

    /**
     * 公司办公地址
     */
    @TableField(value = "address")
    private String address;

    /**
     * 公司性质
     */
    @TableField(value = "nature")
    private String nature;

    /**
     * 人员规模/企业规模
     */
    @TableField(value = "people_size")
    private String peopleSize;

    /**
     * 所在行业
     */
    @TableField(value = "industry")
    private String industry;

    /**
     * 融资阶段
     */
    @TableField(value = "financ_stage")
    private String financStage;

    /**
     * 工作时间，例：9:00-18:00 周末单休
     */
    @TableField(value = "work_time")
    private String workTime;

    /**
     * 公司简介
     */
    @TableField(value = "introduction")
    private String introduction;

    /**
     * 公司优势，例：领导和睦 岗位晋升

     */
    @TableField(value = "advantage")
    private String advantage;

    /**
     * 福利待遇，例：五险一金 定期体检

     */
    @TableField(value = "benefits")
    private String benefits;

    /**
     * 薪资福利（奖金），例：年底双薪
     */
    @TableField(value = "bonus")
    private String bonus;

    /**
     * 补助津贴，例：住房补贴
     */
    @TableField(value = "subsidy")
    private String subsidy;

    /**
     * 成立时间
     */
    @TableField(value = "build_date")
    private Date buildDate;

    /**
     * 注册资本
     */
    @TableField(value = "regist_capital")
    private String registCapital;

    /**
     * 注册地址
     */
    @TableField(value = "regist_place")
    private String registPlace;

    /**
     * 法人代表
     */
    @TableField(value = "legal_representative")
    private String legalRepresentative;

    /**
     * 审核状态
0：未发起审核认证(未进入审核流程)
1：审核认证通过
2：审核认证失败
3：审核中（等待审核）
     */
    @TableField(value = "review_status")
    private Integer reviewStatus;

    /**
     * 审核回复/审核意见
     */
    @TableField(value = "review_replay")
    private String reviewReplay;

    /**
     * 入驻平台授权书
     */
    @TableField(value = "auth_letter")
    private String authLetter;

    /**
     * 提交申请人的用户id
     */
    @TableField(value = "commit_user_id")
    private String commitUserId;

    /**
     * 提交申请人的手机号
     */
    @TableField(value = "commit_user_mobile")
    private String commitUserMobile;

    /**
     * 提交审核的日期
     */
    @TableField(value = "commit_date")
    private Date commitDate;

    /**
     * 0: 否  1: 是
     */
    @TableField(value = "is_vip")
    private Integer isVip;

    /**
     * Vip过期日期，判断企业是否vip，需要is_vip=1并且过期日期>=当前日期
     */
    @TableField(value = "vip_expire_date")
    private Date vipExpireDate;

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
        Company other = (Company) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCompanyName() == null ? other.getCompanyName() == null : this.getCompanyName().equals(other.getCompanyName()))
            && (this.getShortName() == null ? other.getShortName() == null : this.getShortName().equals(other.getShortName()))
            && (this.getLogo() == null ? other.getLogo() == null : this.getLogo().equals(other.getLogo()))
            && (this.getBizLicense() == null ? other.getBizLicense() == null : this.getBizLicense().equals(other.getBizLicense()))
            && (this.getCountry() == null ? other.getCountry() == null : this.getCountry().equals(other.getCountry()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getCity() == null ? other.getCity() == null : this.getCity().equals(other.getCity()))
            && (this.getDistrict() == null ? other.getDistrict() == null : this.getDistrict().equals(other.getDistrict()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getNature() == null ? other.getNature() == null : this.getNature().equals(other.getNature()))
            && (this.getPeopleSize() == null ? other.getPeopleSize() == null : this.getPeopleSize().equals(other.getPeopleSize()))
            && (this.getIndustry() == null ? other.getIndustry() == null : this.getIndustry().equals(other.getIndustry()))
            && (this.getFinancStage() == null ? other.getFinancStage() == null : this.getFinancStage().equals(other.getFinancStage()))
            && (this.getWorkTime() == null ? other.getWorkTime() == null : this.getWorkTime().equals(other.getWorkTime()))
            && (this.getIntroduction() == null ? other.getIntroduction() == null : this.getIntroduction().equals(other.getIntroduction()))
            && (this.getAdvantage() == null ? other.getAdvantage() == null : this.getAdvantage().equals(other.getAdvantage()))
            && (this.getBenefits() == null ? other.getBenefits() == null : this.getBenefits().equals(other.getBenefits()))
            && (this.getBonus() == null ? other.getBonus() == null : this.getBonus().equals(other.getBonus()))
            && (this.getSubsidy() == null ? other.getSubsidy() == null : this.getSubsidy().equals(other.getSubsidy()))
            && (this.getBuildDate() == null ? other.getBuildDate() == null : this.getBuildDate().equals(other.getBuildDate()))
            && (this.getRegistCapital() == null ? other.getRegistCapital() == null : this.getRegistCapital().equals(other.getRegistCapital()))
            && (this.getRegistPlace() == null ? other.getRegistPlace() == null : this.getRegistPlace().equals(other.getRegistPlace()))
            && (this.getLegalRepresentative() == null ? other.getLegalRepresentative() == null : this.getLegalRepresentative().equals(other.getLegalRepresentative()))
            && (this.getReviewStatus() == null ? other.getReviewStatus() == null : this.getReviewStatus().equals(other.getReviewStatus()))
            && (this.getReviewReplay() == null ? other.getReviewReplay() == null : this.getReviewReplay().equals(other.getReviewReplay()))
            && (this.getAuthLetter() == null ? other.getAuthLetter() == null : this.getAuthLetter().equals(other.getAuthLetter()))
            && (this.getCommitUserId() == null ? other.getCommitUserId() == null : this.getCommitUserId().equals(other.getCommitUserId()))
            && (this.getCommitUserMobile() == null ? other.getCommitUserMobile() == null : this.getCommitUserMobile().equals(other.getCommitUserMobile()))
            && (this.getCommitDate() == null ? other.getCommitDate() == null : this.getCommitDate().equals(other.getCommitDate()))
            && (this.getIsVip() == null ? other.getIsVip() == null : this.getIsVip().equals(other.getIsVip()))
            && (this.getVipExpireDate() == null ? other.getVipExpireDate() == null : this.getVipExpireDate().equals(other.getVipExpireDate()))
            && (this.getCreatedTime() == null ? other.getCreatedTime() == null : this.getCreatedTime().equals(other.getCreatedTime()))
            && (this.getUpdatedTime() == null ? other.getUpdatedTime() == null : this.getUpdatedTime().equals(other.getUpdatedTime()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCompanyName() == null) ? 0 : getCompanyName().hashCode());
        result = prime * result + ((getShortName() == null) ? 0 : getShortName().hashCode());
        result = prime * result + ((getLogo() == null) ? 0 : getLogo().hashCode());
        result = prime * result + ((getBizLicense() == null) ? 0 : getBizLicense().hashCode());
        result = prime * result + ((getCountry() == null) ? 0 : getCountry().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getCity() == null) ? 0 : getCity().hashCode());
        result = prime * result + ((getDistrict() == null) ? 0 : getDistrict().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getNature() == null) ? 0 : getNature().hashCode());
        result = prime * result + ((getPeopleSize() == null) ? 0 : getPeopleSize().hashCode());
        result = prime * result + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        result = prime * result + ((getFinancStage() == null) ? 0 : getFinancStage().hashCode());
        result = prime * result + ((getWorkTime() == null) ? 0 : getWorkTime().hashCode());
        result = prime * result + ((getIntroduction() == null) ? 0 : getIntroduction().hashCode());
        result = prime * result + ((getAdvantage() == null) ? 0 : getAdvantage().hashCode());
        result = prime * result + ((getBenefits() == null) ? 0 : getBenefits().hashCode());
        result = prime * result + ((getBonus() == null) ? 0 : getBonus().hashCode());
        result = prime * result + ((getSubsidy() == null) ? 0 : getSubsidy().hashCode());
        result = prime * result + ((getBuildDate() == null) ? 0 : getBuildDate().hashCode());
        result = prime * result + ((getRegistCapital() == null) ? 0 : getRegistCapital().hashCode());
        result = prime * result + ((getRegistPlace() == null) ? 0 : getRegistPlace().hashCode());
        result = prime * result + ((getLegalRepresentative() == null) ? 0 : getLegalRepresentative().hashCode());
        result = prime * result + ((getReviewStatus() == null) ? 0 : getReviewStatus().hashCode());
        result = prime * result + ((getReviewReplay() == null) ? 0 : getReviewReplay().hashCode());
        result = prime * result + ((getAuthLetter() == null) ? 0 : getAuthLetter().hashCode());
        result = prime * result + ((getCommitUserId() == null) ? 0 : getCommitUserId().hashCode());
        result = prime * result + ((getCommitUserMobile() == null) ? 0 : getCommitUserMobile().hashCode());
        result = prime * result + ((getCommitDate() == null) ? 0 : getCommitDate().hashCode());
        result = prime * result + ((getIsVip() == null) ? 0 : getIsVip().hashCode());
        result = prime * result + ((getVipExpireDate() == null) ? 0 : getVipExpireDate().hashCode());
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
        sb.append(", companyName=").append(companyName);
        sb.append(", shortName=").append(shortName);
        sb.append(", logo=").append(logo);
        sb.append(", bizLicense=").append(bizLicense);
        sb.append(", country=").append(country);
        sb.append(", province=").append(province);
        sb.append(", city=").append(city);
        sb.append(", district=").append(district);
        sb.append(", address=").append(address);
        sb.append(", nature=").append(nature);
        sb.append(", peopleSize=").append(peopleSize);
        sb.append(", industry=").append(industry);
        sb.append(", financStage=").append(financStage);
        sb.append(", workTime=").append(workTime);
        sb.append(", introduction=").append(introduction);
        sb.append(", advantage=").append(advantage);
        sb.append(", benefits=").append(benefits);
        sb.append(", bonus=").append(bonus);
        sb.append(", subsidy=").append(subsidy);
        sb.append(", buildDate=").append(buildDate);
        sb.append(", registCapital=").append(registCapital);
        sb.append(", registPlace=").append(registPlace);
        sb.append(", legalRepresentative=").append(legalRepresentative);
        sb.append(", reviewStatus=").append(reviewStatus);
        sb.append(", reviewReplay=").append(reviewReplay);
        sb.append(", authLetter=").append(authLetter);
        sb.append(", commitUserId=").append(commitUserId);
        sb.append(", commitUserMobile=").append(commitUserMobile);
        sb.append(", commitDate=").append(commitDate);
        sb.append(", isVip=").append(isVip);
        sb.append(", vipExpireDate=").append(vipExpireDate);
        sb.append(", createdTime=").append(createdTime);
        sb.append(", updatedTime=").append(updatedTime);
        sb.append("]");
        return sb.toString();
    }
}