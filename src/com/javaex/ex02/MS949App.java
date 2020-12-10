package com.javaex.ex02;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class MS949App {

	public static void main(String[] args) throws IOException {
		
		InputStream in = new FileInputStream("C:\\Users\\김영관\\Desktop\\웹프로그래밍\\20201210(JAVA)\\MS949.txt");
		InputStreamReader isr = new InputStreamReader(in, "MS949");
		BufferedReader br = new BufferedReader(isr);
		
		while(true) {
			String str = br.readLine(); //한줄씩 읽어온다. 줄바꿈기호는 제외
			if(str == null) {
				break;
			}
			System.out.println(str);
			
		}
		
		br.close();
		
	}
}