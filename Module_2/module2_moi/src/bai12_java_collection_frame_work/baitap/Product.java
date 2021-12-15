package bai12_java_collection_frame_work.baitap;

public class Product implements Comparable<Product> {
    private int maSanPham;
    private double giaSanPham;
    private String tenSanPham;

    public Product(int maSanPham, double giaSanPham, String tenSanPham) {
        this.maSanPham = maSanPham;
        this.giaSanPham = giaSanPham;
        this.tenSanPham = tenSanPham;
    }

    public int getMaSanPham() {
        return maSanPham;
    }

    public void setMaSanPham(int maSanPham) {
        this.maSanPham = maSanPham;
    }

    public double getGiaSanPham() {
        return giaSanPham;
    }

    public void setGiaSanPham(double giaSanPham) {
        this.giaSanPham = giaSanPham;
    }

    public String getTenSanPham() {
        return tenSanPham;
    }

    public void setTenSanPham(String tenSanPham) {
        this.tenSanPham = tenSanPham;
    }

    @Override
    public String toString() {
        return "Product{" +
                "maSanPham=" + maSanPham +
                ", giaSanPham=" + giaSanPham +
                ", tenSanPham='" + tenSanPham + '\'' +
                '}';
    }

    public String thongTinProduct() {
        return maSanPham + "," + giaSanPham + "," + tenSanPham;
    }

    @Override
    public int compareTo(Product o) {

        if(this.getGiaSanPham() > o.getGiaSanPham()){
            return 1;
        }else if(this.getGiaSanPham() < o.getGiaSanPham()){
            return -1;
        }else {
            return 0;
        }
    }
}
