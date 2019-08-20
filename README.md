# zookeeper学习笔记

## 单机模式（Standalone）启动

```java
public static void main(String[] args) {
        // 启动Zookeeper
        if(args == null || args.length == 0) {
            args = new String[1];
            args[0] = "/Users/aiheng/Codes/zookeeper-test/src/main/resources/zk.properties";
        }
        ZooKeeperServerMain.main(args);
    }
```

TODO： 单机启动流程图

## 集群模式（Cluster）启动

```java
public static void main(String[] args) {
           // 启动Zookeeper
           if(args == null || args.length == 0) {
               args = new String[1];
               args[0] = "/Users/aiheng/Codes/zookeeper-test/src/main/resources/zoo1.properties";
           }
           QuorumPeerMain.main(args);
       }
```

TODO：集群模式启动流程图


