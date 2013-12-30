package com.rental.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import com.rental.common.CommonUtil;
import com.rental.common.CreateAudit;
import com.rental.common.UpdateAudit;

@Entity
@Table(name="MST_SETTING")
public class Setting implements CreateAudit, UpdateAudit{

	@Id 
	@Column(name = "ID", length = 5)
	private String id;
	
	@Column(name = "VALUE", length = 100)
	private String value;
	
	@Column(name = "CREATE_BY", length = 20)
	private String createBy;

	@Version
	@Column(name = "CREATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(name = "LAST_UPDATE_BY", length = 20)
	private String lastUpdateBy;
	
	@Version
	@Column(name = "LAST_UPDATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdateDate;

	//get n set
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getLastUpdateBy() {
		return lastUpdateBy;
	}

	public void setLastUpdateBy(String lastUpdateBy) {
		this.lastUpdateBy = lastUpdateBy;
	}

	public Date getLastUpdateDate() {
		return lastUpdateDate;
	}

	public void setLastUpdateDate(Date lastUpdateDate) {
		this.lastUpdateDate = lastUpdateDate;
	}
	
	@Override
	public boolean isNew() {
		if(CommonUtil.isNotNullOrEmpty(getLastUpdateDate())){
			return false;
		}
		else{
			return true;
		}
	}
	
}
