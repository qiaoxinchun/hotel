package com.qiaoxc.hotel.service.impl;

import com.qiaoxc.hotel.entity.History;
import com.qiaoxc.hotel.mapper.HistoryMapper;
import com.qiaoxc.hotel.service.HistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 入住历史记录表 服务实现类
 * </p>
 *
 * @author zzg
 * @since 2020-06-08
 */
@Service
public class HistoryServiceImpl extends ServiceImpl<HistoryMapper, History> implements HistoryService {

}
