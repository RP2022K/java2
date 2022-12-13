/*
* File: Karakterlanc.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-08
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
public class Karakterlanc {
    public static void main(String[] args) throws IOException{

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Adj meg egy karakterláncot: ");
        String karakterlanc=br.readLine();
	char elsoKarakter = karakterlanc.charAt(0);
	if (((int) elsoKarakter > 48) && ((int) elsoKarakter < 58)){
		for (int i = 1;(i< (((int) elsoKarakter)-47)) && (i < karakterlanc.length());i++){
			System.out.print(karakterlanc.charAt(i));
		}
	}
	else System.out.print("Az első karakter 0 vagy nem szám");
    }
}
