package net.codingseal.animotion.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum Baikal_SealVariant {
    DEFAULT(0),
    VARIANT_1(1);

    private static final Baikal_SealVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(Baikal_SealVariant::getId)).toArray(Baikal_SealVariant[]::new);
    private final int id;
    Baikal_SealVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static Baikal_SealVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }

}
