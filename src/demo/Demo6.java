package demo;

/**
 * SonarDemo
 * <p>
 *    Sonar检查场景六，保留有TODO和未使用变量的问题.
 *    Sonar认为未使用的变量是没必要存在的，会建议删掉。
 *    //TODO这种必须删掉。
 * </p>
 */
public class Demo6 {


    private String name = "";


    public void getPh(){

        //TODO xxxxxxx

        String ph = "xxxx";

        System.out.println(ph);


    }


}
