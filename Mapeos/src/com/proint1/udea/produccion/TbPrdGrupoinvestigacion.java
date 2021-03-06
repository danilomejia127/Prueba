package com.proint1.udea.produccion;

// default package
// Generated 24/11/2014 10:29:53 PM by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import com.proint1.udea.administracion.TbAdmPersona;

/**
 * TbPrdGrupoinvestigacion generated by hbm2java
 */
public class TbPrdGrupoinvestigacion implements java.io.Serializable {

	private long nbIdn;
	private TbAdmPersona tbAdmPersona;
	private String vrNombre;
	private String vrAbreviatura;
	private Date dtFechacreacion;
	private char blEstado;
	private String vrAdtusuario;
	private Date dtAdtfecha;
	private Set tbPrdMiembrosxgrupos = new HashSet(0);

	public TbPrdGrupoinvestigacion() {
	}

	public TbPrdGrupoinvestigacion(long nbIdn, TbAdmPersona tbAdmPersona,
			String vrNombre, Date dtFechacreacion, char blEstado,
			String vrAdtusuario, Date dtAdtfecha) {
		this.nbIdn = nbIdn;
		this.tbAdmPersona = tbAdmPersona;
		this.vrNombre = vrNombre;
		this.dtFechacreacion = dtFechacreacion;
		this.blEstado = blEstado;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
	}

	public TbPrdGrupoinvestigacion(long nbIdn, TbAdmPersona tbAdmPersona,
			String vrNombre, String vrAbreviatura, Date dtFechacreacion,
			char blEstado, String vrAdtusuario, Date dtAdtfecha,
			Set tbPrdMiembrosxgrupos) {
		this.nbIdn = nbIdn;
		this.tbAdmPersona = tbAdmPersona;
		this.vrNombre = vrNombre;
		this.vrAbreviatura = vrAbreviatura;
		this.dtFechacreacion = dtFechacreacion;
		this.blEstado = blEstado;
		this.vrAdtusuario = vrAdtusuario;
		this.dtAdtfecha = dtAdtfecha;
		this.tbPrdMiembrosxgrupos = tbPrdMiembrosxgrupos;
	}

	public long getNbIdn() {
		return this.nbIdn;
	}

	public void setNbIdn(long nbIdn) {
		this.nbIdn = nbIdn;
	}

	public TbAdmPersona getTbAdmPersona() {
		return this.tbAdmPersona;
	}

	public void setTbAdmPersona(TbAdmPersona tbAdmPersona) {
		this.tbAdmPersona = tbAdmPersona;
	}

	public String getVrNombre() {
		return this.vrNombre;
	}

	public void setVrNombre(String vrNombre) {
		this.vrNombre = vrNombre;
	}

	public String getVrAbreviatura() {
		return this.vrAbreviatura;
	}

	public void setVrAbreviatura(String vrAbreviatura) {
		this.vrAbreviatura = vrAbreviatura;
	}

	public Date getDtFechacreacion() {
		return this.dtFechacreacion;
	}

	public void setDtFechacreacion(Date dtFechacreacion) {
		this.dtFechacreacion = dtFechacreacion;
	}

	public char getBlEstado() {
		return this.blEstado;
	}

	public void setBlEstado(char blEstado) {
		this.blEstado = blEstado;
	}

	public String getVrAdtusuario() {
		return this.vrAdtusuario;
	}

	public void setVrAdtusuario(String vrAdtusuario) {
		this.vrAdtusuario = vrAdtusuario;
	}

	public Date getDtAdtfecha() {
		return this.dtAdtfecha;
	}

	public void setDtAdtfecha(Date dtAdtfecha) {
		this.dtAdtfecha = dtAdtfecha;
	}

	public Set getTbPrdMiembrosxgrupos() {
		return this.tbPrdMiembrosxgrupos;
	}

	public void setTbPrdMiembrosxgrupos(Set tbPrdMiembrosxgrupos) {
		this.tbPrdMiembrosxgrupos = tbPrdMiembrosxgrupos;
	}

}
