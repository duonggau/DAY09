package com.example.day09.main;

import com.example.day09.dao.ProductDAOIMPL;

import java.util.Scanner;

public class testDeleteProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        String Maspofdelete = sc.next();
        boolean flagtodelete = new ProductDAOIMPL().DeleteProduct(Maspofdelete);
        if (flagtodelete == true ) System.out.println("Đã xóa sản phẩm thành công! ");
        else System.out.println("Sảy ra lỗi xóa sản phẩm! ");
    }
}
