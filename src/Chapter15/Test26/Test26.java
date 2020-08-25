package Chapter15.Test26;

/**
 * @author:YiMing
 * @create:2020/8/25,21:18
 * @version:1.0
 */
public class Test26 {
    public static void main(String[] args) {
        Number[] nums = new Integer[10];
        nums[0] = Integer.valueOf(1);
        try{
            nums[1] = new Float(1.0);
        }catch (Exception e){
            System.out.println(e);
        }
        try {
            nums[2] = Byte.valueOf((byte)1);
        }catch (Exception e){
            System.out.println(e);
        }
        for(int i = 0 ; i < nums.length ;i++){
            System.out.print(nums[i]+" ");
        }
    }
}
