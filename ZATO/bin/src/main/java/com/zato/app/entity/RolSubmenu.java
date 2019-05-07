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
 * RolSubmenu generated by hbm2java
 */
@Entity
@Table(name="ROL_SUBMENU"
    ,schema="SYSTEM"
)
public class RolSubmenu  implements java.io.Serializable {


     private BigDecimal idRolSubmenu;
     private Rol rol;
     private Submenu submenu;

    public RolSubmenu() {
    }

	
    public RolSubmenu(BigDecimal idRolSubmenu) {
        this.idRolSubmenu = idRolSubmenu;
    }
    public RolSubmenu(BigDecimal idRolSubmenu, Rol rol, Submenu submenu) {
       this.idRolSubmenu = idRolSubmenu;
       this.rol = rol;
       this.submenu = submenu;
    }
   
     @Id 

    
    @Column(name="ID_ROL_SUBMENU", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getIdRolSubmenu() {
        return this.idRolSubmenu;
    }
    
    public void setIdRolSubmenu(BigDecimal idRolSubmenu) {
        this.idRolSubmenu = idRolSubmenu;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PK_ROL")
    public Rol getRol() {
        return this.rol;
    }
    
    public void setRol(Rol rol) {
        this.rol = rol;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PK_SUBMENU")
    public Submenu getSubmenu() {
        return this.submenu;
    }
    
    public void setSubmenu(Submenu submenu) {
        this.submenu = submenu;
    }




}

