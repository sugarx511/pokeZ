package cn.tangz.service.impl;

import cn.tangz.service.HatchService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: tz
 * @create: 2020-08-19
 **/
@Service
@Transactional(rollbackFor = Exception.class)
public class HatchServiceImpl implements HatchService {


}
