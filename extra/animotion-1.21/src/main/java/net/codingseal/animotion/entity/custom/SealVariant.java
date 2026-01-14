package net.codingseal.animotion.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum SealVariant {
    DEFAULT(0),
    VARIANT_1(1);

    private static final SealVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(SealVariant::getId)).toArray(SealVariant[]::new);
    private final int id;
    SealVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static SealVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
