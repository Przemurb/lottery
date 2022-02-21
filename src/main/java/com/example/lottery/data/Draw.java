package com.example.lottery.data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Draw {
    public static final int RANGE = 49;
    public static final int DRAW_NUMBERS = 6;
    private final List<Integer> drawnNumbers = draw();

    private List<Integer> draw() {
        List<Integer> table = new ArrayList<>(Draw.RANGE);
        for (int i = 0; i < RANGE; i++) {
            table.add(i + 1);
        }
        Collections.shuffle(table);
        table = table.stream().limit(DRAW_NUMBERS).toList();
        return table;
    }

    public List<Integer> getDrawnNumbers() {
        return drawnNumbers;
    }
}
