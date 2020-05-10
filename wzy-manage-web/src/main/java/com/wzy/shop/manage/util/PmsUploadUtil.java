package com.wzy.shop.manage.util;

import org.csource.fastdfs.ClientGlobal;
import org.csource.fastdfs.StorageClient;
import org.csource.fastdfs.TrackerClient;
import org.csource.fastdfs.TrackerServer;
import org.springframework.web.multipart.MultipartFile;


/**
 * @author shkstart
 * @creats 2020-05-09-19:00
 */
public class PmsUploadUtil {

    public static String uploadImage(MultipartFile multipartFile) {

        String imgUrl = "http://192.168.2.128";
        //上传图片服务器
        //配置fdfs的全局连接地址
        String tracker = PmsUploadUtil.class.getResource("/tracker.conf").getPath();

        try {
            ClientGlobal.init(tracker);
        } catch (Exception e) {
            e.printStackTrace();
        }
        TrackerClient trackerClient = new TrackerClient();
        TrackerServer trackerServer = null;
        try {
            trackerServer = trackerClient.getTrackerServer();
        } catch (Exception e) {
            e.printStackTrace();
        }
        StorageClient storageClient = new StorageClient(trackerServer,null);
        try {
            byte[] bytes = multipartFile.getBytes();//获得上传的二进制对象
            String originalFilename = multipartFile.getOriginalFilename();//获得文件全名
            int i = originalFilename.lastIndexOf(".");//获得最后一个.
            String extName = originalFilename.substring(i+1);//截取后缀
            String[] uploadInfos = storageClient.upload_file(bytes, "jfif", null);
            for (String uploadInfo : uploadInfos) {
                imgUrl += "/"+uploadInfo;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return imgUrl;
    }
}
