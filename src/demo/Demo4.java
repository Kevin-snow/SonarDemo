package demo;



/**
 * SonarDemo
 * <p>
 *    Sonar检查场景四，使用enum的问题.
 *    Sonar认为枚举类里不应该有属性的setter方法
 * </p>
 */
public enum Demo4 {

    QB("0", "全部"), XJ("1", "现金"), ZP("2", "支票"), ZZ("3", "转账");

    private String name;
    private String code;

    private Demo4(String msg,String code){
        this.name = msg;
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public static Demo4 getEnumByKey(String key){

        if (key == null){
            return null;
        }

        for (Demo4 enumDemp : Demo4.values()){
            if(enumDemp.getCode().equals(key)){
                return enumDemp;
            }
        }

        return null;
    }



}
