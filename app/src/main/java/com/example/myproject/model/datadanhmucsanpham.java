package com.example.myproject.model;

public class datadanhmucsanpham {
    public int anhnen;
    public String tenLoai;

    public datadanhmucsanpham(int anhnen, String tenLoai) {
        this.anhnen = anhnen;
        this.tenLoai = tenLoai;
    }

    public int getAnhnen() {
        return anhnen;
    }

    public void setAnhnen(int anhnen) {
        this.anhnen = anhnen;
    }

    public String getTenLoai() {
        return tenLoai;
    }

    public void setTenLoai(String tenLoai) {
        this.tenLoai = tenLoai;
    }
}
