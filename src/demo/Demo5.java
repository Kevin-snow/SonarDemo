package demo;

/**
 * SonarDemo
 * <p>
 *    Sonar检查场景五，认知复杂度的问题.
 *    Sonar认为一个类里嵌套太多的if..else...不可以
 * </p>
 */
public class Demo5 {


    public PrintData queryPrintData(String tzdbh, String cBhPh, String nTf,
                                    String nAjzlb, String isCd) {
        PrintData data = null;
        if (Integer.parseInt(nTf) == CwYwlx.JF) { // 交费信息
            data = sfxxMapper.queryJfData(tzdbh);
            if (data == null) {
                data = getPushData(tzdbh);
                if (data == null) {
                    LoggerUtil
                            .error("要推送编号为" + tzdbh + "的通知单，交费信息data is null");
                    return data;
                }
            } else {
                data.setcCbbm(ArteryOrganUtil.getDeptNameById(data.getnBhCbbm()
                        + ""));
            }
            data.setLoginName(ArteryOrganUtil.getCurrUserInfo().getName());
            if (Integer.parseInt(isCd) == CwCzlx.DY) {
                // 推送久其补全数据.
                sfxxPushJqService.put(data);
            }
        } else if (Integer.parseInt(nTf) == CwYwlx.TF) { // 退费信息
            data = sfxxMapper.queryTfData(tzdbh);

            if (data == null) {
                data = getPushData(tzdbh);
                if (data == null) {
                    LoggerUtil
                            .error("要推送编号为" + tzdbh + "的通知单，退费信息data is null");
                    return data;
                }
            } else {
                data.setcCbbm(ArteryOrganUtil.getDeptNameById(data.getnBhCbbm()
                        + ""));
            }
            data.setnTflx(data.getnTflx() == 1 ? 2 : 1);
            data.setcTfyy(ArteryNormalCodeUtil.getSubCodeName("11150651",
                    data.getcTfyy()));
            data.setcJbr(ArteryOrganUtil.getUserNameById(data.getnBhJbr()));
            data.setLoginName(ArteryOrganUtil.getCurrUserInfo().getName());
            if (Integer.parseInt(isCd) == CwCzlx.DY) {

                String fy = ParsePropertyFile.readValue(
                        SysConfigFilePath.CONFIG_PATH, "tffw.tf");

                // 互联网退费是保存
                if (data.getnBhJbfy() == Integer.parseInt(fy)) {
                    tfxxPushJqService.put(data);
                } else {
                    // 根据退费人名称查询退费人相关信息(除了互联网)
                    Map<String, Object> zhxxMap = zhxxService.queryZhxx(data.getcDsrxm(), data.getcBhAj());

                    if (MapUtils.isNotEmpty(zhxxMap)) {

                        // 将账户信息合并到退费对象信息中
                        data.setcYhzh(zhxxMap.get("CZh").toString());

                        // 将退费人名称放到对象里
                        data.setcZhxm(zhxxMap.get("CZhm").toString());

                        // 将退费人的手机号放到对象里
                        data.setcSjh(zhxxMap.get("CSjh").toString());

                        // 将开户行支行放到对象里
                        data.setcKhhzh(zhxxMap.get("CKhhzh").toString());

                        data.setcKhh(ArteryNormalCodeUtil.getSubCodeName(
                                "11150661", zhxxMap.get("ckhh").toString()));

                    }
                    sfxxPushJqBqService.put(data);
                }
            }
        }
        return data;
    }



}
