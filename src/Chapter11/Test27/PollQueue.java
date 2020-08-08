package Chapter11.Test27;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author:YiMing
 * @create:2020/8/8,13:19
 * @version:1.0
 */
public class PollQueue {
    String PollQueue(){
        Queue<Command> qu = new LinkedList<>();
        ToQueue toQueue = new ToQueue();
        Queue<Command> queue = toQueue.CommandToQueue(qu);

        return queue.remove().operation();
    }
}
