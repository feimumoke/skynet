package com.skynet.dipper.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "Dubhe..history")
public class History {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer rootname;

    @Column(name = "f_rootname")
    private Integer fRootname;

    private Date time;

    private String record;

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

    /**
     * @return time
     */
    public Date getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Date time) {
        this.time = time;
    }

    /**
     * @return record
     */
    public String getRecord() {
        return record;
    }

    /**
     * @param record
     */
    public void setRecord(String record) {
        this.record = record;
    }
}