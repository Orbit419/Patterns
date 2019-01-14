package Patterns.FactoryMethod;

public class UserClass {
    private String name;
    private int age;
    private boolean isAlive;

    public UserClass(String name, int age, boolean isAlive) {
        this.name = name;
        this.age = age;
        this.isAlive = isAlive;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "UserClass{" +
                "name='" + name + '\'' +
                '}';
    }

    public static class Builder {
        private String name;
        private int age;
        private boolean isAlive;

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public Builder setAlive(boolean alive) {
            isAlive = alive;
            return this;
        }

        public UserClass build() {
            return new UserClass(name, age, isAlive);
        }
    }
}
