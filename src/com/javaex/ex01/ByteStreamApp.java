package com.javaex.ex01;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class ByteStreamApp {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		
		InputStream in = new FileInputStream("C:\\Users\\김영관\\Desktop\\웹프로그래밍\\20201210(JAVA)\\img.jpg");
		OutputStream out = new FileOutputStream("C:\\Users\\김영관\\Desktop\\웹프로그래밍\\20201210(JAVA)\\byteimg.jpg");
		System.out.println("시작");
		while(true) {
			int bData = in.read();
			if(bData == -1) {
				break;
			}
			out.write(bData);
		}
		System.out.println("끝남!");
		in.close();
		out.close();
	}

}
