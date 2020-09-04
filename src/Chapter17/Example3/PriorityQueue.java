package Chapter17.Example3;

import java.util.*;

/**
 * @author:YiMing
 * @create:2020/9/3,14:45
 * @version:1.0
 */
class ToDoList extends PriorityQueue<ToDoList.ToDoItem> {
    static class ToDoItem implements Comparable<ToDoItem> {
        private char primary;
        private int secondary;
        private String item;

        public ToDoItem(String td, char pri, int sec) {
            primary = pri;
            secondary = sec;
            item = td;
        }

        /**
         * compareable接口里面就是这么申明的，比较两个数，
         * 1.大于0就是说明是大于的关系，
         * 2.小于0就说明是小于的关系，
         * 3.等于0就说明是相等的关系
         * @param arg
         * @return
         */
        public int compareTo(ToDoItem arg) {
            if (primary > arg.primary)
                return +1;
            if (primary == arg.primary)
                if (secondary > arg.secondary)
                    return +1;
                else if (secondary == arg.secondary)
                    return 0;
            return -1;
        }

        public String toString() {
            return Character.toString(primary) +
                    secondary + ": " + item;
        }
    }

    public void add(String td, char pri, int sec) {
        super.add(new ToDoItem(td, pri, sec));
    }

    public static void main(String[] args) {
        ToDoList toDoList = new ToDoList();
        toDoList.add("Empty trash", 'C', 4);
        toDoList.add("Feed dog", 'A', 2);
        toDoList.add("Feed bird", 'B', 7);
        toDoList.add("Mow lawn", 'C', 3);
        toDoList.add("Water lawn", 'A', 1);
        toDoList.add("Feed cat", 'B', 1);
        while (!toDoList.isEmpty()) System.out.println(toDoList.remove());
    }
} /* Output:
A1: Water lawn
A2: Feed dog
B1: Feed cat
B7: Feed bird
C3: Mow lawn
C4: Empty trash
*///:~
