/*
* File: HanyNaposaHonap.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-08
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
import java.time.*;
public class HanyNaposaHonap {
    public static void main(String[] args) throws IOException{
        int ev, honap;

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

	System.out.print("Év : ");
        ev=Integer.parseInt(br.readLine());
	System.out.print("Hónap : ");
        honap=Integer.parseInt(br.readLine());

	YearMonth evHonapObject = YearMonth.of(ev, honap);
	int napokSzama = evHonapObject.lengthOfMonth();

        System.out.println("Napok száma az adott hónapban: "+napokSzama);
    }
}
