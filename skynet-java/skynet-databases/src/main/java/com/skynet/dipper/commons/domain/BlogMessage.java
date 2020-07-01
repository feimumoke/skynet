package com.skynet.dipper.commons.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "Dubhe..blog_message")
public class BlogMessage {
    /**
     * 自增主键
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 博客id
     */
    @Column(name = "blog_id")
    private Integer blogId;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 消息类型
     */
    @Column(name = "msg_type")
    private Integer msgType;

    /**
     * 内容
     */
    private String content;

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
     * 获取博客id
     *
     * @return blog_id - 博客id
     */
    public Integer getBlogId() {
        return blogId;
    }

    /**
     * 设置博客id
     *
     * @param blogId 博客id
     */
    public void setBlogId(Integer blogId) {
        this.blogId = blogId;
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
     * 获取消息类型
     *
     * @return msg_type - 消息类型
     */
    public Integer getMsgType() {
        return msgType;
    }

    /**
     * 设置消息类型
     *
     * @param msgType 消息类型
     */
    public void setMsgType(Integer msgType) {
        this.msgType = msgType;
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