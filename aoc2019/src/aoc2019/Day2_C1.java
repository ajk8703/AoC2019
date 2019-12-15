package aoc2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day2_C1 {
	public static void main(String args[]) throws FileNotFoundException {

		// C:\\Users\\owner\\git\\AoC2019\\src\\aoc2019\\Day2_Input.txt
		File file = new File("C:\\Users\\owner\\Desktop\\banana.txt");
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(file);
		String[] beep = null;
		
		
		while (scan.hasNextLine()) {
			beep = scan.nextLine().split(",");
		}
		
		int[] inputs = new int[beep.length];
		for(int i = 0; i < inputs.length; i++) {
			inputs[i] = Integer.parseInt(beep[i]);
		}
		

		
		inputs[1] = 12;
		inputs[2] = 2;
		

		
		for (int i = 0; i < inputs.length; i+=1) {
			if (inputs[i] == 1) {
				opcode1(inputs, inputs[inputs[i + 1]], inputs[inputs[i + 2]], inputs[i + 3]);
				i += 3;
			}
			
			else if(inputs[i] == 2) {
				opcode2(inputs, inputs[inputs[i + 1]], inputs[inputs[i + 2]], inputs[i + 3]);
				i += 3;
			}
			
			else if(inputs[i] == 99) {
				System.out.println(inputs[0]);
				return;
			}
			
		}
	}
	
	
	public static void opcode1 (int[] in, int num1, int num2, int pos) {
		in[pos] = num1 + num2;
		
	}
	
	public static void opcode2 (int[] in, int num1, int num2, int pos) {
		in[pos] = num1 * num2;
	}
}
