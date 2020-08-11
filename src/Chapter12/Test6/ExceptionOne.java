package Chapter12.Test6;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.util.logging.Logger;

/**
 * @author:YiMing
 * @create:2020/8/10,16:03
 * @version:1.0
 */
public class ExceptionOne extends Exception {
    private static Logger logger = Logger.getLogger("LoggingException1");

    public ExceptionOne() {
        StringWriter sw = new StringWriter();
        printStackTrace(new PrintWriter(sw));
        System.out.println("++++++++++++++++++++++++++");
        logger.severe(sw.toString());
    }
}
