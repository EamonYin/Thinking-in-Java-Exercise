package Chapter15.Test21;//: generics/ClassTypeCapture.java


import Chapter15.Test18.BigFish;

import java.util.HashMap;
import java.util.Map;

class Building {
}

class House extends Building {
}

class MyHouse extends House{}

public class ClassTypeCapture<T> {
    Class<T> kind;

    //添加
    Map<String, Class<?>> map = new HashMap<String, Class<?>>();
    //添加
    public void addType(String typename, Class<?> kind) {
        map.put(typename, kind);
    }
    //创建
    public Object createNew(String typename) {
        Class<?> aClass = map.get(typename);
        try {
            return aClass.newInstance();
        } catch (InstantiationException e) {
            System.out.println("未注册: " + typename);
        } catch (IllegalAccessException e) {
            System.out.println(e);
        }
        return null;
    }

    /*public ClassTypeCapture(Class<T> kind) {
        this.kind = kind;
    }*/

    public boolean f(Object arg) {
        return kind.isInstance(arg);
    }


    public static void main(String[] args) {
        ClassTypeCapture ctt = new ClassTypeCapture();
        ctt.addType("Building", Building.class);
        ctt.addType("House", House.class);
        ctt.addType("MyHouse", MyHouse.class);
        ctt.addType("Integer", Integer.class);
        System.out.println(ctt.createNew("Building").getClass());
        System.out.println(ctt.createNew("House").getClass());
        System.out.println(ctt.createNew("MyHouse").getClass());
        System.out.println("--------------------------------------");
        System.out.println(ctt.createNew("Integer").getClass());

    }
}
