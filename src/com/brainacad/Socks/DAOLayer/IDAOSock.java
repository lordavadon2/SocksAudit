package com.brainacad.Socks.DAOLayer;

import com.brainacad.Socks.ModelLayer.ISock;

import java.util.List;

public interface IDAOSock {

    boolean addSock(ISock sock);
    boolean addSock(ISock[] sock);

    List<ISock> readSock();
    ISock readSock(int id);

    boolean updateSock(ISock changedSock);

    boolean deleteSock(int id);
    boolean deleteSock(int[] id);
}
