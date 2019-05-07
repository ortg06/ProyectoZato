package com.zato.app.entity;
// Generated 7/05/2019 08:58:15 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
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

/**
 * FormacionAcademica generated by hbm2java
 */
@Entity
@Table(name="FORMACION_ACADEMICA"
    ,schema="SYSTEM"
)
public class FormacionAcademica  implements java.io.Serializable {


     private BigDecimal pkFormacionAcademica;
     private CatalogoGradoAcademica catalogoGradoAcademica;
     private Cv cv;
     private String nombreInstitucion;
     private Date anoInicio;
     private Date anoFin;
     private String nombreTitulo;
     private BigDecimal enCurso;

    public FormacionAcademica() {
    }

	
    public FormacionAcademica(BigDecimal pkFormacionAcademica, CatalogoGradoAcademica catalogoGradoAcademica, Cv cv, String nombreInstitucion, Date anoInicio, String nombreTitulo) {
        this.pkFormacionAcademica = pkFormacionAcademica;
        this.catalogoGradoAcademica = catalogoGradoAcademica;
        this.cv = cv;
        this.nombreInstitucion = nombreInstitucion;
        this.anoInicio = anoInicio;
        this.nombreTitulo = nombreTitulo;
    }
    public FormacionAcademica(BigDecimal pkFormacionAcademica, CatalogoGradoAcademica catalogoGradoAcademica, Cv cv, String nombreInstitucion, Date anoInicio, Date anoFin, String nombreTitulo, BigDecimal enCurso) {
       this.pkFormacionAcademica = pkFormacionAcademica;
       this.catalogoGradoAcademica = catalogoGradoAcademica;
       this.cv = cv;
       this.nombreInstitucion = nombreInstitucion;
       this.anoInicio = anoInicio;
       this.anoFin = anoFin;
       this.nombreTitulo = nombreTitulo;
       this.enCurso = enCurso;
    }
   
     @Id 

    
    @Column(name="PK_FORMACION_ACADEMICA", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getPkFormacionAcademica() {
        return this.pkFormacionAcademica;
    }
    
    public void setPkFormacionAcademica(BigDecimal pkFormacionAcademica) {
        this.pkFormacionAcademica = pkFormacionAcademica;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ATTRIBUTE_118", nullable=false)
    public CatalogoGradoAcademica getCatalogoGradoAcademica() {
        return this.catalogoGradoAcademica;
    }
    
    public void setCatalogoGradoAcademica(CatalogoGradoAcademica catalogoGradoAcademica) {
        this.catalogoGradoAcademica = catalogoGradoAcademica;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PK_CV", nullable=false)
    public Cv getCv() {
        return this.cv;
    }
    
    public void setCv(Cv cv) {
        this.cv = cv;
    }

    
    @Column(name="NOMBRE_INSTITUCION", nullable=false, length=100)
    public String getNombreInstitucion() {
        return this.nombreInstitucion;
    }
    
    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ANO_INICIO", nullable=false, length=7)
    public Date getAnoInicio() {
        return this.anoInicio;
    }
    
    public void setAnoInicio(Date anoInicio) {
        this.anoInicio = anoInicio;
    }

    @Temporal(TemporalType.DATE)
    @Column(name="ANO_FIN", length=7)
    public Date getAnoFin() {
        return this.anoFin;
    }
    
    public void setAnoFin(Date anoFin) {
        this.anoFin = anoFin;
    }

    
    @Column(name="NOMBRE_TITULO", nullable=false, length=100)
    public String getNombreTitulo() {
        return this.nombreTitulo;
    }
    
    public void setNombreTitulo(String nombreTitulo) {
        this.nombreTitulo = nombreTitulo;
    }

    
    @Column(name="EN_CURSO", precision=22, scale=0)
    public BigDecimal getEnCurso() {
        return this.enCurso;
    }
    
    public void setEnCurso(BigDecimal enCurso) {
        this.enCurso = enCurso;
    }




}


