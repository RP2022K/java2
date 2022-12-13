/*
* File: ElteltNapokSzama.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-07
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
public class ElteltNapokSzama {
    public static void main(String[] args) throws IOException{

        BufferedReader br=
        new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Első dátum(éééé-hh-nn): ");
        LocalDate datum1=LocalDate.parse(br.readLine());
	System.out.print("Második dátum(éééé-hh-nn): ");
        LocalDate datum2=LocalDate.parse(br.readLine());

	long elteltNapok = ChronoUnit.DAYS.between(datum1, datum2);

	System.out.print("A két dátum között eltelt napok száma: "+Math.abs(elteltNapok));

    }
}
