package casetudy_module2.models;

public class Room extends Facility {
    private String dichVuFreeDiKem;



    public Room(String nameDv,String maDichVu, double dienTichSuDung, double chiPhiThue, int soluongNguoi, String kieuThue, String dichVuFreeDiKem) {
        super(nameDv,maDichVu, dienTichSuDung, chiPhiThue, soluongNguoi, kieuThue);
        this.dichVuFreeDiKem = dichVuFreeDiKem;
    }

    public String getDichVuFreeDiKem() {
        return dichVuFreeDiKem;
    }

    public void setDichVuFreeDiKem(String dichVuFreeDiKem) {
        this.dichVuFreeDiKem = dichVuFreeDiKem;
    }
}