package bai17_binary_file_serialization.exercise.quanlifilenhiphan;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListSanPham {
    public static  List<SanPham> sanPhams = new ArrayList<>();
    public static   File file = new File("D:\\C0721G2--L-V-N-LANH\\module_2\\src\\bai17_binary_file_serialization\\exercise\\quanlifilenhiphan\\file_san_pham");
    public static void writeToObject(File file, List<SanPham> sanPhams) {
        try {
            FileOutputStream ghi = new FileOutputStream(file);
            ObjectOutputStream nhap = new ObjectOutputStream(ghi);
            nhap.writeObject(sanPhams);
            ghi.close();
            nhap.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void add() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập vào mã sản phẩm :");
        String maShanPham = scanner.nextLine();
        System.out.println("nhập vào tên sản phầm :");
        String tenSanPham = scanner.nextLine();
        System.out.println("nhập vào hãng sản xuất :");
        String hangSanXuat = scanner.nextLine();
        System.out.println("nhập vào giá : ");
        double gia = scanner.nextDouble();
        SanPham sanPham = new SanPham(maShanPham,tenSanPham,hangSanXuat,gia);
        if(file.length() > 0){sanPhams = readDataFromFile(file);}
        sanPhams.add(sanPham);
        writeToObject(file,sanPhams);
    }
   public void display(){
       for ( SanPham shanphams : sanPhams) {
           System.out.println(shanphams);
       }
   }
   public void search (String maShanPham){

       List<SanPham> sanPhams = readDataFromFile(file);
       for ( SanPham sanPham : sanPhams) {
           if(sanPham.getTenSanPham().equals(maShanPham)){
           System.out.println(" sản phẩm" + sanPham);
           }
       }
       }

    public static List<SanPham> readDataFromFile(File file) {
        List<SanPham> sanPhams = new ArrayList<>();

        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);
            sanPhams = (List<SanPham>) objectInputStream.readObject();
            objectInputStream.close();
            fileInputStream.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return sanPhams;
    }
}
