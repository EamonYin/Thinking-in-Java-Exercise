package Chapter11.Test22;

/**
 * @author:YiMing
 * @create:2020/8/7,17:07
 * @version:1.0
 */
public class Contain {
    private String word;
    private int count=1;

    Contain(String word) {
        this.word = word;
    }

    void addCount(){count++;}
    int getCount(){return count;}
    String getName(){return word;}

    public String toString() {
        return "【" + word + "】";
    }
}
