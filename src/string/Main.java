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

        System.out.println(learn_endswith(s1.name, "c"));
        byte[] byt_arr = s1.name.getBytes();
        for (byte b : byt_arr) {
            System.out.println(b);
        }

    }

    public static char learn_charAt(String name, int idx){  // 在第几个下标位置的字符为
        return name.charAt(idx);
    }

    public static boolean learn_endswith(String name, String str){  // 判断字符串结尾是否为指定的子串
        return name.endsWith(str);
    }

    public static boolean learn_startswith(String name, String str){  // 判断字符串开头是否为指定的子串
        return name.startsWith(str);
    }

    public static byte[] learn_get_bytes(String name){  // 将字符串转为数组
        return name.getBytes();
    }

    public static boolean laern_is_empty(String name){  // 判断为空
        return name.isEmpty();
    }

    public static int learn_last_indexof(String name, char ch){  // 判断字符串中一个字符出现的最后一个位置
        return name.lastIndexOf(ch);
    }

    public static int learn_last_indexof(String name, String ch){  // 判断字符串中一个子串出现的最后一个位置
        return name.lastIndexOf(ch);
    }

    public static String learn_replace(String name, String target_str, String res_str){  // 将target部分替换为res
        return name.replace(target_str, res_str);
    }
}
