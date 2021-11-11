package bai21_design_patterns.thuchanh.objectpool;

public class TaxiNotFoundException extends RuntimeException {

    public TaxiNotFoundException(String message) {
        System.out.println(message);
    }
}
