package a_regist.b_annotation.componet;

public class Developer {

    private final String name;

    public Developer(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Development{" +
            "name='" + name + '\'' +
            '}';
    }
}
