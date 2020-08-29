package Chapter15;

/**
 * @author:YiMing
 * @create:2020/8/29,17:42
 * @version:1.0
 */
interface Strategy<T, R> {
    R operation(T obj1, T obj2);
}

//整数相加操作
class IntegerAddOperation implements Strategy<Integer, Integer> {
    @Override
    public Integer operation(Integer obj1, Integer obj2) {
        return obj1 + obj2;
    }
}

//字符串比较操作
class StringCompareOperation implements Strategy<String, String> {
    @Override
    public String operation(String obj1, String obj2) {
        Integer result = obj1.compareTo(obj2);
        if ( result == 0) {
            return obj1 + " == " + obj2;
        } else if (result > 0) {
            return obj1 + " > " + obj2;
        } else {
            return obj1 + " < " + obj2;
        }
    }
}

public class Context {
    public static void execute( Object obj1, Object obj2,Strategy strategy) {
        Object result = strategy.operation(obj1, obj2);
        System.out.println(result);
    }

    public static void main(String[] args) {
        execute(1, 2, new IntegerAddOperation());
        execute("today", "tomorrow", new StringCompareOperation());
    }
}
