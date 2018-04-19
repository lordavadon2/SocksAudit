package com.brainacad.Socks;

import com.brainacad.Socks.DAOLayer.DAOFileSock;
import com.brainacad.Socks.ModelLayer.ISock;
import com.brainacad.Socks.ModelLayer.SockData;
import com.brainacad.Socks.UILayer.ConsoleSock;
import com.brainacad.Socks.UILayer.IUISock;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
	// write your code here

//        IUISock sockinput = new ConsoleSock();
//        ISock sock = sockinput.getSockFromUser();
        try {
            DAOFileSock daoFileSock = new DAOFileSock();

            List<ISock> sockList = daoFileSock.getSockCollection();
            ISock sockNew = sockList.get(1);
            sockNew.setColor("Purple");
            daoFileSock.updateSock(sockNew);

            daoFileSock.deleteSock(1);

            for (ISock sock: sockList) {
                System.out.println(sock.toString());
            }

//            daoFileSock.addSock(sock);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
