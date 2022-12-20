package extend;

import javafx.concurrent.WorkerStateEvent;

public class Main {
    public static void main(String[] argv){
        Student stu1 = new Student();
        Worker w1 = new Worker();
        System.out.println(stu1.getAge());
    }
}
