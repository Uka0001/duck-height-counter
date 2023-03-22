package com.duck.height.tt.service;


import com.duck.height.tt.model.Duck;

import java.io.File;
import java.util.List;

public class CountDuckHeight {
    File file = new File("srs/main/resources/input.xls");
    private ReadDuckList readDuckList = new ReadDuckList();
    public int getTotalHeight() {
        List<Duck> ducks = readDuckList.read(file);
        ducks.sort(Duck::compareTo);
        int totalHeight = 0;
        int totalWidth = 0;
        for (int i = 0; i < ducks.size(); i++) {
            totalHeight += ducks.get(i).getHeight();
            totalWidth += ducks.get(i).getWidth();
            if (totalWidth > 50) {
                break;
            }
        }
        return totalHeight;
    }
}
