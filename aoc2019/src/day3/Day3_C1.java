package day3;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.HashMap;

import java.io.InputStreamReader;

public class Day3_C1 {
	public static BufferedReader r = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String args[]) throws IOException {
		HashMap<String, Integer> wire = allSteps();
	}
	
	public static int[] getDir(char c) {
		switch (c) {
			case 'L': return new int[] {-1, 0};
			case 'R': return new int[] {1, 0};
			case 'U': return new int[] {0, 1};
			case 'D': return new int[] {0, -1};
		}
		return null;
	}
	
	public static HashMap<String, Integer> allSteps() throws IOException{
		HashMap<String, Integer> wire = new HashMap<>();
		
		
		
		String[] input = r.readLine().split(",");
		
		int x = 0, y = 0, d = 0;
		
		// looking at each INPUT
		for(int i = 0; i < input.length; i++) {
			String workingLine = input[i];
			int[] way = getDir(workingLine.charAt(0));
			int steps = Integer.parseInt(workingLine.substring(1));
			
			// loading in individual steps
			for(int o = 0; o < steps; o++) {
				x += way[0];
				y += way[1];
				
				wire.put((x + "_" + y), ++d);
			}
		}
		return wire;
	}
	

	public static int compare(HashMap<String, Integer> wire) throws IOException {
		String[] newWire = r.readLine().split(",");
		for(int i = 0; i < newWire.length; i++) {
			
		}
		
		
		return 3; 
	}

}
