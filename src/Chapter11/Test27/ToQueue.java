package Chapter11.Test27;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @author:YiMing
 * @create:2020/8/8,13:09
 * @version:1.0
 */
public class ToQueue {
    public Queue<Command> CommandToQueue(Queue queue){
        Command command = new Command();
        queue.offer(command);
        return queue;
    }
}
