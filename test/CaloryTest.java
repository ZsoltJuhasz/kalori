/*
* File: CaloryTest.java
* Author: Juhász Zsolt
* Copyright: 2021, Juhász Zsolt
* Group: Szoft 2 N
* Date: 2021-11-29
* Github: https://github.com/ZsoltJuhasz/
* Licenc: GNU GPL
A program kiszámítja egy ember napi kalória szükségletét
*/

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.fail;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Assertions;;

public class CaloryTest {
    CaloryCalcer caloryC;

    @BeforeEach
    void initEach() {
        this.caloryC = new CaloryCalcer();
    }

    @Test
    void calcCaloryTestForWoman() {
        double bodyWeight = 64;
        double height = 160;
        int age = 16;
        double expectedCalory = 1465.801;
        double actualCalory = this.caloryC.calcCaloryForWoman(bodyWeight, height, age);

        assertEquals(expectedCalory, actualCalory);

    }

    @Test
    void calcCaloryTestForMan() {
        double bodyWeight = 82;
        double height = 175;
        int age = 26;
        double expectedCalory = 1879.3990000000003;
        double actualCalory = this.caloryC.calcCaloryForMan(bodyWeight, height, age);

        assertEquals(expectedCalory, actualCalory);

    }

    @Test
    void calcCaloryMinTestForWoman() {
        double bodyWeight = 1;
        double height = 1;
        int age = 1;
        caloryC.setParameters(bodyWeight, height, age);
        double actual = caloryC.calcCaloryForWoman(1, 1, 1);
        double expected = 455.608;
        assertEquals(expected, actual);
    }

    @Test
    void calcCaloryMinTestForMan() {
        double bodyWeight = 1;
        double height = 1;
        int age = 1;
        caloryC.setParameters(bodyWeight, height, age);
        double actual = caloryC.calcCaloryForMan(1, 1, 1);
        double expected = 100.89099999999999;
        assertEquals(expected, actual);
    }

    @Test
    void calcCaloryNegativeTestForWoman() {
        double bodyWeight = 1;
        double height = 1;
        int age = -1;
        caloryC.setParameters(bodyWeight, height, age);
        double actual = caloryC.calcCaloryForWoman(-80,-10,-1);
        double expected = -318.81699999999995;
        assertEquals(expected, actual);

    }

    @Test
    void calcCaloryNegativeTestForMan() {
        double bodyWeight = 1;
        double height = 1;
        int age = -1;
        caloryC.setParameters(bodyWeight, height, age);
        double actual = caloryC.calcCaloryForMan(-10,-1,-1);
        double expected = -44.74000000000001;
        assertEquals(expected, actual);
    }

}
