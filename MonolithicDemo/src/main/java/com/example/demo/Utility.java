package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Utility {
	
	private Employee[] empAr= {
		new Employee(1,"abc",null),	
		new Employee(2,"def",null),
		new Employee(3,"mno",null),
		new Employee(4,"cts",null),
		new Employee(5,"xyz",null),
	};
	
	private Technology[] techAr= {
		new Technology(1001,"Java"),	
		new Technology(1002,"Python"),	
		new Technology(1003,"C++"),	
		new Technology(1004,"Mysql"),	
		new Technology(1005,"Angular"),	
	};
	
	public Employee getEmployee(int id) {
		for(Employee e:empAr) {
			if(e.getId()==id) {
				return e;
			}
		}
		return null;
	}
	public Technology getTechnology(int techId) {
		for(Technology t: techAr) {
			if(t.getTechId()==techId) {
				return t;
			}
		}
		return null;
	}

}
