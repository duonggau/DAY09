package com.example.day09.main;
import com.example.day09.dao.EmployeeDAOIMPL;
import com.example.day09.entity.Employee;

import java.math.BigDecimal;
import java.util.List;
import java.util.Scanner;
public class testDeleteEmployee {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sản phẩm cần xóa: ");
        BigDecimal Maspofdelete = sc.nextBigDecimal();
        boolean flagtodelete = new EmployeeDAOIMPL().deleteEmployee(Maspofdelete);
        if (flagtodelete == true ) System.out.println("Đã xóa sản phẩm thành công! ");
        else System.out.println("Sảy ra lỗi xóa sản phẩm! ");
    }
}
