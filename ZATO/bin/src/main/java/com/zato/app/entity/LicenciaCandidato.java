package com.zato.app.entity;
// Generated 7/05/2019 08:58:15 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * LicenciaCandidato generated by hbm2java
 */
@Entity
@Table(name="LICENCIA_CANDIDATO"
    ,schema="SYSTEM"
)
public class LicenciaCandidato  implements java.io.Serializable {


     private BigDecimal pkLicenciaCandidato;
     private CatalogoLicencia catalogoLicencia;
     private Cv cv;
     private BigDecimal pkCandidato;

    public LicenciaCandidato() {
    }

	
    public LicenciaCandidato(BigDecimal pkLicenciaCandidato, CatalogoLicencia catalogoLicencia, BigDecimal pkCandidato) {
        this.pkLicenciaCandidato = pkLicenciaCandidato;
        this.catalogoLicencia = catalogoLicencia;
        this.pkCandidato = pkCandidato;
    }
    public LicenciaCandidato(BigDecimal pkLicenciaCandidato, CatalogoLicencia catalogoLicencia, Cv cv, BigDecimal pkCandidato) {
       this.pkLicenciaCandidato = pkLicenciaCandidato;
       this.catalogoLicencia = catalogoLicencia;
       this.cv = cv;
       this.pkCandidato = pkCandidato;
    }
   
     @Id 

    
    @Column(name="PK_LICENCIA_CANDIDATO", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getPkLicenciaCandidato() {
        return this.pkLicenciaCandidato;
    }
    
    public void setPkLicenciaCandidato(BigDecimal pkLicenciaCandidato) {
        this.pkLicenciaCandidato = pkLicenciaCandidato;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PK_CATALOGO_LICENCIA", nullable=false)
    public CatalogoLicencia getCatalogoLicencia() {
        return this.catalogoLicencia;
    }
    
    public void setCatalogoLicencia(CatalogoLicencia catalogoLicencia) {
        this.catalogoLicencia = catalogoLicencia;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PK_CV")
    public Cv getCv() {
        return this.cv;
    }
    
    public void setCv(Cv cv) {
        this.cv = cv;
    }

    
    @Column(name="PK_CANDIDATO", nullable=false, precision=22, scale=0)
    public BigDecimal getPkCandidato() {
        return this.pkCandidato;
    }
    
    public void setPkCandidato(BigDecimal pkCandidato) {
        this.pkCandidato = pkCandidato;
    }




}

