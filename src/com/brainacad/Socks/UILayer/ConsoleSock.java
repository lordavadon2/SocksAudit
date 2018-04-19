package com.brainacad.Socks.UILayer;

import com.brainacad.Socks.ModelLayer.SockData;
import com.brainacad.Socks.ModelLayer.ISock;

import java.util.Scanner;

public class ConsoleSock implements IUISock {

    @Override
    public ISock getSockFromUser() {
        Scanner sc = new Scanner(System.in);
        SockData result = new SockData();
        System.out.println("Please enter new sockData:");
        System.out.println("Type: ");
        result.setType(sc.nextLine());
        System.out.println("Size: ");
        result.setSize(Integer.parseInt(sc.nextLine()));
        System.out.println("Color: ");
        result.setColor(sc.nextLine());

        return result;
    }

    @Override
    public void showSock(ISock sock) {
        System.out.println(sock.toString());
    }

    @Override
    public void showSock(ISock[] socks) {
        for (ISock sock : socks) {
            showSock(sock);
        }
    }

    public void updateSock(ISock sock){
        Scanner sc = new Scanner(System.in)
        System.out.println("Data to change: ");
        showSock(sock);
        System.out.println("Please input field to change: ");
        int fieldIndex = Integer.parseInt(sc.nextLine());
        System.out.println("Please input new value: ");
        String newValue = sc.nextLine();


    }


}
