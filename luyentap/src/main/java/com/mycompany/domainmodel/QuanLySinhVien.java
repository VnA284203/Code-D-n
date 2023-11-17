/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.domainmodel;

import java.util.ArrayList;

/**
 *
 * @author My PC
 */
public class QuanLySinhVien implements SinhVienDao{
    private ArrayList<sinhVien> sv = new ArrayList<>();
    public QuanLySinhVien () {
        sv = new ArrayList<sinhVien>();
    }
    @Override
    public void insert(sinhVien sv) {
        this.sv.add(sv);
    }

    @Override
    public void update(int viTri, sinhVien sv) {
        this.sv.set(viTri, sv);
    }

    @Override
    public void delete(int viTri) {
        this.sv.remove(viTri);
    }

    @Override
    public ArrayList<sinhVien> getlist() {
        return this.sv;
    }

    @Override
    public sinhVien getbyindex(int viTri) {
        return this.sv.get(viTri);
    }

    @Override
    public void setlist(ArrayList<sinhVien> sv) {
        this.sv = sv;
    }

   
    
}
