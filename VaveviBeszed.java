/*
* File: VaveviBeszed.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-12
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
public class VaveviBeszed {
    public static void main(String[] args) throws IOException{
	

	BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Kérem az átalakítandó mondatot: ");
	String mondat = br.readLine();
	String mondatVavevi=mondat.replaceAll("a","ava");
	mondatVavevi=mondatVavevi.replaceAll("e","eve");
	mondatVavevi=mondatVavevi.replaceAll("i","ivi");
	mondatVavevi=mondatVavevi.replaceAll("o","ovo");
	mondatVavevi=mondatVavevi.replaceAll("u","uvu");
	System.out.print("\n"+mondatVavevi);
    }
}
