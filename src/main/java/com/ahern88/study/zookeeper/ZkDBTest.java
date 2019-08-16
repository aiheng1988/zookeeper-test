package com.ahern88.study.zookeeper;

import org.apache.zookeeper.server.ZKDatabase;
import org.apache.zookeeper.server.persistence.FileTxnSnapLog;

import java.io.File;
import java.io.IOException;

/**
 * Created by messi01.ai on 2017/9/11.
 */
public class ZkDBTest {

    private static ZKDatabase zkDatabase;

    public static void main(String[] args) {
        File dataFile = new File("test-zk/data");
        File logFile = new File("test-zk/logs");
        try {
            FileTxnSnapLog fileTxnSnapLog = new FileTxnSnapLog(dataFile, logFile);
            zkDatabase = new ZKDatabase(fileTxnSnapLog);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void testAddNode() {
//        DataNode dataNode = new DataNode();
//        zkDatabase.getDataTree().addDataNode("/test", dataNode);
    }

}
