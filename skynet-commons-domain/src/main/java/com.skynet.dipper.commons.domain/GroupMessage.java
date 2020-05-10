package com.skynet.dipper.commons.domain;

import javax.persistence.*;
import java.util.Date;

@Table(name = "Dubhe..group_message")
public class GroupMessage {
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
     * 群消息内容
     */
    private String content;

    /**
     * 是否删除，1是 0否
     */
    @Column(name = "is_del")
    private Integer isDel;

    /**
     * 是否已读，1是，0否。
     */
    @Column(name = "is_read")
    private Integer isRead;

    @Column(name = "send_time")
    private Date sendTime;

    /**
     * 是否撤回，1是 0否
     */
    @Column(name = "is_back")
    private Integer isBack;

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
     * 获取群消息内容
     *
     * @return content - 群消息内容
     */
    public String getContent() {
        return content;
    }

    /**
     * 设置群消息内容
     *
     * @param content 群消息内容
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * 获取是否删除，1是 0否
     *
     * @return is_del - 是否删除，1是 0否
     */
    public Integer getIsDel() {
        return isDel;
    }

    /**
     * 设置是否删除，1是 0否
     *
     * @param isDel 是否删除，1是 0否
     */
    public void setIsDel(Integer isDel) {
        this.isDel = isDel;
    }

    /**
     * 获取是否已读，1是，0否。
     *
     * @return is_read - 是否已读，1是，0否。
     */
    public Integer getIsRead() {
        return isRead;
    }

    /**
     * 设置是否已读，1是，0否。
     *
     * @param isRead 是否已读，1是，0否。
     */
    public void setIsRead(Integer isRead) {
        this.isRead = isRead;
    }

    /**
     * @return send_time
     */
    public Date getSendTime() {
        return sendTime;
    }

    /**
     * @param sendTime
     */
    public void setSendTime(Date sendTime) {
        this.sendTime = sendTime;
    }

    /**
     * 获取是否撤回，1是 0否
     *
     * @return is_back - 是否撤回，1是 0否
     */
    public Integer getIsBack() {
        return isBack;
    }

    /**
     * 设置是否撤回，1是 0否
     *
     * @param isBack 是否撤回，1是 0否
     */
    public void setIsBack(Integer isBack) {
        this.isBack = isBack;
    }
}