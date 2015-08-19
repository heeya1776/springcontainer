package com.bit2015.springcontainer.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class HelloService {
	@Autowired
	HelloDao helloDao;
	
	public void hello(){
		helloDao.hello();
	}
}
