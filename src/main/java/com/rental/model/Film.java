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

@Entity
@Table(name = "FILM")
public class Film implements CreateAudit, UpdateAudit {

	@Id
	@Column(name = "ID", length = 20)
	private String id;

	@Column(name = "JUDUL_FILM", length = 100)
	private String judulFilm;

	@Column(name = "TAHUN_KELUAR", length = 4)
	private String tahunKeluar;

	@Column(name = "NEGARA_ASAL", length = 20)
	private String negaraAsal;

	@Column(name = "GENRE", length = 100)
	private String genre;

	@Column(name = "SUTRADARA", length = 20)
	private String sutradara;

	@Column(name = "BINTANG_FILM", length = 100)
	private String bintangFilm;

	@Column(name = "RATTING_FILM", length = 5)
	private String rattingFilm;

	@Column(name = "DESKRIPSI", columnDefinition = "TEXT")
	private String deskripsi;

	@Column(name = "TANGGAL_MASUK")
	private Date tanggalMasuk;

	@Column(name = "STATUS", length = 1)
	private Character status = ActiveDeactiveType.Active.getVal();

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

	// get n set
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getJudulFilm() {
		return judulFilm;
	}

	public void setJudulFilm(String judulFilm) {
		this.judulFilm = judulFilm;
	}

	public String getTahunKeluar() {
		return tahunKeluar;
	}

	public void setTahunKeluar(String tahunKeluar) {
		this.tahunKeluar = tahunKeluar;
	}

	public String getNegaraAsal() {
		return negaraAsal;
	}

	public void setNegaraAsal(String negaraAsal) {
		this.negaraAsal = negaraAsal;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public String getSutradara() {
		return sutradara;
	}

	public void setSutradara(String sutradara) {
		this.sutradara = sutradara;
	}

	public String getBintangFilm() {
		return bintangFilm;
	}

	public void setBintangFilm(String bintangFilm) {
		this.bintangFilm = bintangFilm;
	}

	public String getRattingFilm() {
		return rattingFilm;
	}

	public void setRattingFilm(String rattingFilm) {
		this.rattingFilm = rattingFilm;
	}

	public String getDeskripsi() {
		return deskripsi;
	}

	public void setDeskripsi(String deskripsi) {
		this.deskripsi = deskripsi;
	}

	public Date getTanggalMasuk() {
		return tanggalMasuk;
	}

	public void setTanggalMasuk(Date tanggalMasuk) {
		this.tanggalMasuk = tanggalMasuk;
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

	public Character getStatus() {
		return status;
	}

	public void setStatus(Character status) {
		this.status = status;
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
