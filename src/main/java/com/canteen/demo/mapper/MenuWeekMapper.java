package com.canteen.demo.mapper;

import com.canteen.demo.pojo.MenuWeek;
import com.canteen.demo.utils.MyMapper;

import java.util.List;

public interface MenuWeekMapper extends MyMapper<MenuWeek> {
    List<MenuWeek> selectTodayMenu(Integer day);
}