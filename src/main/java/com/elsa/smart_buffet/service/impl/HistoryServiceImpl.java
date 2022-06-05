package com.elsa.smart_buffet.service.impl;

import com.elsa.smart_buffet.pojo.History;
import com.elsa.smart_buffet.pojo.ResultBox.ResponseResult;
import com.elsa.smart_buffet.service.HistoryService;
import com.elsa.smart_buffet.utils.RedisCache;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Iterator;
import java.util.List;

@Service
public class HistoryServiceImpl implements HistoryService {

    @Autowired
    private RedisCache redisCache;

    @Override
    public List<String> selectOneByIdHistory(String cId) {
        return redisCache.getCacheList(cId);
    }

    @Override
    public ResponseResult insertHistory(History history) {
        String cId = history.getCId().toString();
        List list = redisCache.getCacheList(cId);
        if(list != null) {
            redisCache.deleteObject(cId);
        }
        if(list.size() >= 6) {
            int i = 1;
            for(Iterator it = list.iterator(); it.hasNext();){
                i++;
                Object obj = it.next();
                if(i == 2) {
                    it.remove();//试图删除迭代出来的元素
                }
            }
        }

        list.add(history.getHHistory());
        redisCache.setCacheList(cId, list);
        redisCache.expire(cId, 60 * 60 * 24 * 30);
        return new ResponseResult(200, list);
    }
}
