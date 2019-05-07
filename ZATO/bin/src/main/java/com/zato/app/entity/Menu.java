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
 * Menu generated by hbm2java
 */
@Entity
@Table(name="MENU"
    ,schema="SYSTEM"
)
public class Menu  implements java.io.Serializable {


     private BigDecimal pkMenu;
     private String menu;
     private Set<Submenu> submenus = new HashSet<Submenu>(0);

    public Menu() {
    }

	
    public Menu(BigDecimal pkMenu, String menu) {
        this.pkMenu = pkMenu;
        this.menu = menu;
    }
    public Menu(BigDecimal pkMenu, String menu, Set<Submenu> submenus) {
       this.pkMenu = pkMenu;
       this.menu = menu;
       this.submenus = submenus;
    }
   
     @Id 

    
    @Column(name="PK_MENU", unique=true, nullable=false, precision=22, scale=0)
    public BigDecimal getPkMenu() {
        return this.pkMenu;
    }
    
    public void setPkMenu(BigDecimal pkMenu) {
        this.pkMenu = pkMenu;
    }

    
    @Column(name="MENU", nullable=false, length=50)
    public String getMenu() {
        return this.menu;
    }
    
    public void setMenu(String menu) {
        this.menu = menu;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="menu")
    public Set<Submenu> getSubmenus() {
        return this.submenus;
    }
    
    public void setSubmenus(Set<Submenu> submenus) {
        this.submenus = submenus;
    }




}

