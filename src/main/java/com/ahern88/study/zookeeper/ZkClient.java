package com.ahern88.study.zookeeper;

import org.apache.zookeeper.*;
import org.apache.zookeeper.data.ACL;

import java.util.ArrayList;
import java.util.List;

/**
 * @author aiheng
 * @date 2019-08-17 03:57
 */
public class ZkClient {

    public static void main(String[] args) throws Exception{
        ZooKeeper zooKeeper = new ZooKeeper("localhost:2181,localhost:2182,localhost:2183", 3000, new Watcher() {
            @Override
            public void process(WatchedEvent event) {

                if(event.getType() == Event.EventType.NodeDeleted) {

                }
                System.out.println(event + "=============");
            }
        });

        String str = "hello world";

        zooKeeper.create("/zkstudy", null, ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);

        zooKeeper.create("/zkstudy/data", str.getBytes(), ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.PERSISTENT);

        Thread.sleep(Long.MAX_VALUE);

    }

}
