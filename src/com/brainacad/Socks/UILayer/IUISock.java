package com.brainacad.Socks.UILayer;

import com.brainacad.Socks.ModelLayer.ISock;

public interface IUISock {
    ISock getSockFromUser();
    void showSock(ISock sock);
    void showSock(ISock[] sock);
}
