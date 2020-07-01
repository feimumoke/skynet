package com.skynet.dipper.commons.domain;

import java.util.Date;
import javax.persistence.*;

@Table(name = "Dubhe..friend_type")
public class FriendType {
    /**
     * 自增主键
            
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 分组名
     */
    @Column(name = "type_name")
    private String typeName;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Integer userId;

    /**
     * 创建时间
     */
    @Column(name = "build_time")
    private Date buildTime;

    /**
     * 是否为默认分组：1为默认，0为不是默认分组
     */
    @Column(name = "is_default")
    private Integer isDefault;

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
     * 获取分组名
     *
     * @return type_name - 分组名
     */
    public String getTypeName() {
        return typeName;
    }

    /**
     * 设置分组名
     *
     * @param typeName 分组名
     */
    public void setTypeName(String typeName) {
        this.typeName = typeName;
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
     * 获取创建时间
     *
     * @return build_time - 创建时间
     */
    public Date getBuildTime() {
        return buildTime;
    }

    /**
     * 设置创建时间
     *
     * @param buildTime 创建时间
     */
    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    /**
     * 获取是否为默认分组：1为默认，0为不是默认分组
     *
     * @return is_default - 是否为默认分组：1为默认，0为不是默认分组
     */
    public Integer getIsDefault() {
        return isDefault;
    }

    /**
     * 设置是否为默认分组：1为默认，0为不是默认分组
     *
     * @param isDefault 是否为默认分组：1为默认，0为不是默认分组
     */
    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }
}