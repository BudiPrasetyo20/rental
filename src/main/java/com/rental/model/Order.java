package com.rental.model;

import java.math.BigDecimal;
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
import com.rental.enumeration.OrderStatusType;

@Entity
@Table(name = "ORDERS")
public class Order implements CreateAudit, UpdateAudit {

	@Id
	@Column(name = "ID", length = 20)
	private String id;

	@Column(name = "TANGGAL_PINJAM")
	private Date tanggalPinjam;

	@Column(name = "TANGGAL_JATUH_TEMPO")
	private Date tanggalJatuhTempo;

	@Column(name = "TANGGAL_KEMBALI")
	private Date tanggalKembali;

	@Column(name = "FID_USER_MEMBER", length = 20)
	private String fidUserMember;

	@Column(name = "FID_USER_ADMIN", length = 20)
	private String fidUserAdmin;

	@Column(name = "TOTAL_QUANTITY_DISK")
	private Integer totalQuantityDisk;

	@Column(name = "TOTAL_HARGA", precision = 18, scale = 2)
	private BigDecimal totalHarga;

	@Column(name = "TOTAL_DENDA", precision = 18, scale = 2)
	private BigDecimal totalDenda;

	@Column(name = "JAMINAN", columnDefinition = "TEXT")
	private String jaminan;

	@Column(name = "STATUS_PINJAMAN", length = 2)
	private String statusPinjaman = OrderStatusType.Process.getVal();

	@Column(name = "CREATE_BY", nullable = false, length = 20)
	private String createBy;

	@Version
	@Column(name = "CREATE_DATE", nullable = false)
	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(name = "LAST_UPDATE_BY", length = 20)
	private String lastUpdateBy;

	@Version
	@Column(name = "LAST_UPDATE_DATE")
	@Temporal(TemporalType.TIMESTAMP)
	private Date lastUpdateDate;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Date getTanggalPinjam() {
		return tanggalPinjam;
	}

	public void setTanggalPinjam(Date tanggalPinjam) {
		this.tanggalPinjam = tanggalPinjam;
	}

	public Date getTanggalJatuhTempo() {
		return tanggalJatuhTempo;
	}

	public void setTanggalJatuhTempo(Date tanggalJatuhTempo) {
		this.tanggalJatuhTempo = tanggalJatuhTempo;
	}

	public Date getTanggalKembali() {
		return tanggalKembali;
	}

	public void setTanggalKembali(Date tanggalKembali) {
		this.tanggalKembali = tanggalKembali;
	}

	public String getFidUserMember() {
		return fidUserMember;
	}

	public void setFidUserMember(String fidUserMember) {
		this.fidUserMember = fidUserMember;
	}

	public String getFidUserAdmin() {
		return fidUserAdmin;
	}

	public void setFidUserAdmin(String fidUserAdmin) {
		this.fidUserAdmin = fidUserAdmin;
	}

	public Integer getTotalQuantityDisk() {
		return totalQuantityDisk;
	}

	public void setTotalQuantityDisk(Integer totalQuantityDisk) {
		this.totalQuantityDisk = totalQuantityDisk;
	}

	public BigDecimal getTotalHarga() {
		return totalHarga;
	}

	public void setTotalHarga(BigDecimal totalHarga) {
		this.totalHarga = totalHarga;
	}

	public BigDecimal getTotalDenda() {
		return totalDenda;
	}

	public void setTotalDenda(BigDecimal totalDenda) {
		this.totalDenda = totalDenda;
	}

	public String getJaminan() {
		return jaminan;
	}

	public void setJaminan(String jaminan) {
		this.jaminan = jaminan;
	}

	public String getStatusPinjaman() {
		return statusPinjaman;
	}

	public void setStatusPinjaman(String statusPinjaman) {
		this.statusPinjaman = statusPinjaman;
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
		if (CommonUtil.isNotNullOrEmpty(getLastUpdateDate())) {
			return false;
		} else {
			return true;
		}
	}

}
