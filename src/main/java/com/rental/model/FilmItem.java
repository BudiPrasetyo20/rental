package com.rental.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.annotations.ForeignKey;

import com.rental.common.CommonUtil;
import com.rental.common.CreateAudit;
import com.rental.common.UpdateAudit;
import com.rental.enumeration.FilmItemStatusType;

@Entity
@Table(name = "FILM_ITEM")
public class FilmItem implements CreateAudit, UpdateAudit {

	@Id
	@Column(name = "ID", length = 20)
	private String id;

	@Column(name = "FID_FILM", length = 20)
	private String fidFilm;

	@Column(name = "TYPE_FILM", length = 2)
	private String typeFilm;

	@Column(name = "QUANTITY_DISK")
	private Integer qtyDisk;

	@Column(name = "TANGGAL_MASUK")
	private Date tanggalMasuk;

	@Column(name = "TANGGAL_AVAILABLE")
	private Date tanggalAvailable;

	@Column(name = "STATUS_KONDISI", length = 1)
	private Character statusKondisi = FilmItemStatusType.Good.getVal();

	@Column(name = "REMARKS", columnDefinition = "TEXT")
	private String remarks;

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

	@ManyToOne(fetch = FetchType.LAZY)
	@ForeignKey(name = "none")
	@JoinColumn(name = "FID_FILM", insertable = false, updatable = false)
	private Film film;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFidFilm() {
		return fidFilm;
	}

	public void setFidFilm(String fidFilm) {
		this.fidFilm = fidFilm;
	}

	public String getTypeFilm() {
		return typeFilm;
	}

	public void setTypeFilm(String typeFilm) {
		this.typeFilm = typeFilm;
	}

	public Integer getQtyDisk() {
		return qtyDisk;
	}

	public void setQtyDisk(Integer qtyDisk) {
		this.qtyDisk = qtyDisk;
	}

	public Date getTanggalMasuk() {
		return tanggalMasuk;
	}

	public void setTanggalMasuk(Date tanggalMasuk) {
		this.tanggalMasuk = tanggalMasuk;
	}

	public Date getTanggalAvailable() {
		return tanggalAvailable;
	}

	public void setTanggalAvailable(Date tanggalAvailable) {
		this.tanggalAvailable = tanggalAvailable;
	}

	public Character getStatusKondisi() {
		return statusKondisi;
	}

	public void setStatusKondisi(Character statusKondisi) {
		this.statusKondisi = statusKondisi;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
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

	public Film getFilm() {
		return film;
	}

	public void setFilm(Film film) {
		this.film = film;
	}

	@Override
	public boolean isNew() {
		if (CommonUtil.isNotNullOrEmpty(getLastUpdateDate())) {
			return false;
		} else {
			return true;
		}
	}

}
