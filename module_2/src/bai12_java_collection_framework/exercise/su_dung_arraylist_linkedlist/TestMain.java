package bai12_java_collection_framework.exercise.su_dung_arraylist_linkedlist;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        ProductManager manager = new ProductManager();
        boolean flag = true;
        while (flag) {
            System.out.println("List of selection\n" +
                    "1. Add \n" +
                    "2. Display \n" +
                    "3. Delete \n" +
                    "4. Edit \n" +
                    "5. Search \n" +
                    "6. Sort Up \n" +
                    "7 Sort Down \n" +
                    "8. Exit \n");
            System.out.println("Nhập lựa chọn");
            int selection = Integer.parseInt(scr.nextLine());
            switch (selection) {
                case 1:
                    ProductManager.addProducts();
                    ProductManager.showList();
                    break;
                case 2:
                    ProductManager.showList();
                    ProductManager.showList();
                    break;
                case 3:
                    ProductManager.deleteProducts();
                    ProductManager.showList();
                    break;
                case 4:
                    manager.editProduct();
                    ProductManager.showList();
                    break;
                case 5:
                    ProductManager.searchProducts();
                    ProductManager.showList();
                    break;
                case 6:
                    manager.sortUp();
                    ProductManager.showList();
                    break;
                case 7:
                    manager.sortDown();
                    ProductManager.showList();
                    break;
                case 8:
                    flag = false;
                    break;
            }
        }
    }
}
