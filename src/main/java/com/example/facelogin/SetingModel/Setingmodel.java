package com.example.facelogin.SetingModel;


import org.springframework.stereotype.Component;

@Component
public class Setingmodel {
    private String imgpath;
    private String GroupID;
    private String UserID;
    private String Quality_Control;
    private String Image_Type;
    private String Liveness_Control;
    private String Userinf;

    public String getUserinf() {
        return Userinf;
    }

    public void setUserinf(String userinf) {
        Userinf = userinf;
    }

    public Setingmodel() {
        /**
         * 图片类型
         * BASE64:图片的base64值，base64编码后的图片数据，编码后的图片大小不超过2M；
         * URL:图片的 URL地址( 可能由于网络等原因导致下载图片时间过长)；
         * FACE_TOKEN：人脸图片的唯一标识，调用人脸检测接口时
         * 会为每个人脸图片赋予一个唯一的FACE_TOKEN
         * 同一张图片多次检测得到的FACE_TOKEN是同一个。
         */
        this.Image_Type = "BASE64";
        /**
         * 图片质量控制
         * NONE: 不进行控制
         * LOW:较低的质量要求
         * NORMAL: 一般的质量要求
         * HIGH: 较高的质量要求
         * 默认 NONE
         */
        this.Quality_Control = "NONE";
        /**
         * 活体检测控制
         * NONE: 不进行控制
         * LOW:较低的活体要求(高通过率 低攻击拒绝率)
         * NORMAL: 一般的活体要求(平衡的攻击拒绝率, 通过率)
         * HIGH: 较高的活体要求(高攻击拒绝率 低通过率)
         * 默认NONE
         */
        this.Liveness_Control = "NONE";
    }

    public String getImgpath() {
        return imgpath;
    }

    public void setImgpath(String imgpath) {
        this.imgpath = imgpath;
    }

    public String getGroupID() {
        return GroupID;
    }

    public void setGroupID(String groupID) {
        GroupID = groupID;
    }

    public String getUserID() {
        return UserID;
    }

    public void setUserID(String userID) {
        UserID = userID;
    }

    public String getQuality_Control() {
        return Quality_Control;
    }

    public void setQuality_Control(String quality_Control) {
        Quality_Control = quality_Control;
    }

    public String getImage_Type() {
        return Image_Type;
    }

    public void setImage_Type(String image_Type) {
        Image_Type = image_Type;
    }

    public String getLiveness_Control() {
        return Liveness_Control;
    }

    public void setLiveness_Control(String liveness_Control) {
        Liveness_Control = liveness_Control;
    }
}
