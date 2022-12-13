/*
* File: Szorzotabla.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-11
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
public class Szorzotabla {
    public static void main(String[] args) throws IOException{
	
	for (int i=1;i<=10;i++){
		for (int j=1;j<=10;j++){
		System.out.printf("%4d", i*j);
		}
		System.out.println();
	}
    }
}
