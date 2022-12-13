/*
* File: Otoslotto.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-08
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
public class Otoslotto {
    public static void main(String[] args) throws IOException{

	int[] lottoSzamok = new int[5];
	
	System.out.print("Az ötöslottó számai: ");
	for (int i=0;i<5;i++){
		lottoSzamok[i] = (int) (90*Math.random())+1;
		System.out.print(lottoSzamok[i] + " ");
	}
    }
}
