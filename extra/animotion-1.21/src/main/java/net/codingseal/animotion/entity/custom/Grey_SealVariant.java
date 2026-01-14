package net.codingseal.animotion.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum Grey_SealVariant {
    DEFAULT(0),
    VARIANT_1(1);

    private static final Grey_SealVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(Grey_SealVariant::getId)).toArray(Grey_SealVariant[]::new);
    private final int id;
    Grey_SealVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static Grey_SealVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
