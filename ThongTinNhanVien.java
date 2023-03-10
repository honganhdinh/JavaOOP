package CafeShop;

import java.util.Scanner;

public class ThongTinNhanVien {
	String hoTen, ngaySinh, queQuan;
	String CMND;
	float luongCoBan;

	Scanner scan = new Scanner(System.in);

	public ThongTinNhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ThongTinNhanVien(String hoTen, String cMND, String ngaySinh, String queQuan, float luongCoBan) {
		super();
		this.hoTen = hoTen;
		this.CMND = cMND;
		this.ngaySinh = ngaySinh;
		this.queQuan = queQuan;
		this.luongCoBan = luongCoBan;
	}

	public void NhapThongTinNhanVien() {
		System.out.println("Nhập họ và tên nhân viên: ");
		hoTen = scan.nextLine();

		System.out.println("Nhập số chứng minh nhân dân/ căn cước công dân: ");
		CMND = scan.nextLine();

		System.out.println("Nhập ngày tháng năm sinh nhân viên: ");
		ngaySinh = scan.nextLine();

		System.out.println("Nhập quê quán nhân viên: ");
		queQuan = scan.nextLine();

		System.out.println("Nhập lương cơ bản của nhân viên: ");
		luongCoBan = Float.parseFloat(scan.nextLine());
	}

	public void HienThiThongTinNhanVien() {
		System.out.println("Họ và tên: " + hoTen);
		System.out.println("CMND: " + CMND);
		System.out.println("Ngày sinh: " + ngaySinh);
		System.out.println("Quê quán: " + queQuan);
		System.out.println("Lương cơ bản: " + luongCoBan);
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public String getCMND() {
		return CMND;
	}

	public void setCMND(int cMND) {
		this.CMND = CMND;
	}

	public String getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public String getQueQuan() {
		return queQuan;
	}

	public void setQueQuan(String queQuan) {
		this.queQuan = queQuan;
	}

	public float getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(float luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

}
