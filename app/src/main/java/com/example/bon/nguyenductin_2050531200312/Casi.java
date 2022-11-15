package com.example.bon.nguyenductin_2050531200312;

public class Casi {
    private int HinhAnh1,Hinhanh2;
    private String Ten,Nghedanh,Quocgia;

    public Casi(int hinhAnh1, int hinhanh2, String ten, String nghedanh, String quocgia) {
        HinhAnh1 = hinhAnh1;
        Hinhanh2 = hinhanh2;
        Ten = ten;
        Nghedanh = nghedanh;
        Quocgia = quocgia;
    }

    public int getHinhAnh1() {
        return HinhAnh1;
    }

    public void setHinhAnh1(int hinhAnh1) {
        HinhAnh1 = hinhAnh1;
    }

    public int getHinhanh2() {
        return Hinhanh2;
    }

    public void setHinhanh2(int hinhanh2) {
        Hinhanh2 = hinhanh2;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public String getNghedanh() {
        return Nghedanh;
    }

    public void setNghedanh(String nghedanh) {
        Nghedanh = nghedanh;
    }

    public String getQuocgia() {
        return Quocgia;
    }

    public void setQuocgia(String quocgia) {
        Quocgia = quocgia;
    }
}
