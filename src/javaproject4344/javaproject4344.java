package javaproject4344;
import java.util.Scanner;

public class javaproject4344 {

	public static void main(String[] args) {
	
	Scanner in = new Scanner(System.in);
    int[] number = new int[10];
	
	for(int i = 0; i < 10; i++) {
		number[i] = in.nextInt();
	}
	
	int sum = 0;
	
	for(int j = 0; j < 10; j++) {
		number[j] += sum;
	}
	
	int average;
	average = sum / 10;
	
	}

}
