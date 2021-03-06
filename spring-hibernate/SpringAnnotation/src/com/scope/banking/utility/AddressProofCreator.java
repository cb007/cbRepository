package com.scope.banking.utility;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

import com.scope.banking.entities.AddressProof;

@Component
public class AddressProofCreator implements ApplicationContextAware{

	ApplicationContext applicationContext;
	
	@Override
	public void setApplicationContext(ApplicationContext ctx)
			throws BeansException {
		// TODO Auto-generated method stub
		this.applicationContext=ctx;
		
	}
	
	public void createProof(String type, int number)
	{
		AddressProof addressProof=(AddressProof) applicationContext.getBean("addressProof", type, number);
		System.out.println("address proof instantiated");
		System.out.println("address proof type:"+addressProof.getType());
		System.out.println("address proof number:"+addressProof.getNumber());
	}

	
}
