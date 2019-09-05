package demo;

/**
 * SonarDemo
 * <p>
 *    Sonar检查场景三，定义常亮的问题.
 *    Sonar认为应该使用enum
 * </p>
 */
public interface Demo3 {

    // 1.有效
    public static final int YX = 1;

    // 2.无效
    public static final int WX = 2;


}
