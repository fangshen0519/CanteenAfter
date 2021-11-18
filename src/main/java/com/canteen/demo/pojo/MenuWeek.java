package com.canteen.demo.pojo;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "menu_week")
public class MenuWeek {
    @Id
    private Integer id;

    /**
     * 菜品编号
     */
    private String dsno;

    /**
     * 菜品名称
     */
    private String dsname;

    /**
     * 菜品类型(1点心/2大荤/3小荤/4蔬菜/5汤/6浇头/7其他)
     */
    private Byte dstype;

    /**
     * 菜品介绍
     */
    private String dsintroduce;

    /**
     * 菜品价格
     */
    private BigDecimal dsprice;

    /**
     * 最大可订数量
     */
    private Integer dsremainnum;

    /**
     * 周日 0无/1有/2可订
     */
    private Byte week1;

    /**
     * 周一 0无/1有
     */
    private Byte week2;

    /**
     * 周二 0无/1有
     */
    private Byte week3;

    /**
     * 周三 0无/1有
     */
    private Byte week4;

    /**
     * 周四 0无/1有
     */
    private Byte week5;

    /**
     * 周五 0无/1有
     */
    private Byte week6;

    /**
     * 周六 0无/1有
     */
    private Byte week7;

    /**
     * 创建人
     */
    private String createdby;

    private Date createdtime;

    /**
     * 更新人
     */
    private String updatedby;

    private Date updatedtime;

    /**
     * 乐观锁更新次数
     */
    private Short updatedvers;

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
     * 获取菜品编号
     *
     * @return dsno - 菜品编号
     */
    public String getDsno() {
        return dsno;
    }

    /**
     * 设置菜品编号
     *
     * @param dsno 菜品编号
     */
    public void setDsno(String dsno) {
        this.dsno = dsno;
    }

    /**
     * 获取菜品名称
     *
     * @return dsname - 菜品名称
     */
    public String getDsname() {
        return dsname;
    }

    /**
     * 设置菜品名称
     *
     * @param dsname 菜品名称
     */
    public void setDsname(String dsname) {
        this.dsname = dsname;
    }

    /**
     * 获取菜品类型(1点心/2大荤/3小荤/4蔬菜/5汤/6浇头/7其他)
     *
     * @return dstype - 菜品类型(1点心/2大荤/3小荤/4蔬菜/5汤/6浇头/7其他)
     */
    public Byte getDstype() {
        return dstype;
    }

    /**
     * 设置菜品类型(1点心/2大荤/3小荤/4蔬菜/5汤/6浇头/7其他)
     *
     * @param dstype 菜品类型(1点心/2大荤/3小荤/4蔬菜/5汤/6浇头/7其他)
     */
    public void setDstype(Byte dstype) {
        this.dstype = dstype;
    }

    /**
     * 获取菜品介绍
     *
     * @return dsintroduce - 菜品介绍
     */
    public String getDsintroduce() {
        return dsintroduce;
    }

    /**
     * 设置菜品介绍
     *
     * @param dsintroduce 菜品介绍
     */
    public void setDsintroduce(String dsintroduce) {
        this.dsintroduce = dsintroduce;
    }

    /**
     * 获取菜品价格
     *
     * @return dsprice - 菜品价格
     */
    public BigDecimal getDsprice() {
        return dsprice;
    }

    /**
     * 设置菜品价格
     *
     * @param dsprice 菜品价格
     */
    public void setDsprice(BigDecimal dsprice) {
        this.dsprice = dsprice;
    }

    /**
     * 获取最大可订数量
     *
     * @return dsremainnum - 最大可订数量
     */
    public Integer getDsremainnum() {
        return dsremainnum;
    }

    /**
     * 设置最大可订数量
     *
     * @param dsremainnum 最大可订数量
     */
    public void setDsremainnum(Integer dsremainnum) {
        this.dsremainnum = dsremainnum;
    }

    /**
     * 获取周日 0无/1有/2可订
     *
     * @return week1 - 周日 0无/1有/2可订
     */
    public Byte getWeek1() {
        return week1;
    }

    /**
     * 设置周日 0无/1有/2可订
     *
     * @param week1 周日 0无/1有/2可订
     */
    public void setWeek1(Byte week1) {
        this.week1 = week1;
    }

    /**
     * 获取周一 0无/1有
     *
     * @return week2 - 周一 0无/1有
     */
    public Byte getWeek2() {
        return week2;
    }

    /**
     * 设置周一 0无/1有
     *
     * @param week2 周一 0无/1有
     */
    public void setWeek2(Byte week2) {
        this.week2 = week2;
    }

    /**
     * 获取周二 0无/1有
     *
     * @return week3 - 周二 0无/1有
     */
    public Byte getWeek3() {
        return week3;
    }

    /**
     * 设置周二 0无/1有
     *
     * @param week3 周二 0无/1有
     */
    public void setWeek3(Byte week3) {
        this.week3 = week3;
    }

    /**
     * 获取周三 0无/1有
     *
     * @return week4 - 周三 0无/1有
     */
    public Byte getWeek4() {
        return week4;
    }

    /**
     * 设置周三 0无/1有
     *
     * @param week4 周三 0无/1有
     */
    public void setWeek4(Byte week4) {
        this.week4 = week4;
    }

    /**
     * 获取周四 0无/1有
     *
     * @return week5 - 周四 0无/1有
     */
    public Byte getWeek5() {
        return week5;
    }

    /**
     * 设置周四 0无/1有
     *
     * @param week5 周四 0无/1有
     */
    public void setWeek5(Byte week5) {
        this.week5 = week5;
    }

    /**
     * 获取周五 0无/1有
     *
     * @return week6 - 周五 0无/1有
     */
    public Byte getWeek6() {
        return week6;
    }

    /**
     * 设置周五 0无/1有
     *
     * @param week6 周五 0无/1有
     */
    public void setWeek6(Byte week6) {
        this.week6 = week6;
    }

    /**
     * 获取周六 0无/1有
     *
     * @return week7 - 周六 0无/1有
     */
    public Byte getWeek7() {
        return week7;
    }

    /**
     * 设置周六 0无/1有
     *
     * @param week7 周六 0无/1有
     */
    public void setWeek7(Byte week7) {
        this.week7 = week7;
    }

    /**
     * 获取创建人
     *
     * @return createdby - 创建人
     */
    public String getCreatedby() {
        return createdby;
    }

    /**
     * 设置创建人
     *
     * @param createdby 创建人
     */
    public void setCreatedby(String createdby) {
        this.createdby = createdby;
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
     * 获取更新人
     *
     * @return updatedby - 更新人
     */
    public String getUpdatedby() {
        return updatedby;
    }

    /**
     * 设置更新人
     *
     * @param updatedby 更新人
     */
    public void setUpdatedby(String updatedby) {
        this.updatedby = updatedby;
    }

    /**
     * @return updatedtime
     */
    public Date getUpdatedtime() {
        return updatedtime;
    }

    /**
     * @param updatedtime
     */
    public void setUpdatedtime(Date updatedtime) {
        this.updatedtime = updatedtime;
    }

    /**
     * 获取乐观锁更新次数
     *
     * @return updatedvers - 乐观锁更新次数
     */
    public Short getUpdatedvers() {
        return updatedvers;
    }

    /**
     * 设置乐观锁更新次数
     *
     * @param updatedvers 乐观锁更新次数
     */
    public void setUpdatedvers(Short updatedvers) {
        this.updatedvers = updatedvers;
    }
}