package net.codingseal.animotion.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum Harp_SealVariant {
    DEFAULT(0),
    VARIANT_1(1);

    private static final Harp_SealVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(Harp_SealVariant::getId)).toArray(Harp_SealVariant[]::new);
    private final int id;
    Harp_SealVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static Harp_SealVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
