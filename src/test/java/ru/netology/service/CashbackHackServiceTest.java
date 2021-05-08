package ru.netology.service;


import org.junit.Test;

import static org.junit.Assert.*;

public class CashbackHackServiceTest {
    CashbackHackService Cashback = new CashbackHackService();


    @Test
    public void shouldCashbackServiceIf0() {

        int actual = Cashback.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAskAddSum1() {

        int actual = Cashback.remain(10);
        int expected = 990;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAskAddSum2() {

        int actual = Cashback.remain(500);
        int expected = 500;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAskAddSum3() {

        int actual = Cashback.remain(910);
        int expected = 90;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotAskAddSum1() {

        int actual = Cashback.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldAskAddSum4() {

        int actual = Cashback.remain(1100);
        int expected = 900;
        assertEquals(expected, actual);
    }

    @Test
    public void shouldNotAskAddSum2() {

        int actual = Cashback.remain(2000);
        int expected = 0;
        assertEquals(expected, actual);
    }
}