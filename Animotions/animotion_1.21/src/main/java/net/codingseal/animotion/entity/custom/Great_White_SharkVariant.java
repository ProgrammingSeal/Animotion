package net.codingseal.animotion.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum Great_White_SharkVariant {
    DEFAULT(0),
    VARIANT_1(1);

    private static final Great_White_SharkVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(Great_White_SharkVariant::getId)).toArray(Great_White_SharkVariant[]::new);
    private final int id;
    Great_White_SharkVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static Great_White_SharkVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
