package Stepanov.homework;

public class Calculator {
    private final SumProcessor sumProcessor;
    private final SubtractProcessor subtractProcessor;
    private final DivideProcessor divideProcessor;
    private final MultiplyProcessor multiplyProcessor;

    public Calculator(SumProcessor sumProcessor, SubtractProcessor subtractProcessor, DivideProcessor divideProcessor, MultiplyProcessor multiplyProcessor) {
        this.sumProcessor = sumProcessor;
        this.subtractProcessor = subtractProcessor;
        this.divideProcessor = divideProcessor;
        this.multiplyProcessor = multiplyProcessor;
    }

    public double sum(double arg1, double arg2) {
        return sumProcessor.process(arg1, arg2);
    }

    public double subtract(double arg1, double arg2) {
        return subtractProcessor.process(arg1, arg2);
    }

    public double divide(double arg1, double arg2) {
        return divideProcessor.process(arg1, arg2);
    }

    public double multiply(double arg1, double arg2) {
        return multiplyProcessor.process(arg1, arg2);
    }

}
