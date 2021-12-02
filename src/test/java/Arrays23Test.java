import office.Arrays23;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class Arrays23Test {

    @Test
    void testInsert() {
        assertArrayEquals(Arrays23.insert(new int[]{5, 9, 14, 15}, 6, 20), new int[]{5, 9, 14, 15, 6});
        assertArrayEquals(Arrays23.insert(new int[]{5, 9, 14, 15}, 3, 2), new int[]{5, 9, 3, 14, 15});
        assertArrayEquals(Arrays23.insert(new int[]{5, 9, 14, 15}, 7, 0), new int[]{7, 5, 9, 14, 15});
        assertThrows(RuntimeException.class, () -> Arrays23.insert(new int[]{5, 9, 14, 15}, 7, -6));
    }

    @Test
    void testReverse() {
        int[] array = new int[]{1, 2, 3};
        Arrays23.reverse(array);
        assertArrayEquals(array, new int[]{3, 2, 1});
    }

    @Test
    void testReplicate() {
        int[] array2 = new int[]{3, 2, 4, 1};
        assertArrayEquals(Arrays23.replicate(array2), new int[]{3, 3, 3, 2, 2, 4, 4, 4, 4, 1});
    }
}
