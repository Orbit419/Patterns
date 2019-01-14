package Patterns;

import Patterns.AbstractFactory.AbstractFactory;
import Patterns.FactoryMethod.BuilderPatternExample;
import Patterns.FactoryMethod.Pattern;
import Patterns.FactoryMethod.PatternExample;
import Patterns.FactoryMethod.ProxyPatternExample;
import Patterns.FactoryMethod.SingletonPatternExample;

public class Main {
    public static void main(String[] args) {
        PatternExample builderPatternExample = new BuilderPatternExample();
        PatternExample proxyPatternExample = new ProxyPatternExample();
        PatternExample singletonPatternExample = new SingletonPatternExample();

        Pattern builder = builderPatternExample.makePattern();
        Pattern proxy = proxyPatternExample.makePattern();
        Pattern singleton = singletonPatternExample.makePattern();

        System.out.println(builder.getPatternName());
        System.out.println(proxy.getPatternName());
        System.out.println(singleton.getPatternName());

        Drawing drawer = new Adapter();
        System.out.println("\nAdapter!");
        drawer.drawLine();

        System.out.println("\n");
        new Flyweight().testFlyweight();

        System.out.println("\n");
        new Prototype().prototypeTest();

        System.out.println("\n");
        new AbstractFactory().testAbstractFabric();
    }
}
