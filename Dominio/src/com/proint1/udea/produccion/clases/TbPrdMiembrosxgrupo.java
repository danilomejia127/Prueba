package com.proint1.udea.produccion.clases;

import com.proint1.udea.administracion.entidades.terceros.Persona;

// default package
// Generated 10-may-2014 11:58:30 by Hibernate Tools 3.4.0.CR1

/**
 * TbPrdMiembrosxgrupo generated by hbm2java
 */
public class TbPrdMiembrosxgrupo implements java.io.Serializable {

	private long nbMieIdn;
	private Persona tbAdmPersona;
	private TbPrdGrupoinvestigacion tbPrdGrupoinvestigacion;

	public TbPrdMiembrosxgrupo() {
	}

	public TbPrdMiembrosxgrupo(long nbMieIdn, Persona tbAdmPersona,
			TbPrdGrupoinvestigacion tbPrdGrupoinvestigacion) {
		this.nbMieIdn = nbMieIdn;
		this.tbAdmPersona = tbAdmPersona;
		this.tbPrdGrupoinvestigacion = tbPrdGrupoinvestigacion;
	}

	public long getNbMieIdn() {
		return this.nbMieIdn;
	}

	public void setNbMieIdn(long nbMieIdn) {
		this.nbMieIdn = nbMieIdn;
	}

	public Persona getTbAdmPersona() {
		return this.tbAdmPersona;
	}

	public void setTbAdmPersona(Persona tbAdmPersona) {
		this.tbAdmPersona = tbAdmPersona;
	}

	public TbPrdGrupoinvestigacion getTbPrdGrupoinvestigacion() {
		return this.tbPrdGrupoinvestigacion;
	}

	public void setTbPrdGrupoinvestigacion(
			TbPrdGrupoinvestigacion tbPrdGrupoinvestigacion) {
		this.tbPrdGrupoinvestigacion = tbPrdGrupoinvestigacion;
	}

}