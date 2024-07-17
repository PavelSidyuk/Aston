package Lesson1;

import java.lang.reflect.Field;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {


        Human human = new Human();

        human.setAge(15);
        System.out.println(human.getAge());
        human.setAge(121);
        System.out.println(human.getAge());

        Field field = human.getClass().getDeclaredField("age");
        field.setAccessible(true);
        field.set(human,-1);
        System.out.println(human.getAge());//
        field.set(human,-121);
        System.out.println(human.getAge());//
    }
}
