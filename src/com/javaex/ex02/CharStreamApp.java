package com.javaex.ex02;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class CharStreamApp {

	public static void main(String[] args) throws IOException {
		
		Writer fw = new FileWriter("C:\\Users\\김영관\\Desktop\\웹프로그래밍\\20201210(JAVA)\\song.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		
		bw.write("학교종이 땡땡땡");
		bw.newLine();
		bw.write("어서모이자");
		bw.newLine();
		bw.write("선생님이 우리를");
		bw.newLine();
		bw.write("기다리신다");
		
		bw.close();
		
	}

}