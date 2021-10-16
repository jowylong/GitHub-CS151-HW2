import edu.sjsu.ong.ArrayListUtils;
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

public class MeanTest {
    @Test public void testMean() {
        ArrayListUtils a = new ArrayListUtils();
        ArrayList<Integer> arr = new ArrayList<Integer>();
        arr.add(2);
        arr.add(2);
        arr.add(2);
        assertEquals(a.mean(arr), 2, "Array List should have a mean of 2 after adding the 3 elements.");
    }
}
