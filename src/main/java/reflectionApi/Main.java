package reflectionApi;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {
        Avenger thor = new Avenger("Thor", 120);

        System.out.println("List of fileds in Avenger class");
        Field[] fields = thor.getClass().getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName());
        }
        System.out.println();

        System.out.println("List of constructors in Avenger class");
        Constructor<?>[] constructors = thor.getClass().getDeclaredConstructors();
        for (Constructor<?> constructor : constructors) {
            System.out.println(constructor.getName());
        }
        System.out.println();

        System.out.println("List of methods in Avenger class");
        Method[] methods = thor.getClass().getDeclaredMethods();
        for (Method method : methods) {
            System.out.println(method.getName());
        }
        System.out.println();

        System.out.println("Updating the name of thor to thanos");
        Field name = thor.getClass().getDeclaredField("name");
        name.setAccessible(true);
        name.set(thor, "Thanos");
        System.out.println("Updated name of the thor is, " + thor.getName());
        System.out.println();

        System.out.println("Accessing the public method in Avenger class");
        Method thisIsPublicMethod = thor.getClass().getDeclaredMethod("thisIsPublicMethod");
        thisIsPublicMethod.setAccessible(true);
        thisIsPublicMethod.invoke(thor);
        System.out.println();

        System.out.println("Accessing the private method in Avenger class");
        Method thisIsPrivateMethod = thor.getClass().getDeclaredMethod("thisIsPrivateMethod");
        thisIsPrivateMethod.setAccessible(true);
        thisIsPrivateMethod.invoke(thor);
        System.out.println();

        System.out.println("Accessing the private static method in Avenger class");
        Method thisIsStaticMethod = thor.getClass().getDeclaredMethod("thisIsStaticMethod");
        thisIsStaticMethod.setAccessible(true);
        thisIsStaticMethod.invoke(thor);
        System.out.println();
    }
}