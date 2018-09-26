package week2.task3;

public class Task3 {
}

//TODO: khai báo 3 class tương ứng với 3 đối tượng thực tế ở dưới

class Dog {
    private String name;
    private String furColor; //yellow, brown, black, ... //final keyword
    private String gender; //final
    
    public Dog(String name,String furColor, String gender) {
        this.furColor = furColor;
    }
    
    public Dog(Dog d) {
        this.name = d.name;
        this.furColor = d.furColor;
        this.gender = d.gender;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }   
    
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public String getFurColor() {
        return this.furColor;
    }
    
    public void setFurColor(String furColor) {
        this.furColor = furColor;
    }
    
    //Field gender and field furColor are final, can be set only in constructors
    
    public void sayHello() {
        System.out.println("Wolf");
    }
    
    public void run() {
        System.out.println(this.name + " is running");
    }
    public void eat() {
        System.out.println(this.name + "is eating");
    }
}

class Person {
    private String name;
    private String gender;
    private int age;
    
    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGender() {
        return this.gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public int getAge() {
        return this.age;
    }
    
    public void setAge(int age) {
        this.age = age;
    }
    
    public void sayHello() {
        System.out.println("Hello");
    }
    
    public void sleep() {
        System.out.println(this.name + " is sleeping");
    }
    
    
}

class Bike {
    private int price;
    private String branch; //asama
    private boolean broken;
    private final int wheels;
    private int speed;
    private int direction;
    
    public Bike(int price, String branch) {
        this.price = price;
        this.branch = branch;
        wheels = 2;
    }
    
    public int getPrice() {
        return this.price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public String getBranch() {
        return this.branch;
    }
    
    public void setBranch(String branch) {
        this.branch = branch;
    }
    
    public void canBeUsed() {
        if (broken) {
            System.out.println("This bike can be no longer used");
        }
        else {
            System.out.println("You can ride this bike");
        }
    }
    
    /*public void setState(boolean broken) {
        this.broken = broken;
    }*/
    
    public boolean canBeBought(int price) {
        return (this.price > price);
    }
    
    public void turnLeft() {
        System.out.println("Turning left");
        direction = 1;
    }
    
    public void turnRight() {
        System.out.println("Turning right");
        direction = 2;
    }
    
    public void brake() {
        System.out.println("Braking");
        speed = 0;
    }
}