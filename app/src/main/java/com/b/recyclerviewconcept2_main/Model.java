package com.b.recyclerviewconcept2_main;

public class Model
{
    private String header;
    private String desc;
    private int imgname;

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public int getImgname() {
        return Integer.parseInt(String.valueOf(imgname));
    }

    public void setImgname(int imgname) {
        this.imgname = imgname;
    }
}
