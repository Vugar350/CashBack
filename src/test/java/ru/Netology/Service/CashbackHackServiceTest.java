package ru.Netology.Service;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {

    @org.testng.annotations.Test
    public void testRemain() {
        CashbackHackService service = new CashbackHackService();
        int amount=900;
        int actual=service.remain(800);
        int expected=200;
        assertEquals (actual,expected);

    }
    @org.testng.annotations.Test
    public void testRemainOver() {
        CashbackHackService service = new CashbackHackService();
        int amount;
        int actual=service.remain(1100);
        int expected=900;
        assertEquals (actual,expected);

    }
    @org.testng.annotations.Test
    public void testRemainMin() {
        CashbackHackService service = new CashbackHackService();
        int amount;
        int actual=service.remain(0);
        int expected=1000;
        assertEquals (actual,expected);

    }
    @org.testng.annotations.Test
    public void testRemain1() {
        CashbackHackService service = new CashbackHackService();
        int amount;
        int actual=service.remain(1000);
        int expected=0;
        assertEquals (actual,expected);

    }

}