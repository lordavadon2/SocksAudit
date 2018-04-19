package com.brainacad.Socks.DAOLayer;

import com.brainacad.Socks.ModelLayer.ISock;

import java.util.List;

public interface IDAOSock {

    int addSock(ISock sock);
    int[] addSock(ISock[] sock);

    List<ISock> getSockCollection();
    ISock readSock(int id);

    boolean updateSock(ISock changedSock);

    boolean deleteSock(int id);
    boolean deleteSock(int[] id);
}
