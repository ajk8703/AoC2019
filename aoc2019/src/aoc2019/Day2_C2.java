package aoc2019;
import java.io.FileNotFoundException;

public class Day2_C2 {
	public static void main(String args[]) throws FileNotFoundException {
		
		for(int i = 0; i < 100; i++) {
			for(int j = 0; j < 100; j++) {
				int[] inputs = Day2_C1.inputToArray("C:\\Users\\owner\\Desktop\\banana.txt");

				inputs[1] = i;
				inputs[2] = j;
				
				try {
					if(Day2_C1.opcodes(inputs) == 19690720) {
						System.out.println("************noun is: " + i + "\nverb is: " + j);
						System.out.println("THE RESULT IS " + (i * 100 + j));
						return;
					}
					} catch (ArrayIndexOutOfBoundsException aiobe) {
						System.out.println("i was: " + i + " and j was: " + j + "we tried");
						continue;
				}
			}
		}
	}
}
