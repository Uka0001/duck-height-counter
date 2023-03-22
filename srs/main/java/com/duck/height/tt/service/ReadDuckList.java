package com.duck.height.tt.service;

import com.duck.height.tt.model.Duck;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadDuckList {
    public static List<Duck> read(File file) {
        List<Duck> ducks = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file));) {
            String[] lines = new String[21];
            int count = 0;
            String reader;
            while ((reader = bufferedReader.readLine()) != null) {
                lines[count] = reader;
                count++;
            }
            for (int i = 1; i < lines.length; i++) {
                if (!lines[i].isEmpty()) {
                    String height = lines[i].split(" ")[0];
                    String length = lines[i].split(" ")[1];
                    ducks.add(new Duck(Integer.valueOf(height), Integer.valueOf(length)));
                }
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return ducks;
    }
}
