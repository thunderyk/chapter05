package com.javaex.ex01;

import java.io.*;

public class BufferedStreamApp {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		InputStream in = new FileInputStream("C:\\Users\\김영관\\Desktop\\웹프로그래밍\\20201210(JAVA)\\img.jpg");
		BufferedInputStream bin = new BufferedInputStream(in);
		
		OutputStream out = new FileOutputStream("C:\\Users\\김영관\\Desktop\\웹프로그래밍\\20201210(JAVA)\\byteimg.jpg");
		BufferedOutputStream bout = new BufferedOutputStream(out);
		
		System.out.println("시작!");
		while(true) {
			int bData = bin.read();
			if(bData == -1) {
				break;
			}
			bout.write(bData);
		}
		System.out.println("끝!");
		bin.close();
		bout.close();

	}

}
