package com.example.xinyichen.matchthemembers;

/**
 * Created by xinyichen on 9/14/17.
 */

public class ImgNamePairs {
    String memberName;
    int img;

    public ImgNamePairs(String name, int img){
        this.memberName = name;
        this.img = img;
    }

    public String getMemberName() {
        return memberName;
    }

    public int getImg() {
        return img;
    }
}
