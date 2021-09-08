package bai5_access_modifier_static_menthod_static_property.exercise.AccessModifier;

import bai5_access_modifier_static_menthod_static_property.exercise.AccessModifier.AccessModifier;

public class TestAccessModifier {
    public static void main(String[] args) {
        AccessModifier ac = new AccessModifier(4.0);
        System.out.println(ac.getArea());
        System.out.println(ac.getRadius());;

    }
}
