package com.brainacad.Socks;

import com.brainacad.Socks.DAOLayer.DAOFileSock;
import com.brainacad.Socks.ModelLayer.ISock;
import com.brainacad.Socks.UILayer.ConsoleSock;
import com.brainacad.Socks.UILayer.IUISock;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {
	// write your code here

        IUISock sockinput = new ConsoleSock();
        ISock sock = sockinput.getSockFromUser();
        try {
            DAOFileSock daoFileSock = new DAOFileSock();
            daoFileSock.addSock(sock);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
