package com.elsa.smart_buffet.statistics;

import com.elsa.smart_buffet.mapper.OrderMapper;
import com.elsa.smart_buffet.mapper.YearMapper;
import com.elsa.smart_buffet.pojo.Order;
import com.elsa.smart_buffet.pojo.Year;
import com.elsa.smart_buffet.utils.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class YearStatistics {

    @Autowired
    private TimeUtil timeUtil;

    @Autowired
    private YearMapper yearMapper;

    @Autowired
    private OrderMapper orderMapper;

    public void yearStatistics(String oId) {
        int yId = timeUtil.getYearTime();

        Year year1 = yearMapper.selectById(yId);

        Year year2 = new Year();

        if(year1 == null) {
            Order order = orderMapper.selectById(oId);
            double yIncome = order.getOTotalPrice();
            double yExpend = yIncome / 2;
            double yProfit = yIncome / 2;
            year2.setYId(yId);
            year2.setYIncome(yIncome);
            year2.setYExpend(yExpend);
            year2.setYProfit(yProfit);
            yearMapper.insert(year2);
        } else {
            Order order = orderMapper.selectById(oId);
            double yIncome = order.getOTotalPrice();
            double yExpend = yIncome / 2;
            double yProfit = yIncome / 2;
            year2.setYId(yId);
            year2.setYIncome(year1.getYIncome() + yIncome);
            year2.setYExpend(year1.getYExpend() + yExpend);
            year2.setYProfit(year1.getYProfit() + yProfit);
            yearMapper.updateById(year2);
        }

    }


}
