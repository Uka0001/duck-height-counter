package com.duck.height.tt.model;

import java.util.Comparator;
import java.util.Objects;

public class Duck implements Comparable<Duck> {
    private int height;
    private int width;

    public Duck(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Duck)) {
            return false;
        }
        Duck duck = (Duck) o;
        return height == duck.height && width == duck.width;
    }

    @Override
    public int hashCode() {
        return Objects.hash(height, width);
    }

    @Override
    public int compareTo(Duck o) {
        return Comparator
                .comparing(Duck::getHeight)
                .reversed()
                .thenComparing(Duck::getWidth)
                .compare(this, o);
    }
}
