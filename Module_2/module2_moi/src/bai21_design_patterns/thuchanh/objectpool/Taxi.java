package bai21_design_patterns.thuchanh.objectpool;

public class Taxi {
    private String name;

    public Taxi() {
    }

    public Taxi(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "name='" + name + '\'' +
                '}';
    }
}
