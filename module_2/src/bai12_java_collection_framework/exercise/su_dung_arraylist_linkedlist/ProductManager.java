package bai12_java_collection_framework.exercise.su_dung_arraylist_linkedlist;

import java.util.*;

public class ProductManager {
    private static ArrayList<Product> products = new ArrayList<>();

    static {
        Product products1 = new Product(2, "xe đạp thể thao", 1200000);
        Product products2 = new Product(1, "xe đạp mini", 700000);
        Product products3 = new Product(3, "xe đạp địa hình", 34000000);
        Product products4 = new Product(4, "xe đạp điện", 13000000);

        products.add(products1);
        products.add(products2);
        products.add(products3);
        products.add(products4);

    }

    public static void addProducts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter price");
        int price = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter name");
        String name = scanner.nextLine();
        Product product = new Product(id, name, price);
        products.add(product);

    }

    public static void showList() {
        for (int i = 0; i < products.size(); i++) {
            System.out.println(products.get(i));
        }
    }

    public static void deleteProducts() {
        showList();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter deleted id");
        int id = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId() == id) {
                products.remove(i);
            }
        }
    }

    public void editProduct() {
        showList();
        System.out.println("nhập vào id của sản phẩm cần edit");
        Scanner sc = new Scanner(System.in);
        int chooseId = sc.nextInt();
        System.out.println("nhập vào tên sản phẩm cần sưa");
        products.get(chooseId - 1).setName(sc.nextLine());
        System.out.println("nhập vào giá sản phẩm ");
        products.get(chooseId - 1).setPrice(sc.nextFloat());
        showList();
    }

    public static void searchProducts() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name your want to search");
        String name = scanner.nextLine();
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getName().equals(name)) {
                System.out.println(products.get(i));
            }
        }
    }

    public void sortUp() {
        Collections.sort(products, new SortProductPrice());
    }

    public void sortDown() {
        Collections.sort(products, new SortProductsPrice1());
    }
}








