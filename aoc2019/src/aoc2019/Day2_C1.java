package aoc2019;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Day2_C1 {
	public static void main(String args[]) throws FileNotFoundException {

		// C:\\Users\\owner\\git\\AoC2019\\src\\aoc2019\\Day2_Input.txt

		int[] inputs = inputToArray("C:\\Users\\owner\\Desktop\\banana.txt");
		
		// inputs[1] = 12;
		// inputs[2] = 2;
		
		System.out.println(opcodes(inputs));
	
		
			
		}
	
	public static int opcodes(int[] inputs) {
		for (int i = 0; i < inputs.length; i+=1) {
			if (inputs[i] == 1) {
				inputs[inputs[i + 3]] = inputs[inputs[i + 1]] + inputs[inputs[i + 2]];
				i += 3;
			}
			
			else if(inputs[i] == 2) {
				inputs[inputs[i +3]] = inputs[inputs[i + 1]] * inputs[inputs[i + 2]];
				i += 3;
			}
			
			else if(inputs[i] == 99) {
				return (inputs[0]);
			}
		}
		return 0;
	}
	
	public static int[] inputToArray(String fileName) throws FileNotFoundException {
		File file = new File(fileName);
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
		return inputs;
	}
	
	
}
