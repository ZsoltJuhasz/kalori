/*
* File: App.java
* Author: Juhász Zsolt
* Copyright: 2021, Juhász Zsolt
* Group: Szoft 2 N
* Date: 2021-11-29
* Github: https://github.com/ZsoltJuhasz/
* Licenc: GNU GPL
A program kiszámítja egy ember napi kalória szükségletét
*/
public class App {
    public static void main(String[] args) throws Exception {
        CaloryCalcer caloryC =  new CaloryCalcer();
        double result1 = caloryC.calcCaloryForWoman(68, 170, 28);
        double result2 = caloryC.calcCaloryForMan(90, 182, 50 );

        System.out.println("Az adott nő kalória szükséglete: " + result1);
        System.out.println("Az adott férfi kalória szükséglete: " + result2);

            
    }
}
