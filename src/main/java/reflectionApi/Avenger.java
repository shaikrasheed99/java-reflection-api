package reflectionApi;

public class Avenger {
    private final String name;
    private final int age;

    public Avenger(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void thisIsPublicMethod() {
        System.out.println("This is the public method of Avenger!!");
    }

    private void thisIsPrivateMethod() {
        System.out.println("This is the private method of Avenger!!");
    }

    private static void thisIsStaticMethod() {
        System.out.println("This is the private static method of Avenger!!");
    }
}
