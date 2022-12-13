/*
* File: SzamValodiOsztoi.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-11
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
public class SzamValodiOsztoi {
    public static void main(String[] args) throws IOException{
	
	int szamlalo = 0;
	int valodiOsztoSzam = 0;
	int szam = 100;

	while (szamlalo < 20){
		for (int i=2;i<=((int) szam/2);i++){
			if ((szam % i) == 0){
				valodiOsztoSzam++;
			}
		}
		if (valodiOsztoSzam == 7){
			szamlalo++;
			if (szamlalo > 10){
				System.out.println(szam);
			}
		}
		valodiOsztoSzam = 0;
		szam++;
	} 
    }
}
