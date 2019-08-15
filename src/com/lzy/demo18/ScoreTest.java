package com.lzy.demo18;

import lombok.Getter;

import lombok.ToString;

import java.util.Comparator;

public class ScoreTest {


}

@Getter
@ToString
class Score implements Comparator<Score> {
    private double mScore;
    private double eScore;
    private double cScore;


    @Override
    public int compare(Score o1, Score o2) {
        return o1.mScore == o2.mScore ? o1.eScore > o2.eScore ? 1 : -1 : o1.mScore > o2.mScore ? 1 : -1;
    }
}
