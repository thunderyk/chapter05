package com.javaex.ex04;

public class Person {
	
	private String name;
	private String hp;
	private String company;
	
	public Person(String name, String hp, String company) {
		this.name = name;
		this.hp = hp;
		this.company = company;
	}
	
	public void show() {
		System.out.println("이름:"+name);
		System.out.println("핸드폰:"+hp);
		System.out.println("회사:"+company);
	}

	public String getName() {
		return name;
	}

	public String getHp() {
		return hp;
	}

	public String getCompany() {
		return company;
	}
	
}
