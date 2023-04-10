package cn.edu.jnu.x2020101367;

import org.junit.Test;
import junit.framework.TestCase;
import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class BowlingGameUnitTest {
    @Test
    //测试roll方法，投掷一次，计分不变
    public void testRollOnce() {
        Game game = new Game();
        game.roll(0);
        assertEquals(0, game.score());
    }


}