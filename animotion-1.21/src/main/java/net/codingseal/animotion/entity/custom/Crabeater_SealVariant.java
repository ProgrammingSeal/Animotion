package net.codingseal.animotion.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum Crabeater_SealVariant {
    DEFAULT(0),
    VARIANT_1(1);

    private static final Crabeater_SealVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(Crabeater_SealVariant::getId)).toArray(Crabeater_SealVariant[]::new);
    private final int id;
    Crabeater_SealVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static Crabeater_SealVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
