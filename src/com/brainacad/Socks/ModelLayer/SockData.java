package com.brainacad.Socks.ModelLayer;

public class SockData implements ISock, Comparable {

    private String type;
    private String color;
    private int size;
    private int id;

    public SockData() {
        this.type = "";
        this.color = "";
        this.size = 0;
        this.id = -1;
    }

    public SockData(String type, String color, int size) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.id = -1;
    }

    public SockData(String type, String color, int size, int id) {
        this.type = type;
        this.color = color;
        this.size = size;
        this.id = id;
    }


    public SockData(int id, ISock sock) {
        this.type = sock.getTypes();
        this.color = sock.getColor();
        this.size = sock.getSize();
        this.id = id;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String getTypes() {
        return this.type;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public int getId() {
        return this.id;
    }

    @Override
    public int compareTo(ISock o2) {
        return 0;
    }

    @Override
    public int compareTo(Object o) {
        if (o instanceof ISock){
            if (this.getId() > ((ISock)o).getId()) return 1;
            if (this.getId() < ((ISock)o).getId()) return -1;
        }
        return 0;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("");
        sb.append(this.id);
        sb.append("|" + this.type);
        sb.append("|" + this.size);
        sb.append("|" + this.color);
        return sb.toString();
    }


}
