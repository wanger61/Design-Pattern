package 工厂方法;

import org.junit.Test;

public class OperationAdd extends Operation {
    @Override
    public double getResult() {
        return this.getNumberA() + this.getNumberB();
    }

    @Test
    public void test(){
        Operation op = new OperationAdd();
        op.setNumberA(10);
        op.setNumberB(20);
        System.out.println(op.getResult());
    }

}
