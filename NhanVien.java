package CafeShop;

import java.util.Scanner;

public class NhanVien extends ThongTinNhanVien {
	String email, instagram;
	Scanner scan = new Scanner(System.in);

	public NhanVien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public NhanVien(String hoTen, String cMND, String ngaySinh, String queQuan, float luongCoBan) {
		super(hoTen, cMND, ngaySinh, queQuan, luongCoBan);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void NhapThongTinNhanVien() {
		// TODO Auto-generated method stub
		super.NhapThongTinNhanVien();
		System.out.println("Nhập email nhân viên: ");

		while (true) {
			String email = scan.nextLine();
			if (setEmail(email)) {
				break;
			}
			System.out.println(
					"Email của bạn có thể thiếu ký tự @ , đuôi com hoặc bạn đang để khoảng trống. Vui lòng nhập lại");
		}

		System.out.println("Nhập link tài khoản Instagram nhân viên: ");

		while (true) {
			String instagram = scan.nextLine();
			if (setInstagram(instagram)) {
				break;
			}
			System.out.println(
					"Link tài khoản instagram phải có ký tự @ phía trước và không có khoảng trắng. Vui lòng nhập lại");
		}
	}

	@Override
	public void HienThiThongTinNhanVien() {
		// TODO Auto-generated method stub
		super.HienThiThongTinNhanVien();
	}

	public String getEmail() {
		return email;
	}

	public boolean setEmail(String email) {
		if (email.contains("@") && !email.contains(" ") && email.contains("gmail.com")) {
			this.email = email;
			return true;
		} else {
			return false;
		}
	}

	public String getInstagram() {
		return instagram;
	}

	public boolean setInstagram(String instagram) {
		if (instagram.contains("@") && !instagram.contains(" ")) {
			this.instagram = instagram;
			return true;
		} else {
			return false;
		}
	}

}
