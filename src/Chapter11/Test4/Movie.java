package Chapter11.Test4;

/**
 * @author:YiMing
 * @create:2020/8/4,17:30
 * @version:1.0
 */
public class Movie {
    private int key = 0;
    private String Movie=null;
    String next(){
        switch (key){
            case 0 : key++ ; Movie="人在囧途"; break;
            case 1 : key++ ; Movie="流浪地球"; break;
            case 2 : key++ ; Movie="阿甘正传"; break;
            case 3 : key++ ; Movie="绿皮书"; break;
            case 4 : key++ ; Movie="我不是药神"; break;
            case 5 : key=0 ; Movie="百变星君"; break;
        }
        return Movie;
    }
}
