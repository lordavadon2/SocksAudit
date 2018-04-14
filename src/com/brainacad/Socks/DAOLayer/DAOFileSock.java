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
    Path path;
    public DAOFileSock() throws IOException {

        path = Paths.get("testDataFile.txt");
        data = Files.readAllLines(path);
        sockCollection = new ArrayList<>();
        readSock();
    }

    private int getNewId(){
        return sockCollection.size() == 0 ? 0 : sockCollection.get(sockCollection.size()-1).getId()+1;
    }

    @Override
    public int addSock(ISock sock) {
        if (sock.getId() < 0){
            ISock newSock = new SockData(getNewId(), sock);
            sockCollection.add(newSock);
            data.add(newSock.toString());
        }
        try {
            Files.write(path, data);
        } catch (IOException e) {
            return -1;
        }
        return sock.getId();
        //TO DO
        //Change save data algoritm, decrease file write operation
        //remove to use data collection
    }

    @Override
    public int[] addSock(ISock[] sock) {
        int[] result = new int[sock.length];
        int i = 0;
        for (ISock element: sock) {
            result[i++] = addSock(element);
        }
        return result;
    }

    ISock stringToSock(String str){
        String[] fields = str.split("\\|");
        int id = Integer.parseInt(fields[0]);
        String type = fields[1];
        int size = Integer.parseInt(fields[2]);
        String color = fields[3];
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
        ISock result = null;
        for (ISock sock: sockCollection) {
            if (sock.getId() == id){
                result = sock;
                break;
            }
        }
        return result;
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
