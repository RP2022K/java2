/*
* File: ParatlanvagyParos.java
* Author: Gyüre Árpád
* Copyright: 2022, Gyüre Árpád
* Group: Szoft I-1-E
* Date: 2022-12-11
* Github: https://github.com/rp2022k/java2
*/

import java.io.*;
public class ParatlanvagyParos {
    static boolean Paratlan(int szam){
	if ((szam % 2) == 0){
		return false;
	}
	else{
		return true;
	}
    }
    public static void main(String[] args) throws IOException{
	
        System.out.println(Paratlan(55));
    }
}
