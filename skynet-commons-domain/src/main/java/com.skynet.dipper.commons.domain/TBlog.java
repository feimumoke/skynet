package com.skynet.dipper.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "Dubhe..t_blog")
public class TBlog {
    /**
     * 自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 标题
     */
    private String header;

    /**
     * 内容
     */
    private String content;

    private String image;

    /**
     * 建立时间
     */
    @Column(name = "build_time")
    private Date buildTime;

    /**
     * 获取自增主键
     *
     * @return id - 自增主键
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置自增主键
     *
     * @param id 自增主键
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取标题
     *
     * @return header - 标题
     */
    public String getHeader() {
        return header;
    }

    /**
     * 设置标题
     *
     * @param header 标题
     */
    public void setHeader(String header) {
        this.header = header;
    }

    /**
     * 获取内容
     *
     * @return content - 内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置内容
     *
     * @param content 内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return image
     */
    public String getImage() {
        return image;
    }

    /**
     * @param image
     */
    public void setImage(String image) {
        this.image = image;
    }

    /**
     * 获取建立时间
     *
     * @return build_time - 建立时间
     */
    public Date getBuildTime() {
        return buildTime;
    }

    /**
     * 设置建立时间
     *
     * @param buildTime 建立时间
     */
    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }
}