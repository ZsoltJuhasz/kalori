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

public class CaloryCalcer {

    double bodyWeight;
    double height;
    int age;

    public void setParameters(double bodyWeight, double height, int age){
        this.bodyWeight = bodyWeight;
        this.height = height;
        this.age = age;
    }

    public double calcCaloryForWoman(double bodyWeight, double height, int age) {
        return (9.247 * bodyWeight + 3.098 * height - 4.330 * age + 447.593);
    }

    public double calcCaloryForMan(double bodyWeight, double height, int age) {
        return (13.397 * bodyWeight + 4.799 * height - 5.667 * age + 88.362);
    }
    

}
