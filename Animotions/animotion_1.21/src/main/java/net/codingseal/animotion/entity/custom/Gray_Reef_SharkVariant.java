package net.codingseal.animotion.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum Gray_Reef_SharkVariant {
    DEFAULT(0),
    VARIANT_1(1);

    private static final Gray_Reef_SharkVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(Gray_Reef_SharkVariant::getId)).toArray(Gray_Reef_SharkVariant[]::new);
    private final int id;
    Gray_Reef_SharkVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static Gray_Reef_SharkVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
