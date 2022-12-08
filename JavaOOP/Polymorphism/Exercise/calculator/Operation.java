package JavaAdvance.JavaOOP.Polymorphism.Exercise.calculator;

public interface Operation {
    void addOperand(int operand);
    int getResult();
    boolean isCompleted();
}