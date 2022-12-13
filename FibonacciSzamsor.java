/*
* File: FibonacciSzamsor.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-11
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
public class FibonacciSzamsor {
    public static void main(String[] args) throws IOException{

	int[] szamsor = new int[36];
	szamsor[1] = 1;
	
	System.out.println("A Fibonacci számsorozat első 36 eleme:");
	System.out.println("1. "+szamsor[0]+" ");
	System.out.println("2. "+szamsor[1]+" ");
	for (int i=2;i<=35;i++){
		szamsor[i] = szamsor[i-2] + szamsor[i-1];
		System.out.println((i+1)+". "+szamsor[i]+" ");
	}
    }
}
