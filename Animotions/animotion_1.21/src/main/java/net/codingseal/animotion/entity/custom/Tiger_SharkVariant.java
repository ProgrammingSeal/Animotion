package net.codingseal.animotion.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum Tiger_SharkVariant {
    DEFAULT(0),
    VARIANT_1(1);

    private static final Tiger_SharkVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(Tiger_SharkVariant::getId)).toArray(Tiger_SharkVariant[]::new);
    private final int id;
    Tiger_SharkVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static Tiger_SharkVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
