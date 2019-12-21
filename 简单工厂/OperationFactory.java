package 简单工厂;

import org.junit.Test;

public class OperationFactory {

    public static Operation getOperation(String op) {
        Operation operation = null;
        switch (op){
            case "+":
                operation = new OperationAdd();
                break;
        }
        return operation;
    }

    @Test
    public void test(){
        Operation op = OperationFactory.getOperation("+");   //静态工厂根据传入的字符串确定要创建哪一个实例
        op.setNumberB(10);
        op.setNumberA(11);
        System.out.println(op.getResult());
    }
}
