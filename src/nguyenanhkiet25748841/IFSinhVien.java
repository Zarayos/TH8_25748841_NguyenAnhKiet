package nguyenanhkiet25748841;

import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.ToDoubleFunction;

public interface IFSinhVien {

    boolean them(SinhVien sv);
    boolean sua(String maSV, SinhVien svMoi);
    boolean xoa(String maSV);
    boolean xoaTatCa();
    
    List<SinhVien> layTatCa();
    SinhVien timTheoMa(String maSV);
    List<SinhVien> tim(Predicate<SinhVien> dieuKien);
    List<SinhVien> timTheoTen(String tuKhoa);
    List<SinhVien> timTheoLop(String lop);
    List<SinhVien> timTheoLoai(String loai);
    List<SinhVien> timTheoMon(MonHoc monHoc);
    
    int tongSoLuong();          
    double tongThanhTien();    

    List<SinhVien> sapXepTheoTen();
    List<SinhVien> sapXepTheoThanhTienGiamDan();

    <K> Map<K, List<SinhVien>> nhomTheo(Function<SinhVien, K> layKey);
    <K> Map<K, Integer> demTheoNhom(Function<SinhVien, K> layKey);
    <K> Map<K, Double> tongTheoNhom(Function<SinhVien, K> layKey, ToDoubleFunction<SinhVien> layGiaTri);
    <K> Map<K, Double> tongTheoNhom_Having(Function<SinhVien, K> layKey, ToDoubleFunction<SinhVien> layGiaTri, double minTong);
    <K> Map<K, Integer> demTheoNhom_Having(Function<SinhVien, K> layKey, int minSoLuong);
}