package com.brainacad.Socks.ModelLayer;

import java.util.Comparator;

public interface ISock extends Comparator {
    void setType(String type);
    void setSize(int size);
    void setColor(String color);

    String getTypes();
    int getSize();
    String getColor();
    int getId();

    int compareTo(ISock o2);
}
