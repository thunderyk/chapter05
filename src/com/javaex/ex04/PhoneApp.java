package com.javaex.ex04;

import java.util.List;
import java.io.*;
import java.util.ArrayList;

public class PhoneApp {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStream in = new FileInputStream("C:\\Users\\김영관\\Desktop\\웹프로그래밍\\20201210(JAVA)\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		List<Person> lPerson = new ArrayList<Person>();
		
		while(true) {
			String str = br.readLine(); //한줄씩 읽어온다. 줄바꿈기호는 제외
			if(str == null) {
				break;
			}
			
			String person[] = str.split(",");
			lPerson.add(new Person(person[0],person[1],person[2]));
		}
		
		for(int i=0;i<lPerson.size();i++) {
			lPerson.get(i).show();
			System.out.println();
		}
		lPerson.add(new Person("김영관","010-1111-1231","02-1234-1111"));
		
		OutputStream out = new FileOutputStream("C:\\Users\\김영관\\Desktop\\웹프로그래밍\\20201210(JAVA)\\PhoneDB2.txt");
		OutputStreamWriter osw = new OutputStreamWriter(out,"UTF-8");
		BufferedWriter bw = new BufferedWriter(osw);
		
		for(int i=0;i<lPerson.size();i++) {
			bw.write(lPerson.get(i).getName()+","+lPerson.get(i).getHp()+","+lPerson.get(i).getCompany());
			bw.newLine();
		}
		System.out.println("새로운 디비가 등록되었습니다.");
		
		br.close();
		bw.close();
	}

}
