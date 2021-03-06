package com.atguigu.spring.ref;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {
	private static Map<String, Car> cars = new HashMap<String, Car>();
	
	static {
		cars.put("Audi", new Car("Audi", 300000));
		cars.put("Ford", new Car("Ford", 500000));
	}

	// ��̬��������
	public static Car getCar(String name) {
		return cars.get(name);
	}
}
