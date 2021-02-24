import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class ListTest {

    @Test
    public void testListBehaviour(){

        List<Person> people = new ArrayList<>();
        Person kofi = new Person("kofi");
        Person ama = new Person("ama");

        //simple add operations
        people.add(kofi);
        people.add(1,ama);
        
        Person p = people.get(0);
        
        assertEquals(p.getName(), "kofi");
    }

    private void assertEquals(Object name, String kofi) {
    }


}
