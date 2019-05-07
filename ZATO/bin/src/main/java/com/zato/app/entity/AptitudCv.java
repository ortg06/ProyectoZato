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
 * AptitudCv generated by hbm2java
 */
@Entity
@Table(name="APTITUD_CV"
    ,schema="SYSTEM"
)
public class AptitudCv  implements java.io.Serializable {


     private BigDecimal pkAptitudCv;
     private Cv cv;
     private CatalogoAptitud catalogoAptitud;

    public AptitudCv() {
    }

    public AptitudCv(BigDecimal pkAptitudCv, Cv cv, CatalogoAptitud catalogoAptitud) {
       this.pkAptitudCv = pkAptitudCv;
       this.cv = cv;
       this.catalogoAptitud = catalogoAptitud;
    }
   
     @Id 

    
    @Column(name="PK_APTITUD_CV", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getPkAptitudCv() {
        return this.pkAptitudCv;
    }
    
    public void setPkAptitudCv(BigDecimal pkAptitudCv) {
        this.pkAptitudCv = pkAptitudCv;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PK_CV", nullable=false)
    public Cv getCv() {
        return this.cv;
    }
    
    public void setCv(Cv cv) {
        this.cv = cv;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PK_CATALOGO_APTITUD", nullable=false)
    public CatalogoAptitud getCatalogoAptitud() {
        return this.catalogoAptitud;
    }
    
    public void setCatalogoAptitud(CatalogoAptitud catalogoAptitud) {
        this.catalogoAptitud = catalogoAptitud;
    }




}


