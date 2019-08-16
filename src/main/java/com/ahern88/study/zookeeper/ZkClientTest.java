package com.ahern88.study.zookeeper;

import org.apache.zookeeper.server.quorum.QuorumPeerMain;

/**
 * Created by messi01.ai on 2017/8/13.
 */
public class ZkClientTest {

    public static void main(String[] args) {
        // 启动Zookeeper
        if(args == null || args.length == 0) {
            args = new String[1];
            args[0] = "/Users/aiheng/Codes/zookeeper-test/src/main/resources/zk.properties";
        }
        //ZooKeeperServerMain.main(args);
        QuorumPeerMain.main(args);
//        QuorumPeerMain main = new QuorumPeerMain();
//        QuorumPeerConfig config = new QuorumPeerConfig();
//        Properties properties = new Properties();
//        properties.put("dataDir", "/apps/dat/zk/data");
//        properties.put("dataLogDir", "/apps/dat/zk/logs");
//        properties.put("initLimit", 3000);
//        properties.put("syncLimit", 3000);
//        properties.put("clientPort", 2181);
//        try {
//            config.parseProperties(properties);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//        try {
//            main.runFromConfig(config);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
    }

}
