package com.brainacad.Socks;

import com.brainacad.Socks.ModelLayer.ISock;
import com.brainacad.Socks.UILayer.ConsoleSock;
import com.brainacad.Socks.UILayer.IUISock;

public class Main {

    public static void main(String[] args) {
	// write your code here

        IUISock sockinput = new ConsoleSock();
        ISock sock = sockinput.getSockFromUser();
        System.out.println(sock);
    }
}
