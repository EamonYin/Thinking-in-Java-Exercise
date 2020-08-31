package Chapter16.Test14;

import net.mindview.util.Generator;

import java.lang.reflect.Array;

/**
 * @author:YiMing
 * @create:2020/8/31,16:28
 * @version:1.0
 */
public class Fill {
    public static void primitive(Object array, Generator<?> gen) {
        int size = Array.getLength(array);
        Class<?> type = array.getClass().getComponentType();
        for(int i = 0; i < size; i++)
            if(type == Boolean.TYPE)
                Array.setBoolean(array, i, (Boolean)gen.next());
            else if (type == Byte.TYPE)
                Array.setByte(array, i, (Byte)gen.next());
            else if (type == Short.TYPE)
                Array.setShort(array, i, (Short)gen.next());
            else if (type == Integer.TYPE)
                Array.setInt(array, i, (Integer)gen.next());
            else if (type == Character.TYPE)
                Array.setChar(array, i, (Character)gen.next());
            else if (type == Float.TYPE)
                Array.setFloat(array, i, (Float)gen.next());
            else if (type == Double.TYPE)
                Array.setDouble(array, i, (Double)gen.next());
            else if (type == Long.TYPE)
                Array.setLong(array, i, (Long)gen.next());
    }
}
