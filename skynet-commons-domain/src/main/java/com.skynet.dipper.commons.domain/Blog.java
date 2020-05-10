package com.skynet.dipper.commons.domain;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

@Table(name = "Dubhe..blog")
public class Blog {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    private String header;

    private String content;

    @Column(name = "build_time")
    private String buildTime;

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return header
     */
    public String getHeader() {
        return header;
    }

    /**
     * @param header
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return build_time
     */
    public String getBuildTime() {
        return buildTime;
    }

    /**
     * @param buildTime
     */
    public void setBuildTime(String buildTime) {
        this.buildTime = buildTime;
    }
}