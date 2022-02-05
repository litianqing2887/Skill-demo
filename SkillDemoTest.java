import static org.junit.Assert.*;
import org.junit.*;

public class SkillDemoTest {
    @Test
    public void addition(){
        SkillDemo test=new SkillDemo();
        assertEquals(4,test.add(1,3));
    }
}
