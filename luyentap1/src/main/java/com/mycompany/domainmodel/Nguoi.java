
package com.mycompany.domainmodel;

import java.sql.Date;


public class Nguoi {
    private int id;
    private String ten;
    private String ngaySinh;
    private String diaChi;
    private double chieuCao;
    private double canNang;

    public Nguoi() {
    }

    public Nguoi(String ten, String ngaySinh, String diaChi, double chieuCao, double canNang) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.chieuCao = chieuCao;
        this.canNang = canNang;
    }
    
    

    public Nguoi(int id, String ten, String ngaySinh, String diaChi, double chieuCao, double canNang) {
        this.id = id;
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.chieuCao = chieuCao;
        this.canNang = canNang;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(float chieuCao) {
        this.chieuCao = chieuCao;
    }

    public double getCanNang() {
        return canNang;
    }

    public void setCanNang(float canNang) {
        this.canNang = canNang;
    }

    @Override
    public String toString() {
        return "Nguoi{" + "id=" + id + ", ten=" + ten + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", chieuCao=" + chieuCao + ", canNang=" + canNang + '}';
    }
    
    
    
}
