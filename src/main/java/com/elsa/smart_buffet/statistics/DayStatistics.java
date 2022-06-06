package com.elsa.smart_buffet.statistics;

import com.elsa.smart_buffet.mapper.DayMapper;
import com.elsa.smart_buffet.mapper.OrderMapper;
import com.elsa.smart_buffet.pojo.Day;
import com.elsa.smart_buffet.pojo.Order;
import com.elsa.smart_buffet.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DayStatistics {

    @Autowired
    private TimeUtil timeUtil;

    @Autowired
    private DayMapper dayMapper;

    @Autowired
    private OrderMapper orderMapper;

    public void dayStatistics(String oId) {

        int dId = timeUtil.getDayTime();

        Day day1 = dayMapper.selectById(dId);

        Day day2 = new Day();

        if(day1 == null) {
            Order order = orderMapper.selectById(oId);
            double dIncome = order.getOTotalPrice();
            double dExpend = dIncome / 2;
            double dProfit = dIncome / 2;
            day2.setDId(dId);
            day2.setDIncome(dIncome);
            day2.setDExpend(dExpend);
            day2.setDProfit(dProfit);
            dayMapper.insert(day2);
        } else {
            Order order = orderMapper.selectById(oId);
            double dIncome = order.getOTotalPrice();
            double dExpend = dIncome / 2;
            double dProfit = dIncome / 2;
            day2.setDId(dId);
            day2.setDIncome(day1.getDIncome() + dIncome);
            day2.setDExpend(day1.getDExpend() + dExpend);
            day2.setDProfit(day1.getDProfit() + dProfit);
            dayMapper.updateById(day2);
        }

    }

}
