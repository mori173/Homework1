package cn.edu.jnu.x2020101367;

public class Game {
    private int score = 0; //初始化分数为0
    public void roll(int pins){
        score +=pins;
    }

    public int score() {
        return score;
    }
}
