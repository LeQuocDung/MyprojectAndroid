package com.example.myproject.model;

public class datashop {
    private int hinhanh;
    private String ten;
    private String gia;
    private String gioithieu;

    public datashop(int hinhanh, String ten, String gia, String gioithieu) {
        this.hinhanh = hinhanh;
        this.ten = ten;
        this.gia = gia;
        this.gioithieu = gioithieu;
    }

    public int getHinhanh() {
        return hinhanh;
    }

    public void setHinhanh(int hinhanh) {
        this.hinhanh = hinhanh;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getGia() {
        return gia;
    }

    public void setGia(String gia) {
        this.gia = gia;
    }

    public String getGioithieu() {
        return gioithieu;
    }

    public void setGioithieu(String gioithieu) {
        this.gioithieu = gioithieu;
    }
}

