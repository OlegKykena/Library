package com.softserve.dao.impl;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.dao.ExempliarDAO;
import com.softserve.entity.Exempliar;

@Repository
@Transactional
public class ExempliarDAOImpl extends GenericDAOImpl<Exempliar, Integer> 
		implements ExempliarDAO{

	protected ExempliarDAOImpl() {
		super(Exempliar.class);
	}

}
