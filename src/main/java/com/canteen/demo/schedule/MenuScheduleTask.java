package com.canteen.demo.schedule;

import com.canteen.demo.mapper.CronMapper;
import com.canteen.demo.service.MenuService;
import com.canteen.demo.service.impl.MenuServiceImpl;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
@Configuration      //主要用于标记配置类，兼备Component的效果。
@EnableScheduling   //开启定时任务
public class MenuScheduleTask implements SchedulingConfigurer {
    @Autowired
    private MenuService menuService;

    @Autowired      //注入mapper
    @SuppressWarnings("all")
    CronMapper cronMapper;

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        Integer day = 1;

        scheduledTaskRegistrar.addTriggerTask(
                //添加任务内容(Runnable)
//                () ->  {menuService.searchTodayMenu(day);
                () ->  {System.out.println("我是猪");
                        System.out.println("执行动态定时任务: " + LocalDateTime.now().toLocalTime());},
                //设置执行周期(Trigger)
                triggerContext -> {
                    //从数据库获取执行周期
                    String cron = cronMapper.getCron();

                    //返回执行周期(Date)
                    return new CronTrigger(cron).nextExecutionTime(triggerContext);
                }
        );
    }

}
