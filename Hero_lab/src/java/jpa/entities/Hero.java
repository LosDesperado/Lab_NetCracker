/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jpa.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Max
 */
@Entity
@Table(name = "HERO")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Hero.findAll", query = "SELECT h FROM Hero h")
    , @NamedQuery(name = "Hero.findById", query = "SELECT h FROM Hero h WHERE h.id = :id")
    , @NamedQuery(name = "Hero.findByHname", query = "SELECT h FROM Hero h WHERE h.hname = :hname")
    , @NamedQuery(name = "Hero.findByUniverse", query = "SELECT h FROM Hero h WHERE h.universe = :universe")
    , @NamedQuery(name = "Hero.findByPower", query = "SELECT h FROM Hero h WHERE h.power = :power")
    , @NamedQuery(name = "Hero.findByDescription", query = "SELECT h FROM Hero h WHERE h.description = :description")
    , @NamedQuery(name = "Hero.findByAlive", query = "SELECT h FROM Hero h WHERE h.alive = :alive")
    , @NamedQuery(name = "Hero.findByPhone", query = "SELECT h FROM Hero h WHERE h.phone = :phone")})
public class Hero implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "ID")
    private Long id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "HNAME")
    private String hname;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "UNIVERSE")
    private String universe;
    @Basic(optional = false)
    @NotNull
    @Column(name = "POWER")
    private short power;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 1200)
    @Column(name = "DESCRIPTION")
    private String description;
    @Basic(optional = false)
    @NotNull
    @Column(name = "ALIVE")
    private Character alive;
    @Column(name = "PHONE")
    private Long phone;
    @Column(name = "LOGO")
    private String logo;

    public Hero() {
    }

    public Hero(Long id) {
        this.id = id;
    }

    public Hero(Long id, String hname, String universe, short power, String description, Character alive, String logo) {
        this.id = id;
        this.hname = hname;
        this.universe = universe;
        this.power = power;
        this.description = description;
        this.alive = alive;
        this.logo=logo;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getHname() {
        return hname;
    }

    public void setHname(String hname) {
        this.hname = hname;
    }
    
     public String getLogo() {
        // logo=("D:\\1УНИВЕР\\КУРСЫ_КРЭКЕР\\КУРАТОРУ\\Lab_NetCracker\\Hero_lab\\web\\resources\\images\\")+logo;
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = (String)logo;
    }

    public String getUniverse() {
        return universe;
    }

    public void setUniverse(String universe) {
        this.universe = universe;
    }

    public short getPower() {
        return power;
    }

    public void setPower(short power) {
        this.power = power;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Character getAlive() {
        return alive;
    }

    public void setAlive(Character alive) {
        this.alive = alive;
    }

    public Long getPhone() {
        return phone;
    }

    public void setPhone(Long phone) {
        this.phone = phone;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Hero)) {
            return false;
        }
        Hero other = (Hero) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "jpa.entities.Hero[ id=" + id + " ]";
    }
    
}
