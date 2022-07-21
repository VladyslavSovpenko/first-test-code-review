package core.basesyntax;

import java.util.Random;

public class Lottery extends ColorSupplier {
    public Ball getRandomBall() {

        Ball ball = new Ball();

        ball.setBallColor(ColorSupplier.getRandomColor());

        ball.setBallNumber(new Random().nextInt(100));

        return ball;
    }
}
