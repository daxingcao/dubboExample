package com.caodaxing.provider;

import org.springframework.stereotype.Service;

import com.caodaxing.demo.DemoClass;

@Service("demoService")
public class DemoClassImpl implements DemoClass {

	@Override
	public void getprovider(String demoName) {
		System.out.println(demoName+"调用我了!");
	}

}
