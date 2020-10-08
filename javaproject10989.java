package javaproject10989;
import java.util.Scanner;

public class javaproject10989 {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
	
	int[] number = new int[10];
	
	for(int i = 0; i < 10; i++) {
		number[i] = in.nextInt();
	}
	
	int[] line = new int[10];
	
	for(int j = 0; j < 10; j++) {
		line[j] = number[j];
		if(number[j] > number[j+1])
			number[j] = line[j+1];
		else if(number[j] == number[j+1])
			number[j] = line[j];
		else if(number[j] < number[j+1])
			number[j] = line[j];
	}
	
	for(int k = 0; k < 10; k++) {
		System.out.println(line[k]);
	}
	
	}

}
