/*
* File: Hatoslotto.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-11
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
public class Hatoslotto {
    public static void main(String[] args) throws IOException{

	int[] lottoSzamok = new int[6];
	int veletlenszam;
	
	System.out.print("A hatoslottó számai: ");
	for (int i=0;i<6;i++){
		veletlenszam = (int) (Math.random()*45)+1;
		lottoSzamok[i] = veletlenszam;
		for (int j=0;j<i;j++)
			if (veletlenszam == lottoSzamok[j]){
				j = i;
				i--;
			}
	}
	for (int i=0;i<6;i++){
		System.out.print(lottoSzamok[i] + " ");
	}
    }
}
