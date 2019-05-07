package com.zato.app.entity;
// Generated 7/05/2019 08:58:15 AM by Hibernate Tools 4.3.1


import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * CatalogoCategoriaHabilidad generated by hbm2java
 */
@Entity
@Table(name="CATALOGO_CATEGORIA_HABILIDAD"
    ,schema="SYSTEM"
)
public class CatalogoCategoriaHabilidad  implements java.io.Serializable {


     private BigDecimal pkCategoriaHabilidad;
     private String nombreCategoriaHabilidad;
     private Set<CatalogoHabilidad> catalogoHabilidads = new HashSet<CatalogoHabilidad>(0);

    public CatalogoCategoriaHabilidad() {
    }

	
    public CatalogoCategoriaHabilidad(BigDecimal pkCategoriaHabilidad, String nombreCategoriaHabilidad) {
        this.pkCategoriaHabilidad = pkCategoriaHabilidad;
        this.nombreCategoriaHabilidad = nombreCategoriaHabilidad;
    }
    public CatalogoCategoriaHabilidad(BigDecimal pkCategoriaHabilidad, String nombreCategoriaHabilidad, Set<CatalogoHabilidad> catalogoHabilidads) {
       this.pkCategoriaHabilidad = pkCategoriaHabilidad;
       this.nombreCategoriaHabilidad = nombreCategoriaHabilidad;
       this.catalogoHabilidads = catalogoHabilidads;
    }
   
     @Id 

    
    @Column(name="PK_CATEGORIA_HABILIDAD", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getPkCategoriaHabilidad() {
        return this.pkCategoriaHabilidad;
    }
    
    public void setPkCategoriaHabilidad(BigDecimal pkCategoriaHabilidad) {
        this.pkCategoriaHabilidad = pkCategoriaHabilidad;
    }

    
    @Column(name="NOMBRE_CATEGORIA_HABILIDAD", nullable=false, length=50)
    public String getNombreCategoriaHabilidad() {
        return this.nombreCategoriaHabilidad;
    }
    
    public void setNombreCategoriaHabilidad(String nombreCategoriaHabilidad) {
        this.nombreCategoriaHabilidad = nombreCategoriaHabilidad;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="catalogoCategoriaHabilidad")
    public Set<CatalogoHabilidad> getCatalogoHabilidads() {
        return this.catalogoHabilidads;
    }
    
    public void setCatalogoHabilidads(Set<CatalogoHabilidad> catalogoHabilidads) {
        this.catalogoHabilidads = catalogoHabilidads;
    }




}


