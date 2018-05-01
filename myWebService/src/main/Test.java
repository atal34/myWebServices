package main;

import java.util.HashMap;
import java.util.Map;

import entity.Data1;

public class Test {

	private static Data1 data1 = new Data1();
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashMap hashmap = new HashMap();
		//hashmap = initializeHashMap();
		initializeHashMap();
		
		System.out.println(data1.getEmpIDNameMap());
		

	}
	public static void  initializeHashMap(){
		
		
		HashMap hMap = new HashMap();
		
		hMap.put("689218", "Atal Phatak");
		hMap.put("1", "Emp1");
		data1.setEmpIDNameMap(hMap);
		//return hMap;
		
	}

}
