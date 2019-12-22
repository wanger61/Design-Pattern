package 职责链模式;

public class ConcreteHandler1 extends Handler {

    @Override
    public void Handle(int request) {
        if (request>0 && request<=10){
            System.out.println("被1号处理了.....");
        }else if (successor != null){
            successor.Handle(request);
        }
    }

}
