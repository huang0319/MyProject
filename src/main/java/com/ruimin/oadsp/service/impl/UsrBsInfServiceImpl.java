package com.ruimin.oadsp.service.impl;

import com.ruimin.oadsp.dao.UsrBsInfMapper;
import com.ruimin.oadsp.model.UsrBsInf;
import com.ruimin.oadsp.service.UsrBsInfService;
import com.ruimin.oadsp.core.AbstractService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;


/**
 * Created by 王玉栋 on 2017-11-16 13:54:23.
 */
@Service
@Transactional
public class UsrBsInfServiceImpl extends AbstractService<UsrBsInf> implements UsrBsInfService {
    @Resource
    private UsrBsInfMapper usrBsInfMapper;

}
