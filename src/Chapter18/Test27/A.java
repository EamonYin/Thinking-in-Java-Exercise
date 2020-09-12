package Chapter18.Test27;

import java.io.Serializable;

class A implements Serializable {

    private B b = new B();

    public String toString() {
        return ("it's A;  " + b);
    }
}