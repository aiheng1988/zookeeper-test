package com.ahern88.study.zookeeper;

import org.apache.zookeeper.server.quorum.QuorumPeerMain;

/**
 * 以集群的方式启动Zookeeper
 * Created by messi01.ai on 2017/8/13.
 */
public class ZkCluster2Test {

    public static void main(String[] args) {
        // 启动Zookeeper
        if(args == null || args.length == 0) {
            args = new String[1];
            args[0] = "/Users/aiheng/Codes/zookeeper-test/src/main/resources/zoo2.properties";
        }
        QuorumPeerMain.main(args);
    }

}
