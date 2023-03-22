package com.duck.height.tt;

import com.duck.height.tt.service.CountDuckHeight;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class DuckAppTest {
    private CountDuckHeight countDuckHeight = new CountDuckHeight();

    @Test
    void countDucksHeightHungrySorting_notOk() {
        int expected = 65;
        int actual = countDuckHeight.getTotalHeightHungrySorting();
        Assertions.assertNotEquals(expected, actual, "Method must count proper max height of ducks");
    }

    @Test
    void countDucksHeightMyCustomSorting_ok() {
        int expected = 65;
        int actual = countDuckHeight.getTotalHeightMyCustomSorting();
        Assertions.assertEquals(expected, actual, "Method must count proper max height of ducks");
    }

}