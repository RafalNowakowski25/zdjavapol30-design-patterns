package pl.sdacademy.designpatterns.singleton.eager.v1.v2;

public class Universe {

    public final static Universe INSTANCE = new Universe();

    private Universe() {}

    private long age = 12313434354L;

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}
