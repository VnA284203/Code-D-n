
package com.mycompany.domainmodel;

import java.sql.Date;


public class sinhVien extends Nguoi{
    private String maSV;
    private String TruongHoc;
    private int namHoc;
    private double diemTB;

    public sinhVien() {
    }

    public sinhVien(String maSV, String TruongHoc, int namHoc, double diemTB, String ten, String ngaySinh, String diaChi, double chieuCao, double canNang) {
        super(ten, ngaySinh, diaChi, chieuCao, canNang);
        this.maSV = maSV;
        this.TruongHoc = TruongHoc;
        this.namHoc = namHoc;
        this.diemTB = diemTB;
    }

    public sinhVien(String maSV, String TruongHoc, int namHoc, double diemTB, int id, String ten, String ngaySinh, String diaChi, double chieuCao, double canNang) {
        super(id, ten, ngaySinh, diaChi, chieuCao, canNang);
        this.maSV = maSV;
        this.TruongHoc = TruongHoc;
        this.namHoc = namHoc;
        this.diemTB = diemTB;
    }

    


    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getTruongHoc() {
        return TruongHoc;
    }

    public void setTruongHoc(String TruongHoc) {
        this.TruongHoc = TruongHoc;
    }

    public int getNamHoc() {
        return namHoc;
    }

    public void setNamHoc(int namHoc) {
        this.namHoc = namHoc;
    }

    public double getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    @Override
    public String toString() {
        return "sinhVien{" + "maSV=" + maSV + ", TruongHoc=" + TruongHoc + ", namHoc=" + namHoc + ", diemTB=" + diemTB + '}';
    }

    public void DiemTb() {
        
        if (diemTB < 3) {
            System.out.println("Học Sinh kém ");
        } else if (diemTB > 3  && diemTB < 5) {
            System.out.println("Học Sinh yếu");
        }else if (diemTB  >=5 && diemTB <= 6.5 ) {
            System.out.println("Học Sinh Trung Bình");
        }else if (diemTB >= 6.5 && diemTB <=7.5) {
            System.out.println("Học Sinh Khá");
        }else {
            System.out.println("Học Sinh Giỏi");
        }
        return ;
    }
    
}
