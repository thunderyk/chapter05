package com.javaex.ex03;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class PhoneApp {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\Users\\김영관\\Desktop\\웹프로그래밍\\20201210(JAVA)\\PhoneDB.txt");
		InputStreamReader isr = new InputStreamReader(in, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		
		while(true) {
			String str = br.readLine(); //한줄씩 읽어온다. 줄바꿈기호는 제외
			if(str == null) {
				break;
			}
			String person[] = str.split(",");
			System.out.println("이름:"+person[0]);
			System.out.println("핸드폰:"+person[1]);
			System.out.println("회사:"+person[2]);
			System.out.println();
			
		}
		
		br.close();
		
	}
}