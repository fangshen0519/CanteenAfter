package com.canteen.demo.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "security_users")
public class SecurityUsers {
    @Id
    private String name;

    private String password;

    private String description;

    /**
     * 权限级0-9
     */
    private Byte priority;

    /**
     * 0用户/1组
     */
    @Column(name = "user_type")
    private Byte userType;

    /**
     * 控制查询范围
     */
    private String factoryno;

    private Date createdtime;

    /**
     * 部门
     */
    private String department;

    /**
     * 手机号
     */
    private String tel;

    /**
     * 微信号
     */
    private String userwx;

    /**
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
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
     * 获取权限级0-9
     *
     * @return priority - 权限级0-9
     */
    public Byte getPriority() {
        return priority;
    }

    /**
     * 设置权限级0-9
     *
     * @param priority 权限级0-9
     */
    public void setPriority(Byte priority) {
        this.priority = priority;
    }

    /**
     * 获取0用户/1组
     *
     * @return user_type - 0用户/1组
     */
    public Byte getUserType() {
        return userType;
    }

    /**
     * 设置0用户/1组
     *
     * @param userType 0用户/1组
     */
    public void setUserType(Byte userType) {
        this.userType = userType;
    }

    /**
     * 获取控制查询范围
     *
     * @return factoryno - 控制查询范围
     */
    public String getFactoryno() {
        return factoryno;
    }

    /**
     * 设置控制查询范围
     *
     * @param factoryno 控制查询范围
     */
    public void setFactoryno(String factoryno) {
        this.factoryno = factoryno;
    }

    /**
     * @return createdtime
     */
    public Date getCreatedtime() {
        return createdtime;
    }

    /**
     * @param createdtime
     */
    public void setCreatedtime(Date createdtime) {
        this.createdtime = createdtime;
    }

    /**
     * 获取部门
     *
     * @return department - 部门
     */
    public String getDepartment() {
        return department;
    }

    /**
     * 设置部门
     *
     * @param department 部门
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /**
     * 获取手机号
     *
     * @return tel - 手机号
     */
    public String getTel() {
        return tel;
    }

    /**
     * 设置手机号
     *
     * @param tel 手机号
     */
    public void setTel(String tel) {
        this.tel = tel;
    }

    /**
     * 获取微信号
     *
     * @return userwx - 微信号
     */
    public String getUserwx() {
        return userwx;
    }

    /**
     * 设置微信号
     *
     * @param userwx 微信号
     */
    public void setUserwx(String userwx) {
        this.userwx = userwx;
    }
}