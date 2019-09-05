package demo;


/**
 * SonarDemo
 * <p>
 *    Sonar检查场景十一
 *    变量频繁出现的场景。
 * </p>
 */
public class Demo15 {



    //当某个变量值频繁出现且不会改变的，Sonar定义成一个常亮。


    public void exe() {

        jqjson.put("Uid","bgjq");
        jqjson.put("Pwd","bgjq");
        jqjson.put("OrgCode",
                StringUtils.leftPad(jqjson.getString("OrgCode"), 2, "0"));
        jqjson.put("ReceiptType",
                StringUtils.leftPad(jqjson.getString("ReceiptType"), 2, "0"));
        jqjson.put("RefundMode",
                StringUtils.leftPad(jqjson.getString("RefundMode"), 2, "0"));

        if(StringUtils.isBlank(jqjson.getString("PayDate")) ){
            jqjson.put("ExchangeDate", LocalDateTime.now().toString("yyyy-MM-dd"));
            jqjson.put("PayDate", LocalDateTime.now().toString("yyyy-MM-dd"));
        } else {
            jqjson.put("ExchangeDate", jqjson.getString("PayDate"));
            jqjson.put("PayDate", jqjson.getString("PayDate"));
        }
        jqjson.put("ApplyTime", LocalDateTime.now().toString("yyyy-MM-dd"));
        String[] props = { "Uid", "Pwd", "OrgCode", "LawCaseNo", "LawCaseNumber", "LawCaseAccount", "Party", "Payer", "PayFlagNo",
                "ReceiptType", "UserId", "User", "SerialNo", "LawReason", "Trial", "PayDate", "LawCaseType", "Bank", "RefundMode",
                "Proposer", "ContactWay", "ApplyTime", "RefundAmount", "Court", "CourtId", "Judge", "JudgeId", "Financer", "Creater",
                "ExchangeDate", "AccountNo", "AccountName", "AccountNoBank", "AccountType","ReasonsforRefund"};

        Document doc = DocumentHelper.createDocument();
        // 创建根元素
        Element rootElement = doc.addElement("ReqStr");
        for (String prpo : props) {
            rootElement.addElement(prpo).setText(
                    jqjson.getString(prpo) == null ? "" : jqjson
                            .getString(prpo));
        }
        LoggerUtil.error("推送久其的退费信息参数：" + rootElement.asXML());
        return rootElement.asXML();
    }
}
