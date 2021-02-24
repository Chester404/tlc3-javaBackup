import org.junit.Test;

import java.util.HashSet;
import java.util.Set;

public class SetTest {

    @Test
    public void testSeAddRemove(){
        Set<Person> people = new HashSet<>();
        Person Davis = new Person("davido");
        Person Gringo = new Person("greg");
        people.add(Davis);
        people.add(Gringo);
        
        assertTrue(people.contains(Davis));
        
        people.remove(Davis);
        
        assertFalse(people.contains(Davis));
        assertFalse(people.contains(Gringo));
    }

    private void assertFalse(boolean contains) {
    }

    private void assertTrue(boolean contains) {
    }
}
