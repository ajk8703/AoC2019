package aoc2019;

import java.io.*;
import java.util.Scanner;

public class Day1_C1 {
	public static void main(String args[]) throws Exception {
		File file = new File("C:\\Users\\owner\\Desktop\\banana.txt");
		int total = 0;
		Scanner scan = new Scanner(file);
		while(scan.hasNextLine()) {
			total += (Integer.parseInt(scan.nextLine())) / 3 - 2;
		}
		
		scan.close();
		
		System.out.println(total);	

	}

}
