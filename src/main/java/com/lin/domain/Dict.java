package com.lin.domain;

import java.util.Date;

/**
 * 系统字典 表 sys_dict
 * 
 * @author linzixiang
 * @date 2019_05_133
 */
public class Dict {

	private static final long serialVersionUID = 1L;
	
	/** 主键 */
	private Long dictId;
	/** 字典名称 */
	private String dictName;
	/** 唯一编码 */
	private String dictCode;
	/** 是否停用 （0正常 1停用） */
	private Integer status;
	/** 删除标志 （0代表存在 2代表删除） */
	private Integer delFlag;
	/** 创建者 */
	private Long createdBy;
	/** 创建时间 */
	private Date createdTime;
	/** 更新者 */
	private Long updatedBy;
	/** 更新时间 */
	private Date updatedTime;
	/** 乐观锁 */
	private Integer revision;
	/** 备注 */
	private String remark;

	public void setDictId(Long dictId) {
		this.dictId = dictId;
	}
	public Long getDictId() {
		return dictId;
	}

	public void setDictName(String dictName) {
		this.dictName = dictName;
	}
	public String getDictName() {
		return dictName;
	}

	public void setDictCode(String dictCode) {
		this.dictCode = dictCode;
	}
	public String getDictCode() {
		return dictCode;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Integer getDelFlag() {
		return delFlag;
	}

	public void setDelFlag(Integer delFlag) {
		this.delFlag = delFlag;
	}

	public Long getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Long createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Long getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(Long updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

	public Integer getRevision() {
		return revision;
	}

	public void setRevision(Integer revision) {
		this.revision = revision;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	@Override
	public String toString() {
		return "Dict{" +
				"dictId=" + dictId +
				", dictName='" + dictName + '\'' +
				", dictCode='" + dictCode + '\'' +
				", status=" + status +
				", delFlag=" + delFlag +
				", createdBy=" + createdBy +
				", createdTime=" + createdTime +
				", updatedBy=" + updatedBy +
				", updatedTime=" + updatedTime +
				", revision=" + revision +
				", remark='" + remark + '\'' +
				'}';
	}
}
