package 包装模式;

public class Person {
    private String name;

    public void show(){
        System.out.println("没穿衣服");
    }

    public Person(){}
    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
