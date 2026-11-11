package nguyenanhkiet25748841;

import java.time.LocalDate;

public class SinhVien {
	protected String maSV;
	protected String hoTen;
	protected LocalDate ngaySinh;
	protected String lop;
	protected int soTinChi;
	protected MonHoc monHoc;
	
	public SinhVien(String maSV, String hoTen, LocalDate ngaySinh, String lop, int soTinChi, MonHoc monHoc) {
		super();
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.lop = lop;
		this.soTinChi = soTinChi;
		this.monHoc = monHoc;
	}
	
	public double thanhTien() {
	    return soTinChi * monHoc.getDonGia();
	}

	public String getLoai() { return "Sinh viên"; }

	public String getThongTinRieng() { return ""; }

	public String getMaSV() {
		return maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public LocalDate getNgaySinh() {
		return ngaySinh;
	}

	public String getLop() {
		return lop;
	}

	public int getSoTinChi() {
		return soTinChi;
	}

	public MonHoc getMonHoc() {
		return monHoc;
	}
	
	public float getDonGia() {
		return monHoc.getDonGia();
	}
	
	public String getTenMonHoc() {
		return monHoc.getTenMon();
	}

	@Override
	public String toString() {
		String thongTin = getThongTinRieng();
		if (thongTin == null || thongTin.trim().isEmpty()) {
			thongTin = "-";
		} else {
			thongTin = thongTin.replace("Học trực tiếp tại: ", "")
							   .replace("Hoc online qua: ", "");
		}
		
		return String.format("| %10s | %-30s | %-20s | %-20s | %-20s | %-5d | %-10.2f | %-10.2f | %-20s |",
				getMaSV(),
				getHoTen(),
				getLop(),
				getNgaySinh(),
				monHoc.getTenMon(),
				getSoTinChi(),
				monHoc.getDonGia(),
				thanhTien(),
				thongTin);
	}
	
	public void inTieuDe() {
		System.out.printf("| %10s | %-30s | %-20s | %-20s | %-20s | %-5s | %-10s | %-10s | %-20s |%n",
				"Ma SV",
				"Ho ten SV",
				"Lop",
				"Ngay sinh",
				"Ten mon",
				"So TC",
				"Don gia",
				"Thanh tien",
				"Co so / Nen tang");
		System.out.println("-".repeat(173));
	}
	
	public void inThongTin() {
		System.out.println(this);
	}
}