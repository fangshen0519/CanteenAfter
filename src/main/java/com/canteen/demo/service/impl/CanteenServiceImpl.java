package com.canteen.demo.service.impl;

import com.canteen.demo.mapper.MenuWeekMapper;
import com.canteen.demo.pojo.MenuWeek;
import com.canteen.demo.service.CanteenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CanteenServiceImpl implements CanteenService {
    @Autowired
    private MenuWeekMapper menuWeekMapper;

    @Override
    public List<MenuWeek> searchAllMenu() {
        return menuWeekMapper.selectAllmenu();
    }
}
