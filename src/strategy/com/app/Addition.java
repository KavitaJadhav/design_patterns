package strategy.com.app;

public class Addition implements Strategy{
    @Override
    public int execute(int num1, int num2) {
        return num1 + num2;
    }
}
