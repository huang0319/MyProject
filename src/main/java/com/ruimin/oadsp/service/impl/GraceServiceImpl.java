package com.ruimin.oadsp.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ruimin.oadsp.core.AbstractService;
import com.ruimin.oadsp.dao.GraceMapper;
import com.ruimin.oadsp.model.Grace;
import com.ruimin.oadsp.service.GraceService;

@Service
@Transactional

public class GraceServiceImpl extends AbstractService<Grace> implements GraceService {

	@Resource
	private GraceMapper graceMapper;

}
