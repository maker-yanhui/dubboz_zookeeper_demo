package com.java.dz.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import org.springframework.transaction.annotation.Transactional;
import com.java.dz.model.EmpEntity;
import com.java.dz.service.EmpService;

/**
 * 
 * @author djin
 *    Emp业务层实现类
 * @date 2020-04-11 16:26:28
 */
@Service(version = "1.0.0")
@Transactional
public class EmpServiceImpl extends BaseServiceImpl<EmpEntity> implements EmpService {
	
}
