package com.sergey.nazarov.apptest;

import com.sergey.nazarov.app.App;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {

    @Test
    void testPrintAgesDoesNotThrow() {
        int[] result = App.getAgesOrder(10, 65, 34);
        assertEquals(10, result[0]);  // min
        assertEquals(34, result[1]);  // middle
        assertEquals(65, result[2]);  // max
    }
}