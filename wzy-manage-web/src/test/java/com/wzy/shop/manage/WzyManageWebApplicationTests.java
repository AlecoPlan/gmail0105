package com.wzy.shop.manage;


import org.csource.common.MyException;
import org.csource.fastdfs.ClientGlobal;

import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.csource.fastdfs.pool.Connection;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.io.IOException;

@RunWith(SpringRunner.class)
@SpringBootTest
public class WzyManageWebApplicationTests {

    @Test
    public void contextLoads() throws IOException, MyException {
        //配置fdfs的全局连接地址
        String tracker = WzyManageWebApplicationTests.class.getResource("/tracker.conf").getPath();

        ClientGlobal.init(tracker);
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = trackerClient.getTrackerServer();
        StorageClient storageClient = new StorageClient(trackerServer,null);
        String[] uploadInfos = storageClient.upload_file("d:/1.jfif", "jfif", null);
        String url = "http://192.168.2.128";
        for (String uploadInfo : uploadInfos) {
            url += "/"+uploadInfo;
        }
        System.out.println(url);
    }

}
