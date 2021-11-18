package com.canteen.demo.service;

import com.canteen.demo.pojo.MenuWeek;

import java.util.List;

public interface MenuService {
    List<MenuWeek> searchTodayMenu(Integer day);
}
