package it.lab.repository;

import it.lab.entity.HoaDon;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
//<<<<<<< HEAD
//=======


//>>>>>>> 5ad972f747640f3c31d571298a4c39876fecc404
import org.springframework.data.repository.query.Param;


import java.math.BigDecimal;
//<<<<<<< HEAD
import java.sql.Date;
import java.time.LocalDate;
import java.time.LocalDateTime;
//=======
import java.time.LocalDate;
//>>>>>>> 5ad972f747640f3c31d571298a4c39876fecc404
import java.util.List;

public interface ThongKeRepository extends JpaRepository<HoaDon,Integer> {
    @Query("SELECT u.email, SUM(h.giaTriHd) AS tongDoanhThu " +
            "FROM HoaDon h " +
            "JOIN h.nguoiMua u " +
            "GROUP BY u.email " +
            "ORDER BY tongDoanhThu DESC")
    List<Object[]> taiKhoanDoanhThuCaoNhat(Pageable pageable);


    @Query("SELECT u.email, SUM(h.giaTriHd) AS tongDoanhThu " +
            "FROM HoaDon h " +
            "JOIN h.nguoiMua u " +
            "GROUP BY u.email " +
            "ORDER BY tongDoanhThu ASC")
    List<Object[]> taiKhoanDoanhThuThap(Pageable pageable);


//<<<<<<< HEAD
//=======

//>>>>>>> 5ad972f747640f3c31d571298a4c39876fecc404
//thong ve những thành phố mua sản phẩm nhiều nhất
@Query("SELECT h.diaChiGiao.tinh, COUNT(h.id) AS TotalPurchases " +
        "FROM HoaDon h " +
        "JOIN h.diaChiGiao d " +
        "GROUP BY h.diaChiGiao.tinh " +
        "ORDER BY TotalPurchases DESC")
List<Object[]> ThongKeThanhPhoMuaNhieu();

//thong ke ve doanh thu theo ngay
@Query("SELECT SUM(h.giaTriHd) FROM HoaDon h " +
            "WHERE FUNCTION('DAY', h.ngayTao) = FUNCTION('DAY', :selectedDate) " +   // Lấy theo ngày được chọn từ input
            "AND FUNCTION('MONTH', h.ngayTao) = FUNCTION('MONTH', :selectedDate) " + // Lấy theo tháng được chọn từ input
            "AND FUNCTION('YEAR', h.ngayTao) = FUNCTION('YEAR', :selectedDate) ")
    BigDecimal tinhTongDoanhThuTrongNgay(@Param("selectedDate") LocalDate selectedDate);


//<<<<<<< HEAD
//thong doanh thu 1 thang

    @Query("SELECT SUM(h.giaTriHd) FROM HoaDon h " +
            "WHERE FUNCTION('YEAR', h.ngayTao) = FUNCTION('YEAR', :selectedDate) " +
            "AND FUNCTION('MONTH', h.ngayTao) = FUNCTION('MONTH', :selectedDate) ")
    BigDecimal tinhTongDoanhThuTrongThang(@Param("selectedDate") Date selectedDate);


    //thong ke 1 năm

    @Query("SELECT SUM(h.giaTriHd) FROM HoaDon h " +
            "WHERE FUNCTION('YEAR', h.ngayTao) = FUNCTION('YEAR', :selectedDate) "
    )
    BigDecimal tinhTongDoanhThuTrongNam(@Param("selectedDate") Date selectedDate);


    //thong ke doanh thu theo khoang ngay
    @Query("SELECT SUM(h.giaTriHd) FROM HoaDon h " +
            "WHERE h.ngayTao >= :selectedDateStart and h.ngayTao <= :selectedDateEnd")
    BigDecimal tinhTongDoanhThuTrongKhoangNgay(@Param("selectedDateStart") LocalDate selectedDateStart,
                                               @Param("selectedDateEnd") LocalDate selectedDateEnd);

//thong ke doanh thu cua 12 thang bang bieu do
@Query("SELECT SUM(h.giaTriHd) FROM HoaDon h " +
        "WHERE FUNCTION('YEAR', h.ngayTao) = :year " +
        "AND FUNCTION('MONTH', h.ngayTao) = :month")
BigDecimal tinhTongDoanhThuTrongThangChar(@Param("year") int year, @Param("month") int month);
//=======
//
//>>>>>>> 5ad972f747640f3c31d571298a4c39876fecc404

}
