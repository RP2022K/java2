/*
* File: HomersekletAtszamitas.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-11
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
public class HomersekletAtszamitas {
    public static void main(String[] args) throws IOException{
	
	System.out.println("\n   Celsius   Farenheit   Kelvin\n");
	for (int i=32;i>=-9;i--){
		System.out.printf("%8d%12.2f%11.2f%n", i, (double) (1.8*i + 32), (double) (i + 273.15));
	}
    }
}
