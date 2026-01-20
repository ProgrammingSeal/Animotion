package net.codingseal.animotion.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum PenguinVariant {
    DEFAULT(0),
    VARIANT_1(1);

    private static final PenguinVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(PenguinVariant::getId)).toArray(PenguinVariant[]::new);
    private final int id;
    PenguinVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static PenguinVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }

}
