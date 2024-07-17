package Lesson1;

public class Human {
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if(age < 0 || age > 120){
            return;
        }
        this.age = age;
    }
}
