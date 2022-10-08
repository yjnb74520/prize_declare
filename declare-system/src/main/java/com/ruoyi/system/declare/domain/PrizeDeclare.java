package com.ruoyi.system.declare.domain;

import java.util.Date;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.ruoyi.common.annotation.Excel;
import com.ruoyi.common.core.domain.BaseEntity;

/**
 * 参赛申报对象 prize_declare
 * 
 * @author ruoyi
 * @date 2022-10-08
 */
public class PrizeDeclare extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 申报ID */
    private String declareId;

    /** 申请人ID */
    @Excel(name = "申请人ID")
    private Long applicantId;

    /** 申请部门 */
    @Excel(name = "申请部门")
    private String applicantDept;

    /** 赛项名称 */
    @Excel(name = "赛项名称")
    private String matchName;

    /** 竞赛类别;字典 */
    @Excel(name = "竞赛类别;字典")
    private String competitionCategory;

    /** 竞赛等级;字典 */
    @Excel(name = "竞赛等级;字典")
    private String competitionLeve;

    /** 所属专业群ID;字典 */
    @Excel(name = "所属专业群ID;字典")
    private String professionalId;

    /** 承办单位 */
    @Excel(name = "承办单位")
    private String undertaker;

    /** 参赛地点 */
    @Excel(name = "参赛地点")
    private String contestAddress;

    /** 参赛预估金额 */
    @Excel(name = "参赛预估金额")
    private String estimateAmount;

    /** 所属课程;多选?? */
    @Excel(name = "所属课程;多选??")
    private String ascriptionCurriculum;

    /** 比赛时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "比赛时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date matchTime;

    /** 初赛申请审批意见 */
    @Excel(name = "初赛申请审批意见")
    private String processOpinion;

    /** 流程ID(状态);字典 */
    @Excel(name = "流程ID(状态);字典")
    private String processId;

    /** 删除标识 */
    private Long delFlag;

    /** 租户号 */
    @Excel(name = "租户号")
    private String tenantId;

    /** 乐观锁 */
    @Excel(name = "乐观锁")
    private String revision;

    /** 创建人 */
    @Excel(name = "创建人")
    private String createdBy;

    /** 创建时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "创建时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date createdTime;

    /** 更新人 */
    @Excel(name = "更新人")
    private String updatedBy;

    /** 更新时间 */
    @JsonFormat(pattern = "yyyy-MM-dd")
    @Excel(name = "更新时间", width = 30, dateFormat = "yyyy-MM-dd")
    private Date updatedTime;

    public void setDeclareId(String declareId) 
    {
        this.declareId = declareId;
    }

    public String getDeclareId() 
    {
        return declareId;
    }
    public void setApplicantId(Long applicantId) 
    {
        this.applicantId = applicantId;
    }

    public Long getApplicantId() 
    {
        return applicantId;
    }
    public void setApplicantDept(String applicantDept) 
    {
        this.applicantDept = applicantDept;
    }

    public String getApplicantDept() 
    {
        return applicantDept;
    }
    public void setMatchName(String matchName) 
    {
        this.matchName = matchName;
    }

    public String getMatchName() 
    {
        return matchName;
    }
    public void setCompetitionCategory(String competitionCategory) 
    {
        this.competitionCategory = competitionCategory;
    }

    public String getCompetitionCategory() 
    {
        return competitionCategory;
    }
    public void setCompetitionLeve(String competitionLeve) 
    {
        this.competitionLeve = competitionLeve;
    }

    public String getCompetitionLeve() 
    {
        return competitionLeve;
    }
    public void setProfessionalId(String professionalId) 
    {
        this.professionalId = professionalId;
    }

    public String getProfessionalId() 
    {
        return professionalId;
    }
    public void setUndertaker(String undertaker) 
    {
        this.undertaker = undertaker;
    }

    public String getUndertaker() 
    {
        return undertaker;
    }
    public void setContestAddress(String contestAddress) 
    {
        this.contestAddress = contestAddress;
    }

    public String getContestAddress() 
    {
        return contestAddress;
    }
    public void setEstimateAmount(String estimateAmount) 
    {
        this.estimateAmount = estimateAmount;
    }

    public String getEstimateAmount() 
    {
        return estimateAmount;
    }
    public void setAscriptionCurriculum(String ascriptionCurriculum) 
    {
        this.ascriptionCurriculum = ascriptionCurriculum;
    }

    public String getAscriptionCurriculum() 
    {
        return ascriptionCurriculum;
    }
    public void setMatchTime(Date matchTime) 
    {
        this.matchTime = matchTime;
    }

    public Date getMatchTime() 
    {
        return matchTime;
    }
    public void setProcessOpinion(String processOpinion) 
    {
        this.processOpinion = processOpinion;
    }

    public String getProcessOpinion() 
    {
        return processOpinion;
    }
    public void setProcessId(String processId) 
    {
        this.processId = processId;
    }

    public String getProcessId() 
    {
        return processId;
    }
    public void setDelFlag(Long delFlag) 
    {
        this.delFlag = delFlag;
    }

    public Long getDelFlag() 
    {
        return delFlag;
    }
    public void setTenantId(String tenantId) 
    {
        this.tenantId = tenantId;
    }

    public String getTenantId() 
    {
        return tenantId;
    }
    public void setRevision(String revision) 
    {
        this.revision = revision;
    }

    public String getRevision() 
    {
        return revision;
    }
    public void setCreatedBy(String createdBy) 
    {
        this.createdBy = createdBy;
    }

    public String getCreatedBy() 
    {
        return createdBy;
    }
    public void setCreatedTime(Date createdTime) 
    {
        this.createdTime = createdTime;
    }

    public Date getCreatedTime() 
    {
        return createdTime;
    }
    public void setUpdatedBy(String updatedBy) 
    {
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy() 
    {
        return updatedBy;
    }
    public void setUpdatedTime(Date updatedTime) 
    {
        this.updatedTime = updatedTime;
    }

    public Date getUpdatedTime() 
    {
        return updatedTime;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("declareId", getDeclareId())
            .append("applicantId", getApplicantId())
            .append("applicantDept", getApplicantDept())
            .append("matchName", getMatchName())
            .append("competitionCategory", getCompetitionCategory())
            .append("competitionLeve", getCompetitionLeve())
            .append("professionalId", getProfessionalId())
            .append("undertaker", getUndertaker())
            .append("contestAddress", getContestAddress())
            .append("estimateAmount", getEstimateAmount())
            .append("ascriptionCurriculum", getAscriptionCurriculum())
            .append("matchTime", getMatchTime())
            .append("processOpinion", getProcessOpinion())
            .append("processId", getProcessId())
            .append("delFlag", getDelFlag())
            .append("tenantId", getTenantId())
            .append("revision", getRevision())
            .append("createdBy", getCreatedBy())
            .append("createdTime", getCreatedTime())
            .append("updatedBy", getUpdatedBy())
            .append("updatedTime", getUpdatedTime())
            .toString();
    }
}
