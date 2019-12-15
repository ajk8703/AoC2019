package aoc2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Day1_C2 {
	public static void main (String args[]) throws FileNotFoundException {
		File file = new File("C:\\Users\\owner\\Desktop\\banana.txt");
		int total = 0;
		Scanner scan = new Scanner(file);
				
		while(scan.hasNextLine()) {
			total += calcFuel(Integer.parseInt(scan.nextLine()));
		}
		
		scan.close();
		
		System.out.println(total);
	}
	
	public static int calcFuel(int module) {
		if(module / 3 - 2 <= 0)
			return 0;
		else {
			return module / 3 - 2 + calcFuel(module / 3 - 2);
		}
	}
}
