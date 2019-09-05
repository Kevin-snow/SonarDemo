package demo;


/**
 * SonarDemo
 * <p>
 *    Sonar检查场景七，使用类定义常亮的问题.
 *    Sonar认为这是一个常亮类，既然是常亮就应该将类设置为私有。
 * </p>
 */
public class Demo7 {


    // 1.有效
    public static final int YX = 1;

    // 2.无效
    public static final int WX = 2;


}
