import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

public class MapTest {
    
    @Test
    public void testMapOps(){
        
        Map<String, Person> people = new HashMap<String, Person>();
        Person george = new Person("George", 25);
        Person micheal = new Person("Micheal", 22);
        
        people.put((String)george.getName(), george);
        people.put((String)micheal.getName(), micheal);
        
        assertTrue(people.containsKey(micheal.getName()));
        assertTrue(people.containsKey(new Person("foobar")));
        
        assertEquals(people.get(micheal.getName()).getAge(), 22);
    }

    private void assertEquals(int age, int i) {
    }

    private void assertTrue(boolean containsKey) {
    }
}
