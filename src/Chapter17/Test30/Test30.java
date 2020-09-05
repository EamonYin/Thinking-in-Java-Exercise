package Chapter17.Test30;

import net.mindview.util.CollectionData;
import net.mindview.util.RandomGenerator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * @author:YiMing
 * @create:2020/9/5,20:57
 * @version:1.0
 */
public class Test30 {
    static List<Test<List<Integer>>> tests = new ArrayList<Test<List<Integer>>>();

    static {
        tests.add(new Test<List<Integer>>("sort") {
            int test(List<Integer> list, TestParam tp) {
                for (int i = 0; i < tp.loops; i++) {
                    list.clear();
                    list.addAll(CollectionData.list(new RandomGenerator.Integer(), tp.size));
                    Collections.sort(list);
                }
                return tp.loops;
            }
        });
    }

    static class ListTester extends Tester<List<Integer>> {
        public ListTester(List<Integer> container, List<Test<List<Integer>>> tests) {
            super(container, tests);
        }

        // 每次测试前填充至适当尺寸:
        @Override
        protected List<Integer> initialize(int size) {
            container.clear();
            container.addAll(CollectionData.list(new RandomGenerator.Integer(), size));
            return container;
        }

        public static void run(List<Integer> list, List<Test<List<Integer>>> tests) {
            new ListTester(list, tests).timedTest();
        }
    }

    public static void main(String[] args) {
        if (args.length > 0)
            Tester.defaultParams = TestParam.array(args);
        ListTester.run(new ArrayList<Integer>(), tests);
        ListTester.run(new LinkedList<Integer>(), tests);
    }
}
