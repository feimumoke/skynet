package com.skynet.dipper.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "Dubhe..t_group")
public class TGroup {
    /**
     * 自增主键
            
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 群号
     */
    @Column(name = "group_num")
    private String groupNum;

    /**
     * 群名称
     */
    @Column(name = "group_name")
    private String groupName;

    private String avatar;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "build_time")
    private Date buildTime;

    private String description;

    private Integer status;

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
     * 获取群号
     *
     * @return group_num - 群号
     */
    public String getGroupNum() {
        return groupNum;
    }

    /**
     * 设置群号
     *
     * @param groupNum 群号
     */
    public void setGroupNum(String groupNum) {
        this.groupNum = groupNum;
    }

    /**
     * 获取群名称
     *
     * @return group_name - 群名称
     */
    public String getGroupName() {
        return groupName;
    }

    /**
     * 设置群名称
     *
     * @param groupName 群名称
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    /**
     * @return avatar
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * @param avatar
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
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
     * @return build_time
     */
    public Date getBuildTime() {
        return buildTime;
    }

    /**
     * @param buildTime
     */
    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    /**
     * @return description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }
}