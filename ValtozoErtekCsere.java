/*
* File: ValtozoErtekCsere.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
public class ValtozoErtekCsere {
    public static void main(String[] args) throws IOException{
        int elso, masodik;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Az első változó értéke: ");
        elso=Integer.parseInt(br.readLine());
	System.out.print("A második változó értéke: ");
        masodik=Integer.parseInt(br.readLine());
	elso = elso + masodik;
	masodik = elso - masodik;
	elso = elso - masodik;
	System.out.println("A csere utáni értékek: elso = "+elso+" , masodik = "+masodik);
    }
}
