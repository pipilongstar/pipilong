/**
 * @author pipilong
 * @createTime 2022/10/21
 * @description
 */
public class Student implements MyInterface12 {


    public void say(){
        System.out.println("say...");
    }

    @Override
    public void see() {
        System.out.println("see...");
    }
}
