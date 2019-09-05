package demo;


/**
 * SonarDemo
 * <p>
 *    Sonar检查场景九，使用线程的问题.
 * </p>
 */
public class Demo9 {


    public static void main(String[] args) {



        try {

            //省略前边的业务逻辑

            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();

            //Thread.currentThread().interrupt();
        }


    }



}
