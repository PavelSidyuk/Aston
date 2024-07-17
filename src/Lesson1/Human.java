package Lesson1;

public class Human {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >0 && age < 120) {
            this.age = age;
        } else {
            System.out.println("Введен некорректный возраст");
        }
    }
}
