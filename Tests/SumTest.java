import edu.sjsu.ong.ArrayListUtils;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class SumTest {
    @Test public void testSum() {
        ArrayListUtils a = new ArrayListUtils();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(5);
        arr.add(3);
        assertEquals(a.sum(arr), 10, "Array List should equal to 10 after adding the 3 elements.");
    }
}
