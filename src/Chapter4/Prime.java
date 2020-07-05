package Chapter4;

import com.sun.org.apache.xerces.internal.impl.xpath.regex.Match;

/**
 * @author:YiMing
 * @create:2020/7/2,19:07
 * @version:1.0
 */
public class Prime {
    public static boolean IsPrime(int num){
        for ( int i = 2 ; i < Math.abs(num) ; i++){
            if(num%i ==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        for ( int i = 0 ; i < 1000 ; i++){
            if(IsPrime(i)){
                System.out.println(i);
            }
        }
    }


}
