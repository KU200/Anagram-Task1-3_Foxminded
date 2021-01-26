import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class AnagramMakerTest {

    AnagramMaker anagramMakerTest = new AnagramMaker();

    @Test
    public void revers_AssertEquals_IfInputIsNull() {
        assertEquals(null, anagramMakerTest.revers(null));
    }

    @Test
    public void revers_AssertEquals_IfInputIsEmpty() {
        assertEquals("", anagramMakerTest.revers(""));
    }

    @Test
    public void revers_AssertEquals_IfInputIsLetters() {
        assertEquals("qwerty asdfg", anagramMakerTest.revers("ytrewq gfdsa"));
    }

    @Test
    public void revers_AssertEquals_IfInputIsNums() {
        assertEquals("123 456", anagramMakerTest.revers("123 456"));
    }

    @Test
    public void revers_AssertEquals_IfInputIsChars() {
        assertEquals("!?/ <.", anagramMakerTest.revers("!?/ <."));
    }

    @Test
    public void revers_AssertEquals_IfInputIsLettersNums() {
        assertEquals("q1werty asdf2g", anagramMakerTest.revers("y1trewq gfds2a"));
    }

    @Test
    public void revers_AssertEquals_IfInputIsLettersChars() {
        assertEquals("qwert!y a?sdfg", anagramMakerTest.revers("ytrew!q g?fdsa"));
    }

    @Test
    public void revers_AssertEquals_IfInputIsNumsChars() {
        assertEquals("09876! ?/<.", anagramMakerTest.revers("09876! ?/<."));
    }

    @Test
    public void revers_AssertEquals_IfInputIsLettersNumsChars() {
        assertEquals("qwe0987 6!?/<.rty", anagramMakerTest.revers("ewq0987 6!?/<.ytr"));
    }
}
