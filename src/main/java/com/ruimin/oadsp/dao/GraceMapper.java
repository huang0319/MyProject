package com.ruimin.oadsp.dao;

import java.util.List;

import com.ruimin.oadsp.core.Mapper;
import com.ruimin.oadsp.model.Grace;

public interface GraceMapper extends Mapper<Grace> {

	List<com.ruimin.oadsp.model.Grace> selectAllG();

}
