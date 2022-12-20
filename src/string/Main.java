package string;

public class Main {
    public static void main(String[] argv){
        Student s1 = new Student("scc");
        Student s2 = new Student("scc1");
        System.out.println(s1.name.equals(s2.name));  // 使用equals来进行值的对比
        System.out.println(s1.name.charAt(0));  // 获取第一个位置的字符
        for (int i = 0; i < s1.name.length(); ++i){  // 根据s1类的name属性的长度进行循环
            System.out.print(s1.name.charAt(i));  // 输出每一个位置的字符
        }
    }
}
