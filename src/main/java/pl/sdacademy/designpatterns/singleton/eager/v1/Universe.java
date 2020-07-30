package pl.sdacademy.designpatterns.singleton.eager.v1;

public enum Universe {
    INSTANCE;

    private long age = 1234564564644L;

    public long getAge() {
        return age;
    }

    public void setAge(long age) {
        this.age = age;
    }
}
