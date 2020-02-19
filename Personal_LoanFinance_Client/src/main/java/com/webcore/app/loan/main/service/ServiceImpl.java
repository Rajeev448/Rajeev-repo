package com.webcore.app.loan.main.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.webcore.app.loan.main.model.EmiDetails;
import com.webcore.app.loan.main.repository.RepositoryIntf;
@Service
public class ServiceImpl implements ServiceIntf
{
	@Autowired
	RepositoryIntf ri;
	@Override
	public void savedata(EmiDetails ed) {
		// TODO Auto-generated method stub
		ri.save(ed);
		
	}
	
}
