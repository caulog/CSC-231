import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DFSMTabularTest {
    DFSMTabular dfsm;

    @Before
    public void setUp() throws Exception {
        dfsm = new DFSMTabular();
    }

    @Test
    public void test1() {
        assertEquals(true, dfsm.checkWord("10201"));
    }

    @Test
    public void test2() {
        assertEquals(true, dfsm.checkWord("210201"));
    }

    @Test
    public void test3() {
        assertEquals(true, dfsm.checkWord("102012"));
    }

    @Test
    public void test4() {
        assertEquals(true, dfsm.checkWord("2102012"));
    }

    @Test
    public void test5() {
        assertEquals(true, dfsm.checkWord("1010201"));
    }

    @Test
    public void test6() {
        assertEquals(true, dfsm.checkWord("1020101"));
    }

    @Test
    public void test7() {
        assertEquals(true, dfsm.checkWord("101020101"));
    }

    @Test
    public void test8() {
        assertEquals(true, dfsm.checkWord("21010201012"));
    }

    @Test
    public void test9() {
        assertEquals(true, dfsm.checkWord("10201012"));
    }

    @Test
    public void test10() {
        assertEquals(true, dfsm.checkWord("210101020101"));
    }

    @Test
    public void test11() {
        assertEquals(false, dfsm.checkWord("2"));
    }

    @Test
    public void test12() {
        assertEquals(false, dfsm.checkWord("1001"));
    }

    @Test
    public void test13() {
        assertEquals(false, dfsm.checkWord("10210"));
    }

    @Test
    public void test14() {
        assertEquals(false, dfsm.checkWord("01201"));
    }

    @Test
    public void test15() {
        assertEquals(false, dfsm.checkWord("102201"));
    }

    @Test
    public void test16() {
        assertEquals(false, dfsm.checkWord("101201"));
    }

    @Test
    public void test17() {
        assertEquals(false, dfsm.checkWord("102001"));
    }

    @Test
    public void test18() {
        assertEquals(false, dfsm.checkWord("110201"));
    }

    @Test
    public void test19() {
        assertEquals(false, dfsm.checkWord("102011"));
    }

    @Test
    public void test20() {
        assertEquals(false, dfsm.checkWord("10"));
    }

    @Test
    public void test21() {
        assertEquals(true, dfsm.checkWord("210201012"));
    }

    @Test
    public void test22() {
        assertEquals(false, dfsm.checkWord("1010102201"));
    }

    @Test
    public void test23() {
        assertEquals(false, dfsm.checkWord("01"));
    }

    @Test
    public void test24() {
        assertEquals(false, dfsm.checkWord("221020122"));
    }

    @Test
    public void test25() {
        assertEquals(true, dfsm.checkWord("101010201"));
    }

    @Test
    public void test26() {
        assertEquals(true, dfsm.checkWord("21010101010101020101010101012"));
    }
}
