package net.codingseal.animotion.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum Hammerhead_SharkVariant {
    DEFAULT(0),
    VARIANT_1(1);

    private static final Hammerhead_SharkVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(Hammerhead_SharkVariant::getId)).toArray(Hammerhead_SharkVariant[]::new);
    private final int id;
    Hammerhead_SharkVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static Hammerhead_SharkVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
