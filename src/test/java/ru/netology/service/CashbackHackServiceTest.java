package ru.netology.service;


import org.testng.annotations.Test;
import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService Cashback = new CashbackHackService();


    @Test
    void shouldCashbackServiceIf0() {

        int actual = Cashback.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

    @Test
    void shouldAskAddSum1() {

        int actual = Cashback.remain(10);
        int expected = 990;
        assertEquals(actual, expected);
    }

    @Test
    void shouldAskAddSum2() {

        int actual = Cashback.remain(500);
        int expected = 500;
        assertEquals(actual, expected);
    }

    @Test
    void shouldAskAddSum3() {

        int actual = Cashback.remain(910);
        int expected = 90;
        assertEquals(actual, expected);
    }

    @Test
    void shouldNotAskAddSum1() {

        int actual = Cashback.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    void shouldAskAddSum4() {

        int actual = Cashback.remain(1100);
        int expected = 900;
        assertEquals(actual, expected);
    }

    @Test
    void shouldNotAskAddSum2() {

        int actual = Cashback.remain(2000);
        int expected = 0;
        assertEquals(actual, expected);
    }
}