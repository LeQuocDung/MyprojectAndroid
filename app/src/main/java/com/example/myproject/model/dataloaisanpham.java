package com.example.myproject.model;

public class dataloaisanpham {
    private int hinhanh;
    private String ten;
    private String gia;

    public dataloaisanpham(int hinhanh, String ten, String gia) {
        this.hinhanh = hinhanh;
        this.ten = ten;
        this.gia = gia;
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
}
