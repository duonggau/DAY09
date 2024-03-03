package com.example.day09.main;

import com.example.day09.dao.ProductDAOIMPL;
import com.example.day09.entity.Product;

import java.util.List;
import java.util.Scanner;
public class testProductSelect {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Product> list = new ProductDAOIMPL().getAllProduct();
        if (list == null)
            return;
        for (Product item : list){
            System.out.println("Mã Sản phẩm  "+item.getMaSP()
                    +"Tên Sản phẩm "+item.getTenSanPham()
                    +"Số Lượng "+item.getSoLuong()
                    +"Đơn giá"+item.getDonGia());
        }
        System.out.print("Nhập mã sản phẩm : ");
        String maSP = sc.next();
        Product product = new ProductDAOIMPL().getProductById(maSP);
        System.out.println("Mã Sản phẩm  "+product.getMaSP()
                +"Tên Sản phẩm "+product.getTenSanPham()
                +"Số Lượng "+product.getSoLuong()
                +"Đơn giá"+product.getDonGia());
    }
}
