package com.example.kimby.snspayer;

public class SettingDTO {
    String title;
    int imgIcon;

    public SettingDTO(String title, int imgIcon) {
        this.title = title;
        this.imgIcon = imgIcon;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getImgIcon() {
        return imgIcon;
    }

    public void setImgIcon(int imgIcon) {
        this.imgIcon = imgIcon;
    }

    @Override
    public String toString() {
        return "제목 : " + title;
    }
}
