/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package titv55;


import java.util.Arrays;

public class Test2 {
	public static void main(String[] args) {
		SinhVien sv1 =new SinhVien(150, "Tran Van Thanh", "Lop 1", 9);
		SinhVien sv2 =new SinhVien(100, "Nguyen Thi Thanh Hoa", "Lop 2", 8);
		SinhVien sv3 =new SinhVien(199, "Nguyen Van An", "Lop 2", 8);
		SinhVien sv4 =new SinhVien(199, "Nguyen Van Binh", "Lop 2", 8);
		SinhVien[] a_sv = new SinhVien[]{sv1, sv2, sv3};
		
		System.out.println("Ban đầu: "+Arrays.toString(a_sv));
		
		// Hàm sắp xếp
		Arrays.sort(a_sv);
		System.out.println("Sau khi sắp xếp: "+Arrays.toString(a_sv));
		
		
		// Tìm kiếm
		System.out.println("Tìm kiếm An: "+ Arrays.binarySearch(a_sv, sv1));
		System.out.println("Tìm kiếm Binh: "+ Arrays.binarySearch(a_sv, sv4));
	}
}