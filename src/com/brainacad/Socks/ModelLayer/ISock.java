package com.brainacad.Socks.ModelLayer;

public interface ISock{
    void setType(String type);
    void setSize(int size);
    void setColor(String color);

    String getTypes();
    int getSize();
    String getColor();
    int getId();

    int compareTo(ISock o2);
}
