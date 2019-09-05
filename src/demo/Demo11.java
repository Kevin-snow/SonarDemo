package demo;

/**
 * SonarDemo
 * <p>
 *    Sonar检查场景十一
 *    类中声明的变量尽量私有化，对外提供公共的方法。
 * </p>
 */
public class Demo11 {



    public static Demo1 demo1 = null;

    private void getDemo1Instance(){
        if (demo1 == null){
            demo1 = new Demo1();

            //省略后边的业务逻辑
        }

    }

}
