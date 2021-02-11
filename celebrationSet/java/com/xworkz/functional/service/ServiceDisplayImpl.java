package com.xworkz.functional.service;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.functional.Display;

public class ServiceDisplayImpl implements DisplayService {
	private List<String> names;
	public ServiceDisplayImpl() {
		this.names=new ArrayList<String>();
		this.names.add("elon musk");
		this.names.add("narendra");
		this.names.add("james gosling");
		this.names.add("amith shaha");
		}

	@Override
	public void printString(Display display) {
		for (String string : names) {
			
		}
		
	}

}
