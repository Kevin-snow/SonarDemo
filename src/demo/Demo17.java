package demo;

/**
 * SonarDemo
 * <p>
 *    Sonar检查场景十一
 *    嵌套try/catch的场景
 * </p>
 */
public class Demo17 {


    public static void main(String[] args) {


        try {

            //省略前边业务逻辑
            System.out.println("abcd");

            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }


    }


}
