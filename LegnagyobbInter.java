/*
* File: LegnagyobbInter.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-12
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
public class LegnagyobbInter {
    public static void main(String[] args) throws IOException{

	int utolso, szamjegy, osszeg, megoldas = 0;
	
	for (int i=100;i<=100000;i++){
		utolso = i - (Math.round(i / 10)*10);
		osszeg = 0;
		szamjegy = (i - utolso) / 10;
		if ((utolso) == 9){
			//System.out.print(i+"  "+(utolso)+"  "+(szamjegy)+"  \n");
			while (szamjegy != 0){
				osszeg += szamjegy%10;
         			szamjegy /= 10;
			}
			if (osszeg == 8){
				//System.out.println("összeg = "+osszeg);
				megoldas = i;
			}
		}
	}
	System.out.println("A megoldás: "+megoldas);
    }
}
