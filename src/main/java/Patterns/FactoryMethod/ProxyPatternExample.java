package Patterns.FactoryMethod;

public class ProxyPatternExample implements PatternExample {
    @Override
    public Pattern makePattern() {
        return ProxyPattern.getInstance();
    }
}
