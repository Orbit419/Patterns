package Patterns.FactoryMethod;

public class BuilderPattern implements Pattern {
    @Override
    public String getPatternName() {
        return "I am Builder pattern!";
    }

    public static BuilderPattern getInstance() {
        return new BuilderPattern();
    }
}
