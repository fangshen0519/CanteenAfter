package com.canteen.demo.service.impl;

import com.canteen.demo.mapper.MenuWeekMapper;
import com.canteen.demo.pojo.MenuWeek;
import com.canteen.demo.service.MenuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MenuServiceImpl implements MenuService {
    @Autowired
    private MenuWeekMapper menuWeekMapper;

    @Override
    public List<MenuWeek> searchTodayMenu(Integer day) {
        List<MenuWeek> menuWeeks = menuWeekMapper.selectTodayMenu(day);
        return menuWeeks;
    }
}
