package com.java.dz.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.dz.model.DeptEntity;
import com.java.dz.service.DeptService;
import org.springframework.transaction.annotation.Transactional;

/**
 * 
 * @author djin
 *    Dept业务层实现类
 * @date 2020-04-11 16:26:28
 */
@Service(version = "1.0.0")
@Transactional
public class DeptServiceImpl extends BaseServiceImpl<DeptEntity> implements DeptService {
	
}
