package com.example.suitmedia2;

public class Event {

    private String nama;
    private String image;
    private String tanggal;
    private String desc;

    public Event() {
    }

    public Event(String nama, String image, String tanggal, String desc) {
        this.nama = nama;
        this.image = image;
        this.tanggal = tanggal;
        this.desc = desc;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTanggal() {
        return tanggal;
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }


}
