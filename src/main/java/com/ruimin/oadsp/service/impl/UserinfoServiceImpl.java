package com.ruimin.oadsp.service.impl;

import com.ruimin.oadsp.dao.UserinfoMapper;
import com.ruimin.oadsp.model.Userinfo;
import com.ruimin.oadsp.service.UserinfoService;
import com.ruimin.oadsp.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by CodeGenerator on 2017/08/20.
 */
@Service
@Transactional
public class UserinfoServiceImpl extends AbstractService<Userinfo> implements UserinfoService {
    @Resource
    private UserinfoMapper userinfoMapper;

}
