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
import com.rental.enumeration.ActiveDeactiveType;
import com.rental.enumeration.AvailableUnavailableType;
import com.rental.enumeration.UserType;


@Entity
@Table(name="MST_USER")
public class User implements CreateAudit, UpdateAudit{

	@Id 
	@Column(name = "ID", length = 20)
	private String id;
	
	@Column(name = "NAME", length = 100)
	private String name;
	
	@Column(name = "ADDRESS",  columnDefinition = "text")
	private String address;
	
	@Column(name = "TELP", length = 20)
	private String telp;

	@Column(name = "IDENTITY_NUMBER", length = 100)
	private String identityNumber;
	
	@Column(name = "USER_TYPE", length = 1)
	private Character userType=UserType.Member.getVal();
	
	@Column(name = "USER_STATUS", length = 1)
	private Character userStatus=ActiveDeactiveType.Active.getVal();
	
	@Column(name = "USER_STATUS_BORROW", length = 1)
	private Character userStatusBorrow=AvailableUnavailableType.Unavailable.getVal();
	
	@Column(name = "PASSWORD", length = 100)
	private String password;
	
	@Temporal(TemporalType.DATE)
	@Column(name = "REGISTER_DATE")
	private Date registerDate;
	
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
	
	
	//SET && GET
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getTelp() {
		return telp;
	}

	public void setTelp(String telp) {
		this.telp = telp;
	}

	public String getIdentityNumber() {
		return identityNumber;
	}

	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}

	public Character getUserType() {
		return userType;
	}

	public void setUserType(Character userType) {
		this.userType = userType;
	}

	public Character getUserStatus() {
		return userStatus;
	}

	public void setUserStatus(Character userStatus) {
		this.userStatus = userStatus;
	}

	public Character getUserStatusBorrow() {
		return userStatusBorrow;
	}

	public void setUserStatusBorrow(Character userStatusBorrow) {
		this.userStatusBorrow = userStatusBorrow;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getRegisterDate() {
		return registerDate;
	}

	public void setRegisterDate(Date registerDate) {
		this.registerDate = registerDate;
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
