package com.rithik.learnspringframework.service;

import org.springframework.stereotype.Component;

@Component
public class MySQLDataService implements DataService {

	@Override
	public int[] retrieveData() {
		// TODO Auto-generated method stub
		return new int[] {1,2,3,4,5};
	}

}
