package com.canteen.demo.mapper;

import org.apache.ibatis.annotations.Select;

public interface CronMapper {
    @Select("select cron from cron where cron.cron_id = '1'")
    String getCron();
}
