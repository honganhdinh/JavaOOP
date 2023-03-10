package CafeShop;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class HeThongDieuHanhNhanVien extends NhanVien {
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		ArrayList<NhanVien> nhanvienList = new ArrayList<>();
		int choose;

		do {
			Menu();

			System.out.println("Nhập tác vụ muốn thực thi");
			choose = Integer.parseInt(scan.nextLine());

			switch (choose) {
			case 1:
				NhapThongTin(nhanvienList);
				break;
			case 2:
				HienThiThongTin(nhanvienList);
				break;
			case 3:
				HienThiThongTinLuong(nhanvienList);
				break;
			case 4:
				TimKiem(nhanvienList);
				break;
			case 5:
				SapXep(nhanvienList);
				break;
			case 6:
				System.out.println("Thoát thành công");
				break;
			}

		} while (choose != 6);

	}

	private static void NhapThongTin(ArrayList<NhanVien> nhanvienList) {
		// TODO Auto-generated method stub
		System.out.println("Nhập số lượng nhân viên cần nhập: ");
		int n = Integer.parseInt(scan.nextLine());

		for (int i = 0; i < n; i++) {
			NhanVien nhanvien = new NhanVien();
			nhanvien.NhapThongTinNhanVien();
			// Thêm số lượng nhân viên vừa nhập vào List

			nhanvienList.add(nhanvien);
		}
	}

	private static void HienThiThongTin(ArrayList<NhanVien> nhanvienList) {
		// TODO Auto-generated method stub
		for (NhanVien nhanvien : nhanvienList) {
			nhanvien.HienThiThongTinNhanVien();
		}
	}

	private static void HienThiThongTinLuong(ArrayList<NhanVien> nhanvienList) {
		// TODO Auto-generated method stub
		Collections.sort(nhanvienList, new Comparator<NhanVien>() {

			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				if (o1.getLuongCoBan() < o2.getLuongCoBan()) {
					return 1;
				}
				return -1;
			}
		});
		System.out.println("Nhân viên có mức lương cao nhất là: ");
		nhanvienList.get(0).HienThiThongTinNhanVien();

		System.out.println("Nhân viên có mức lương thấp nhất là: ");
		nhanvienList.get(nhanvienList.size() - 1).HienThiThongTinNhanVien();
	}

	private static void TimKiem(ArrayList<NhanVien> nhanvienList) {
		// TODO Auto-generated method stub
		System.out.println("Nhập thông tin instagram cần tìm: ");
		String searchInstagram = scan.nextLine();
		boolean isFind = false;

		for (NhanVien nhanvien : nhanvienList) {
			if (nhanvien.getInstagram().equalsIgnoreCase(searchInstagram)) {
				isFind = true;
				nhanvien.HienThiThongTinNhanVien();
				break;
			}
			if (!isFind) {
				System.out.println("Thông tin không hợp lệ");
			}
		}
	}

	private static void SapXep(ArrayList<NhanVien> nhanvienList) {
		// TODO Auto-generated method stub
		Collections.sort(nhanvienList, new Comparator<NhanVien>() {
			@Override
			public int compare(NhanVien o1, NhanVien o2) {
				// TODO Auto-generated method stub
				return o1.getHoTen().compareToIgnoreCase(o2.getHoTen());
			}
		});
		HienThiThongTin(nhanvienList);
	}

	static public void Menu() {
		System.out.println("1. Nhập thông tin nhân viên");
		System.out.println("2. Hiển thị thông tin tất cả các nhân viên ra màn hình");
		System.out.println("3. Hiển thị nhân viên có lương cao nhất và thấp nhất");
		System.out.println("4. Tìm kiếm sinh viên theo instagram");
		System.out.println("5. Hiển thị tất cả các nhân viên theo thứ tự tên trong bảng chữ cái (A-Z)");
		System.out.println("6. Thoát");
	}
}
