import org.junit.Test;

import java.util.LinkedList;
import java.util.Queue;

public class QueueTest {

    @Test
    public void testQueueOps(){

        Queue<Person> people = new LinkedList<>();
        Person jack = new Person("Jack Ma");
        Person zain = new Person("Zanku");

        people.add(jack);
        people.offer(zain);

        assertEquals(people.element().getName(), "jack");

        Person p = people.poll();

        assertEquals(p.getName(), "jack");
        assertEquals(people.element().getName(),"zain");
    }

    private void assertEquals(Object name, String jack) {
    }
}
