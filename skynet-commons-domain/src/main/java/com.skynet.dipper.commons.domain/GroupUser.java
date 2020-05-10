package com.skynet.dipper.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "Dubhe..group_user")
public class GroupUser {
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
     * 群id
            
     */
    @Column(name = "group_id")
    private Integer groupId;

    /**
     * 入群时间
     */
    @Column(name = "join_time")
    private Date joinTime;

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
     * 获取群id
            
     *
     * @return group_id - 群id
            
     */
    public Integer getGroupId() {
        return groupId;
    }

    /**
     * 设置群id
            
     *
     * @param groupId 群id
            
     */
    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    /**
     * 获取入群时间
     *
     * @return join_time - 入群时间
     */
    public Date getJoinTime() {
        return joinTime;
    }

    /**
     * 设置入群时间
     *
     * @param joinTime 入群时间
     */
    public void setJoinTime(Date joinTime) {
        this.joinTime = joinTime;
    }
}