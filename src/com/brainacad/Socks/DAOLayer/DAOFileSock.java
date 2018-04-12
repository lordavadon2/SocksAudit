package com.brainacad.Socks.DAOLayer;

import com.brainacad.Socks.ModelLayer.ISock;
import com.brainacad.Socks.ModelLayer.SockData;

import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;


public class DAOFileSock implements IDAOSock {

    List<String> data;
    List<ISock> sockCollection;
    FileReader fr;
    public DAOFileSock() throws IOException {

        Path path = Paths.get("testDataFile.txt");
        data = Files.readAllLines(path);
        sockCollection = new ArrayList<>();
    }

    @Override
    public boolean addSock(ISock sock) {
        if (sock.getId() < 0){
            int lastId = sockCollection.get(sockCollection.size()-1).getId();
            
        }
    }

    @Override
    public boolean addSock(ISock[] sock) {
        return false;
    }

    ISock stringToSock(String str){
        String[] fields = str.split("|");
        int id = Integer.parseInt(fields[0]);
        String type = fields[1];
        String color = fields[2];
        int size = Integer.parseInt(fields[3]);
        return new SockData(type, color, size, id);
    }

    @Override
    public List<ISock> readSock() {
        for (String str : data) {
            ISock sock = stringToSock(str);
            sockCollection.add(sock);
        }
        sockCollection.sort(new Comparator<ISock>() {
            @Override
            public int compare(ISock o1, ISock o2) {
                return o1.compareTo(o2);
            }
        });
        return sockCollection;
    }

    @Override
    public ISock readSock(int id) {
        return null;
    }

    @Override
    public boolean updateSock(ISock changedSock) {
        return false;
    }

    @Override
    public boolean deleteSock(int id) {
        return false;
    }

    @Override
    public boolean deleteSock(int[] id) {
        return false;
    }
}
