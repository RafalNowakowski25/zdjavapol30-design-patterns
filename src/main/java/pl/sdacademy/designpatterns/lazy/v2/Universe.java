package pl.sdacademy.designpatterns.lazy.v2;

public class Universe {
    private static Universe instance;

    public  static Universe getInstance() {
        if (instance == null) {
            synchronized (Universe.class) {
                if (instance == null) {
                    instance = new Universe();
                }
            }
        }
        return instance;
    }

    private Universe() {
    }

    private long age = 12313434354L;

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}
