package cn.edu.jnu.x2020101367;

import org.junit.Before;
import org.junit.Test;
import junit.framework.TestCase;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {
    private Game game1;

    @Before
    public void setUp() throws Exception {
        game1 = new Game();
    }

    @Test
    //测试roll方法，投掷一次，计分不变
    public void testRollOnce() {
        game1.roll(0);
        assertEquals(0, game1.score());
    }

    @Test
    //测试roll方法，投掷两次，计分相加
    public void testRollTwice() {
        game1.roll(4);
        game1.roll(5);
        assertEquals(9, game1.score());
    }

    @Test
    //测试spare，计算下一次投掷的得分
    public void testSpare() {
        Game game = new Game();
        game.roll(4);
        game.roll(6);
        game.roll(3);
        assertEquals(16, game.score());
    }
}