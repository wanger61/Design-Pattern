package 包装模式;

public class DecoratePerson extends Person{

    private Person person;

    public void Decorate(Person person){
        this.person = person;
    }

    @Override
    public void show(){
        System.out.println("穿了衣服：");
    }

}
