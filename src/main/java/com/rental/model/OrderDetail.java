package com.rental.model;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import com.rental.common.CommonUtil;
import com.rental.common.interfaces.ICreateAudit;
import com.rental.common.interfaces.IUpdateAudit;

@Entity
@Table(name="ORDER_DETAIL")
public class OrderDetail implements ICreateAudit, IUpdateAudit{
	
	@Id
	@Column(name = "ID")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name = "FID_ORDER", length = 20)
	private String fidOrder;
	
	@Column(name = "FID_FILM_ITEM", length = 20)
	private String fidFilmItem;
	
	@Column(name ="HARGA_PERKEPING",precision=18, scale=2)
	private BigDecimal hargaperKeping;
	
	@Column(name ="DENDA_PERKEPING",precision=18, scale=2)
	private BigDecimal dendaPerkeping;
	
	@Column(name ="QUANTITY_PERKEPING")
	private Integer quantityPerkeping;
	
	@Column(name ="HARGA",precision=18, scale=2)
	private BigDecimal harga;
	
	@Column(name ="DENDA",precision=18, scale=2)
	private BigDecimal denda;
	
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFidOrder() {
		return fidOrder;
	}

	public void setFidOrder(String fidOrder) {
		this.fidOrder = fidOrder;
	}

	public String getFidFilmItem() {
		return fidFilmItem;
	}

	public void setFidFilmItem(String fidFilmItem) {
		this.fidFilmItem = fidFilmItem;
	}

	public BigDecimal getHargaperKeping() {
		return hargaperKeping;
	}

	public void setHargaperKeping(BigDecimal hargaperKeping) {
		this.hargaperKeping = hargaperKeping;
	}

	public BigDecimal getDendaPerkeping() {
		return dendaPerkeping;
	}

	public void setDendaPerkeping(BigDecimal dendaPerkeping) {
		this.dendaPerkeping = dendaPerkeping;
	}

	public Integer getQuantityPerkeping() {
		return quantityPerkeping;
	}

	public void setQuantityPerkeping(Integer quantityPerkeping) {
		this.quantityPerkeping = quantityPerkeping;
	}

	public BigDecimal getHarga() {
		return harga;
	}

	public void setHarga(BigDecimal harga) {
		this.harga = harga;
	}

	public BigDecimal getDenda() {
		return denda;
	}

	public void setDenda(BigDecimal denda) {
		this.denda = denda;
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
