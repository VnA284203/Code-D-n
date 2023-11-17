
package com.mycompany.domainmodel;

import java.util.ArrayList;


public interface SinhVienDao {
    public void insert(sinhVien sv) ;
    public void update(int viTri,sinhVien sv);
    public void delete(int viTri);
    public ArrayList<sinhVien> getlist();
    public sinhVien getbyindex(int viTri);
    public void setlist(ArrayList<sinhVien> sv);
}
