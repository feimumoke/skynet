package com.skynet.dipper.commons.domain;

import javax.persistence.*;

@Table(name = "Dubhe..friends")
public class Friends {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer rootname;

    @Column(name = "f_rootname")
    private Integer fRootname;

    /**
     * @return id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return rootname
     */
    public Integer getRootname() {
        return rootname;
    }

    /**
     * @param rootname
     */
    public void setRootname(Integer rootname) {
        this.rootname = rootname;
    }

    /**
     * @return f_rootname
     */
    public Integer getfRootname() {
        return fRootname;
    }

    /**
     * @param fRootname
     */
    public void setfRootname(Integer fRootname) {
        this.fRootname = fRootname;
    }
}