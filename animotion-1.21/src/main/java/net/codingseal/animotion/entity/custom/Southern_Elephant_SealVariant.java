package net.codingseal.animotion.entity.custom;

import java.util.Arrays;
import java.util.Comparator;

public enum Southern_Elephant_SealVariant {
    DEFAULT(0),
    VARIANT_1(1);

    private static final Southern_Elephant_SealVariant[] BY_ID = Arrays.stream(values()).sorted(Comparator.
            comparingInt(Southern_Elephant_SealVariant::getId)).toArray(Southern_Elephant_SealVariant[]::new);
    private final int id;
    Southern_Elephant_SealVariant(int id) {
        this.id = id;
    }

    public int getId() {
        return this.id;
    }

    public static Southern_Elephant_SealVariant byId(int id) {
        return BY_ID[id % BY_ID.length];
    }
}
