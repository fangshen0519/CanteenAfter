package com.canteen.demo.controller;

import com.alibaba.fastjson.JSON;
import com.canteen.demo.pojo.MenuWeek;
import com.canteen.demo.service.CanteenService;
import com.canteen.demo.utils.LogUtils;
import com.canteen.demo.utils.MyUtils;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 食堂订餐 Controller
 *
 * @author FangShen
 * @version 2021/11/23
 */
@RestController
@Api(tags = "食堂订餐")
@RequestMapping("/canteen")
public class CanteenController {
    @Autowired
    private CanteenService canteenService;


    @PostMapping("/searchAllMenu")
    @ResponseBody
    public Map<String, Object> searchAllMenu() {
        Map<String, Object> resultMap = new HashMap<>();
        List<MenuWeek> menuAllList;
        List<MenuWeek> menuTodayList = new ArrayList<>();

        try {
            menuAllList = canteenService.searchAllMenu();

            //获取系统时间
            String weekSignOfDate = MyUtils.getWeekSignOfDate();
            System.out.println(weekSignOfDate);

            //区分今天是周几
            switch (weekSignOfDate) {
                case "week7":
                    for (MenuWeek menuWeek : menuAllList) {
                        if (menuWeek.getWeek1() == 2) {
                            menuTodayList.add(menuWeek);
                        }
                    }
                    break;
                case "week1":
                    for (MenuWeek menuWeek : menuAllList) {
                        if (menuWeek.getWeek2() == 2) {
                            menuTodayList.add(menuWeek);
                        }
                    }
                    break;
                case "week2":
                    for (MenuWeek menuWeek : menuAllList) {
                        if (menuWeek.getWeek3() == 2) {
                            menuTodayList.add(menuWeek);
                        }
                    }
                    break;
                case "week3":
                    for (MenuWeek menuWeek : menuAllList) {
                        if (menuWeek.getWeek4() == 2) {
                            menuTodayList.add(menuWeek);
                        }
                    }
                    break;
                case "week4":
                    for (MenuWeek menuWeek : menuAllList) {
                        if (menuWeek.getWeek5() == 2) {
                            menuTodayList.add(menuWeek);
                        }
                    }
                    break;
                case "week5":
                    for (MenuWeek menuWeek : menuAllList) {
                        if (menuWeek.getWeek6() == 2) {
                            menuTodayList.add(menuWeek);
                        }
                    }
                    break;
                case "week6":
                    for (MenuWeek menuWeek : menuAllList) {
                        if (menuWeek.getWeek7() == 2) {
                            menuTodayList.add(menuWeek);
                        }
                    }
                    break;
                default:
                    System.out.println("取日期出错啦 !!!");
            }


            resultMap.put("menuTodayList", menuTodayList);
            resultMap.put("status", "0");
            LogUtils.info("菜单查询成功：" + JSON.toJSONString(menuAllList));
            LogUtils.info("菜单筛选成功：" + JSON.toJSONString(menuTodayList));
        } catch (Exception e) {
            e.printStackTrace();
            resultMap.put("status", "99");
            resultMap.put("message", "查询异常，请重新登录再试");
            LogUtils.error("菜单查询异常：" + e.getMessage());
        }
        return resultMap;
    }


}