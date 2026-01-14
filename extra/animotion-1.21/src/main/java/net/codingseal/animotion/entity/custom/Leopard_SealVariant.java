package net.codingseal.animotion.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum Leopard_SealVariant {
    DEFAULT(0),
    VARIANT_1(1);

    private static final Leopard_SealVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(Leopard_SealVariant::getId)).toArray(Leopard_SealVariant[]::new);
    private final int id;
    Leopard_SealVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static Leopard_SealVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }

}
