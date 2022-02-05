import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void addition(){
        SkillDemo test=new SkillDemo();
        assertEquals(1,test.add(1,3));
    }
}
