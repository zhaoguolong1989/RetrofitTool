package com.test.retrofit.response;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/1/10.
 */
public class LoginBean implements Serializable {


    /**
     * avatarUrl : http://img.sh.centanet.com/shanghai/staticfile/agent/agentphoto/AA63817.jpg
     * ismultiJob : 1
     * sessionUser : {"adminOrg":"4665ace96b3a4b96986b47d77aba42bc","busiarId":"78d72e4e880f4cb0a2cd116a27ecc78e","busibaId":"BA378B64CE8045318B8177B0C96CE192","busigrpId":"4665ace96b3a4b96986b47d77aba42bc","busiswzId":"351DB28DF786498E8E601CBFC622682D","busiwzId":"32348D46E2FA42C2B19FEBABF5CDE359","email":"qinqi02@centaline.com.cn","employeeCode":"AA63817","employeeType":"REGU","id":"3B7A66423D294203ADE590D0E4DE8E06","menuList":[{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[{"children":[{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUADVLIST","icon":"","id":"ff80808157416b8d01574fcc39f9005e","menuName":"有效房源","orderby":"1","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fbc44c20058","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUADVLIST","resourceName":"有效房源","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUPOOLLIST","icon":"","id":"ff80808157416b8d01574fdca2890067","menuName":"公房","orderby":"2","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fdbc7f50064","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUPOOLLIST","resourceName":"公房","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.CMCASELIST","icon":"","id":"ff80808157416b8d01574fe04020006d","menuName":"我的房源","orderby":"3","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fdf8a28006a","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.CMCASELIST","resourceName":"我的房源","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUFAVOR","icon":"","id":"ff80808157416b8d0157507d6320007e","menuName":"我的收藏","orderby":"8","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157500de51b0078","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUFAVOR","resourceName":"我的收藏","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.GROUPFAVOR","icon":"","id":"ff80808157416b8d0157507e443c0081","menuName":"店组收藏","orderby":"9","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157500ef1f7007b","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.GROUPFAVOR","resourceName":"店组收藏","url":""},"target":"","type":"MEN","url":""}],"code":"SALES.APP.HOUMGR","icon":"","id":"ff808081577014cc0157702709430003","menuName":"房源","orderby":"1","parentId":"ff80808157416b8d01574fcade1b005b","parentIds":"ff80808157416b8d01574fcade1b005b,","target":"","type":"MDL"},{"children":[{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.MYCUSTOMER","icon":"","id":"ff80808157416b8d0157508076bf0087","menuName":"我的客户","orderby":"1","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fd2c9240061","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.MYCUSTOMER","resourceName":"我的客户","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.CMCUSTLIST","icon":"","id":"ff80808157416b8d0157508332100096","menuName":"公客","orderby":"12","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01575082c9360093","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.CMCUSTLIST","resourceName":"公客","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.GROUPPOTENCUST","icon":"","id":"ff80808157416b8d01575081172d008a","menuName":"我的潜客","orderby":"2","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157507fc4000084","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.GROUPPOTENCUST","resourceName":"我的潜客","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.LOOKONLINE","icon":"","id":"ff80808158860ab501588ffbc34d0050","menuName":"网上约看","orderby":"3","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808158860ab501588ff12d62004d","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.LOOKONLINE","resourceName":"网上约看","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.SHOWCUSTIMPORT","icon":"","id":"ff80808157416b8d0157508229e60090","menuName":"我的导入客","orderby":"7","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01575081bf47008d","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.SHOWCUSTIMPORT","resourceName":"我的导入客","url":""},"target":"","type":"MEN","url":""}],"code":"SALES.APP.CUSTMGR","icon":"","id":"ff808081577014cc0157702668e70000","menuName":"客源","orderby":"2","parentId":"ff80808157416b8d01574fcade1b005b","parentIds":"ff80808157416b8d01574fcade1b005b,","target":"","type":"MDL"},{"children":[{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.CUSTLOOKPLAN","icon":"","id":"ff80808157416b8d015750860069009f","menuName":"我的约看","orderby":"1","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508596a2009c","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.CUSTLOOKPLAN","resourceName":"我的约看","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUKEYLIST","icon":"","id":"ff80808157416b8d01575086f2d400a5","menuName":"钥匙管理","orderby":"4","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01575086775b00a2","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.HOUKEYLIST","resourceName":"钥匙管理","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.DOWNRECORD","icon":"","id":"ff80808157416b8d01575087ef5900ab","menuName":"已下载录音","orderby":"5","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508776ff00a8","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.DOWNRECORD","resourceName":"已下载录音","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.RICHSCAN","icon":"","id":"ff80808157416b8d01575089daf400b1","menuName":"扫一扫","orderby":"6","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508848ca00ae","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.RICHSCAN","resourceName":"扫一扫","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.REMINDER","icon":"","id":"ff80808157416b8d0157508ad1ba00b7","menuName":"我的提醒","orderby":"7","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508a66d700b4","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.REMINDER","resourceName":"我的提醒","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.LOGINOUT","icon":"","id":"ff80808157416b8d0157508b985700bd","menuName":"退出登录","orderby":"8","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508b3b7d00ba","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.LOGINOUT","resourceName":"退出登录","url":""},"target":"","type":"MEN","url":""}],"code":"SALES.APP.OTHER","icon":"","id":"ff808081577014cc01577028aee40006","menuName":"其他","orderby":"3","parentId":"ff80808157416b8d01574fcade1b005b","parentIds":"ff80808157416b8d01574fcade1b005b,","target":"","type":"MDL"}],"code":"SALES.APP.MOBILE","icon":"icon-user","id":"ff80808157416b8d01574fcade1b005b","menuName":"三级市场APP","orderby":"0090","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"8a84811c4d6cc498014d6cc681520000","resourceCode":"SALES","resourceName":"三级市场销售平台","url":""},"target":"","type":"APP","url":""}],"mobile":"13601631397","permissions":["RWYGW","SALES.HOUTRACK","SALES.CUSTOMER.TOCUSTOMERADD:UPDATE","SALES.CUSTOMERDEL","SALES.CUST.CUSTOMERDEL:LOOK","SALES.CUST.CUSTOMERDEL:UPDATE","SALES.CUST.CUSTOMERDEL:DELETE","sales.REPORT.EMPWORKLOAD","sales.REPORT.EMPHOUTRACKTYPE","SALES.HOUTRACK.LIST:ADD","SALES.HOUSE.HOUSECONTACT:OPER","SALES.BORROWKEYLIST","SALES.SHOWCUSTIMPORT","SALES.CMCUSTLIST.CUST:DETAIL","SALES.CUSTOMER.TOCUSTOMERADD:DELETE","SALES.HOUEXPL.EXPLOBJ:OPER","uam.userorg.user:add","SALES.CUSTLOOKS","SALES.CUSTOMER.MYCUST:LOOK","SALES.CUSTOMER.MYCUST:NOUSE","SALES.CUSTOMER.TOCUSTOMERADD:ADDDEL","SALES.HOUSE.OBJECTION:AR","sales.MYCUSTLIST","salse.MYCUST","sales.CMCUSTLIST","salse.MYCUSTOMER","sales.CUSTDELADD","sales.HOU","sales.HOUADVLIST","SALES.PERSONAL.WORKINGTABLE","SALES.HOUSE.ADDHOUSELIANJIE","SALES.HOUTRACK.LIST:LIST","SALES.HOUKEY.GRPKEY:REPORT","sales.cust.mycustlook","sales.MYKEYLIST","SALES.HOUMGR.HOUSE","sales.ADDHOUSE","sales.PERSONALWORKING","Sales.ctpost.EMPIDPROID","sales.HOUDCPLIST","SALES.HOUDETAIL.ROOMNB","SALES.HOULIST.ROOMNB","SALES.HOUSE.HOUSEACTIVETOR","SALES.CUSTTRACK","SALES.CUSTTRACK.MYTRACK:LIST","sales.MYHOUSEEXPL","SALES.CUSTOMER.POTEN:NOUSE","SALES.CUSTOMER.MYCUST:setVip","SALES.CUSTTRACK.HISTORY","SALES.HOUSOLE","SALES.HOUSOLE.ADD","sales.HOUKEYLIST2","SALES.HOUKEY.MYKEY:RETURN","SALES.HOUKEY.GRPKEY:CONFIRM","SALES.HOUKEY.MYKEY:BACK","SALES.CMCUSTLIST.CUST:GETCUST","SALES.HOUTRACK.MYTRACK:LIST","SALES.HOUSE.HOUSEADD:ADD","sales.CUSTLOOKPLAN","SALES.HOUEXCL.MYEXCL:LIST","SALES.HOUMGR","SALES.CUSTOMER.MYCUST:PUBLIC","sales.REPORT.CUSTAMOUNT","SALES.CUST.MYPOTEN:SETVIP","sales.HOUPOOLLIST","SALES.CUSTOMER.MYCUST:LOOKABOUT","SALES.CUSTOMER.POTENCUST:LOOK","SALES.CUSTOMER.TOCUSTDELADD:ADD","SALES.CUSTOMER.TOCUSTDELADD:SUBMIT","SALES.CUSTOMER.TOCUSTDELADD:ADDCUST","SALES.CUST.CUSTOMERDEL:ERFER","SALES.CUST.CUSTOMERDEL:INSER","SALES.CUSTOMER.TRACK","SALES.CUST.TRACK.INSER","SALES.CUST.TRACK:LOOK","SALES.CUST.TRACK.INSERPUBLI","Sales.HOUREG.ADDSHOWHOUREG:Add","SALES.REG","Sales.HOUREG.OBJSHOWHOUREG:REPORT","SALES.HOUSOLE.QUERYLIST","SALES.HOUSOLE.QUERYLIST","Sales.HOUREG.SHOWHOUREG","Sales.ctpost.ADDEMPIDPROID:Add","SALES.HOUREG.MYREG:LIST","SALES","sales.POOLHOULIST","sales.OPPTHOULIST","sales.HOUADV","sales.HOUROLE","SALES.CUSTMGR","SALES.HOUKEY.BORROWKEY:ADD","SALES.HOUKEY.BORROWKEY:BORROW","SALES.HOUKEY.BORROWKEY:REPORT","SALES.HOUEXPL.EXPLLIST:ADD","SALES.HOUEXPL.EXPLOBJ:REPORT","SALES.HOUEXPL.EXPLOBJ:SUBMIT","SALES.CUSTOMER.VOICE","SALES.HOUSE.HOUSEEDIT:OPER","SALES.CUST.TRACKRADIO","SALES.CUST.MYPOTEN:PLAYPUBLIC","SALES.CUSTARCHIVE.CUST:RECEIVE","sales.ADDHOUSENEW","ctm.Querry.QuerryAll","ctm.ReceiptList","SALES.HOU.GROUPFAVOR","SALES.CTPOST.AGENCYLIST","SALES.CTPOST.AGENCYHOME","SALES.TRACK.RECORD","sales.REPORT.CENTALINECALL","sales.REPORT.TOCALRECORDINGSH","sales.REPORT.TOOTHERLINE","SALES.PHONE.INVALID","SALES.HOUTRACK.HISTORY:VIEW","sales.CUSTOMER","sales.HOUKEY","sales.HOUSE","sales.SELL","SALES.CUSTOMER.SEE","SALES.CSTOMER.SEE:INSER","SALES.CUSTOMER.SEE:LOOK","SALES.HOUPOOL.LINGY:LINGY","SALES.HOUNORMAL","SALES.HOUNORMAL.ADD","ctm.PayList","ctm.GatherCommissionList","ctm.BackCommissionList","ctm.achieve.EarnestReport","SALES.LOOKONLINE:MYONLINELIST","SALES.DICTIONARY","sales.newestatedictionary","SALES.APP.MYCUSTOMER","SALES.APP.CMCASELIST","SALES.APP.HOUFAVOR","SALES.APP.GROUPFAVOR","SALES.APP.GROUPPOTENCUST","ctm.Edesk.Processed","ctm.Edesk.ProcessFinished","SALES.HOUREG.WATING.LIST","SALES.APP.LOOKONLINE","SALES.APP.LOOKONLINE","SALES.HOUREG.HOUREGCACEL","ctm.achieve.EarnestChange","SALES.APP.MOBILE","SALES.APP.HOUADVLIST","SALES.APP.SHOWCUSTIMPORT","SALES.APP.CMCUSTLIST","SALES.APP.OTHER","SALES.APP.CUSTLOOKPLAN","SALES.APP.HOUKEYLIST","SALES.APP.DOWNRECORD","SALES.APP.RICHSCAN","SALES.APP.REMINDER","SALES.APP.LOGINOUT","SALES.APP.HOUPOOLLIST","SALES.HOUREG.HOUREGFILEAUTH","SALES.CUSTARCHIVE","SALES.HOUSEPHONE.HISTORY","ctm-web","ctm.Achieve","ctm.case","ctm.Commission","ctm.Edesk","ctm.Querry","ctm.gatherpay","ctm.NewCase","ctm.Edesk.Process"],"realName":"秦琦","roles":["RWYGW"],"serviceCompanyAddress":"虹口区临平路68号","serviceCompanyCode":"033J949","serviceCompanyFax":"55580892","serviceCompanyId":"4665ace96b3a4b96986b47d77aba42bc","serviceCompanyName":"瑞虹二店5组","serviceCompanyPhone":"51787707","serviceDepAddress":"虹口区临平路68号","serviceDepCode":"033J949","serviceDepFax":"55580892","serviceDepHierarchy":"BUSIGRP","serviceDepId":"4665ace96b3a4b96986b47d77aba42bc","serviceDepName":"瑞虹二店5组","serviceDepOrgType":"DEP","serviceDepPhone":"51787707","serviceDepType":"BUSI","serviceJobCode":"JWYGW","serviceJobId":"402809224db41ad5014db42a53290033","serviceJobName":"物业顾问","ssoSessionId":"8ecae128-1882-4817-8ff6-27eea1236120-APP-sales-tomcat","username":"qinqi02"}
     */

    private ContentBean content;
    /**
     * content : {"avatarUrl":"http://img.sh.centanet.com/shanghai/staticfile/agent/agentphoto/AA63817.jpg","ismultiJob":1,"sessionUser":{"adminOrg":"4665ace96b3a4b96986b47d77aba42bc","busiarId":"78d72e4e880f4cb0a2cd116a27ecc78e","busibaId":"BA378B64CE8045318B8177B0C96CE192","busigrpId":"4665ace96b3a4b96986b47d77aba42bc","busiswzId":"351DB28DF786498E8E601CBFC622682D","busiwzId":"32348D46E2FA42C2B19FEBABF5CDE359","email":"qinqi02@centaline.com.cn","employeeCode":"AA63817","employeeType":"REGU","id":"3B7A66423D294203ADE590D0E4DE8E06","menuList":[{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[{"children":[{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUADVLIST","icon":"","id":"ff80808157416b8d01574fcc39f9005e","menuName":"有效房源","orderby":"1","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fbc44c20058","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUADVLIST","resourceName":"有效房源","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUPOOLLIST","icon":"","id":"ff80808157416b8d01574fdca2890067","menuName":"公房","orderby":"2","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fdbc7f50064","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUPOOLLIST","resourceName":"公房","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.CMCASELIST","icon":"","id":"ff80808157416b8d01574fe04020006d","menuName":"我的房源","orderby":"3","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fdf8a28006a","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.CMCASELIST","resourceName":"我的房源","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUFAVOR","icon":"","id":"ff80808157416b8d0157507d6320007e","menuName":"我的收藏","orderby":"8","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157500de51b0078","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUFAVOR","resourceName":"我的收藏","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.GROUPFAVOR","icon":"","id":"ff80808157416b8d0157507e443c0081","menuName":"店组收藏","orderby":"9","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157500ef1f7007b","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.GROUPFAVOR","resourceName":"店组收藏","url":""},"target":"","type":"MEN","url":""}],"code":"SALES.APP.HOUMGR","icon":"","id":"ff808081577014cc0157702709430003","menuName":"房源","orderby":"1","parentId":"ff80808157416b8d01574fcade1b005b","parentIds":"ff80808157416b8d01574fcade1b005b,","target":"","type":"MDL"},{"children":[{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.MYCUSTOMER","icon":"","id":"ff80808157416b8d0157508076bf0087","menuName":"我的客户","orderby":"1","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fd2c9240061","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.MYCUSTOMER","resourceName":"我的客户","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.CMCUSTLIST","icon":"","id":"ff80808157416b8d0157508332100096","menuName":"公客","orderby":"12","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01575082c9360093","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.CMCUSTLIST","resourceName":"公客","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.GROUPPOTENCUST","icon":"","id":"ff80808157416b8d01575081172d008a","menuName":"我的潜客","orderby":"2","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157507fc4000084","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.GROUPPOTENCUST","resourceName":"我的潜客","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.LOOKONLINE","icon":"","id":"ff80808158860ab501588ffbc34d0050","menuName":"网上约看","orderby":"3","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808158860ab501588ff12d62004d","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.LOOKONLINE","resourceName":"网上约看","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.SHOWCUSTIMPORT","icon":"","id":"ff80808157416b8d0157508229e60090","menuName":"我的导入客","orderby":"7","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01575081bf47008d","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.SHOWCUSTIMPORT","resourceName":"我的导入客","url":""},"target":"","type":"MEN","url":""}],"code":"SALES.APP.CUSTMGR","icon":"","id":"ff808081577014cc0157702668e70000","menuName":"客源","orderby":"2","parentId":"ff80808157416b8d01574fcade1b005b","parentIds":"ff80808157416b8d01574fcade1b005b,","target":"","type":"MDL"},{"children":[{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.CUSTLOOKPLAN","icon":"","id":"ff80808157416b8d015750860069009f","menuName":"我的约看","orderby":"1","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508596a2009c","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.CUSTLOOKPLAN","resourceName":"我的约看","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUKEYLIST","icon":"","id":"ff80808157416b8d01575086f2d400a5","menuName":"钥匙管理","orderby":"4","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01575086775b00a2","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.HOUKEYLIST","resourceName":"钥匙管理","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.DOWNRECORD","icon":"","id":"ff80808157416b8d01575087ef5900ab","menuName":"已下载录音","orderby":"5","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508776ff00a8","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.DOWNRECORD","resourceName":"已下载录音","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.RICHSCAN","icon":"","id":"ff80808157416b8d01575089daf400b1","menuName":"扫一扫","orderby":"6","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508848ca00ae","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.RICHSCAN","resourceName":"扫一扫","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.REMINDER","icon":"","id":"ff80808157416b8d0157508ad1ba00b7","menuName":"我的提醒","orderby":"7","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508a66d700b4","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.REMINDER","resourceName":"我的提醒","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.LOGINOUT","icon":"","id":"ff80808157416b8d0157508b985700bd","menuName":"退出登录","orderby":"8","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508b3b7d00ba","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.LOGINOUT","resourceName":"退出登录","url":""},"target":"","type":"MEN","url":""}],"code":"SALES.APP.OTHER","icon":"","id":"ff808081577014cc01577028aee40006","menuName":"其他","orderby":"3","parentId":"ff80808157416b8d01574fcade1b005b","parentIds":"ff80808157416b8d01574fcade1b005b,","target":"","type":"MDL"}],"code":"SALES.APP.MOBILE","icon":"icon-user","id":"ff80808157416b8d01574fcade1b005b","menuName":"三级市场APP","orderby":"0090","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"8a84811c4d6cc498014d6cc681520000","resourceCode":"SALES","resourceName":"三级市场销售平台","url":""},"target":"","type":"APP","url":""}],"mobile":"13601631397","permissions":["RWYGW","SALES.HOUTRACK","SALES.CUSTOMER.TOCUSTOMERADD:UPDATE","SALES.CUSTOMERDEL","SALES.CUST.CUSTOMERDEL:LOOK","SALES.CUST.CUSTOMERDEL:UPDATE","SALES.CUST.CUSTOMERDEL:DELETE","sales.REPORT.EMPWORKLOAD","sales.REPORT.EMPHOUTRACKTYPE","SALES.HOUTRACK.LIST:ADD","SALES.HOUSE.HOUSECONTACT:OPER","SALES.BORROWKEYLIST","SALES.SHOWCUSTIMPORT","SALES.CMCUSTLIST.CUST:DETAIL","SALES.CUSTOMER.TOCUSTOMERADD:DELETE","SALES.HOUEXPL.EXPLOBJ:OPER","uam.userorg.user:add","SALES.CUSTLOOKS","SALES.CUSTOMER.MYCUST:LOOK","SALES.CUSTOMER.MYCUST:NOUSE","SALES.CUSTOMER.TOCUSTOMERADD:ADDDEL","SALES.HOUSE.OBJECTION:AR","sales.MYCUSTLIST","salse.MYCUST","sales.CMCUSTLIST","salse.MYCUSTOMER","sales.CUSTDELADD","sales.HOU","sales.HOUADVLIST","SALES.PERSONAL.WORKINGTABLE","SALES.HOUSE.ADDHOUSELIANJIE","SALES.HOUTRACK.LIST:LIST","SALES.HOUKEY.GRPKEY:REPORT","sales.cust.mycustlook","sales.MYKEYLIST","SALES.HOUMGR.HOUSE","sales.ADDHOUSE","sales.PERSONALWORKING","Sales.ctpost.EMPIDPROID","sales.HOUDCPLIST","SALES.HOUDETAIL.ROOMNB","SALES.HOULIST.ROOMNB","SALES.HOUSE.HOUSEACTIVETOR","SALES.CUSTTRACK","SALES.CUSTTRACK.MYTRACK:LIST","sales.MYHOUSEEXPL","SALES.CUSTOMER.POTEN:NOUSE","SALES.CUSTOMER.MYCUST:setVip","SALES.CUSTTRACK.HISTORY","SALES.HOUSOLE","SALES.HOUSOLE.ADD","sales.HOUKEYLIST2","SALES.HOUKEY.MYKEY:RETURN","SALES.HOUKEY.GRPKEY:CONFIRM","SALES.HOUKEY.MYKEY:BACK","SALES.CMCUSTLIST.CUST:GETCUST","SALES.HOUTRACK.MYTRACK:LIST","SALES.HOUSE.HOUSEADD:ADD","sales.CUSTLOOKPLAN","SALES.HOUEXCL.MYEXCL:LIST","SALES.HOUMGR","SALES.CUSTOMER.MYCUST:PUBLIC","sales.REPORT.CUSTAMOUNT","SALES.CUST.MYPOTEN:SETVIP","sales.HOUPOOLLIST","SALES.CUSTOMER.MYCUST:LOOKABOUT","SALES.CUSTOMER.POTENCUST:LOOK","SALES.CUSTOMER.TOCUSTDELADD:ADD","SALES.CUSTOMER.TOCUSTDELADD:SUBMIT","SALES.CUSTOMER.TOCUSTDELADD:ADDCUST","SALES.CUST.CUSTOMERDEL:ERFER","SALES.CUST.CUSTOMERDEL:INSER","SALES.CUSTOMER.TRACK","SALES.CUST.TRACK.INSER","SALES.CUST.TRACK:LOOK","SALES.CUST.TRACK.INSERPUBLI","Sales.HOUREG.ADDSHOWHOUREG:Add","SALES.REG","Sales.HOUREG.OBJSHOWHOUREG:REPORT","SALES.HOUSOLE.QUERYLIST","SALES.HOUSOLE.QUERYLIST","Sales.HOUREG.SHOWHOUREG","Sales.ctpost.ADDEMPIDPROID:Add","SALES.HOUREG.MYREG:LIST","SALES","sales.POOLHOULIST","sales.OPPTHOULIST","sales.HOUADV","sales.HOUROLE","SALES.CUSTMGR","SALES.HOUKEY.BORROWKEY:ADD","SALES.HOUKEY.BORROWKEY:BORROW","SALES.HOUKEY.BORROWKEY:REPORT","SALES.HOUEXPL.EXPLLIST:ADD","SALES.HOUEXPL.EXPLOBJ:REPORT","SALES.HOUEXPL.EXPLOBJ:SUBMIT","SALES.CUSTOMER.VOICE","SALES.HOUSE.HOUSEEDIT:OPER","SALES.CUST.TRACKRADIO","SALES.CUST.MYPOTEN:PLAYPUBLIC","SALES.CUSTARCHIVE.CUST:RECEIVE","sales.ADDHOUSENEW","ctm.Querry.QuerryAll","ctm.ReceiptList","SALES.HOU.GROUPFAVOR","SALES.CTPOST.AGENCYLIST","SALES.CTPOST.AGENCYHOME","SALES.TRACK.RECORD","sales.REPORT.CENTALINECALL","sales.REPORT.TOCALRECORDINGSH","sales.REPORT.TOOTHERLINE","SALES.PHONE.INVALID","SALES.HOUTRACK.HISTORY:VIEW","sales.CUSTOMER","sales.HOUKEY","sales.HOUSE","sales.SELL","SALES.CUSTOMER.SEE","SALES.CSTOMER.SEE:INSER","SALES.CUSTOMER.SEE:LOOK","SALES.HOUPOOL.LINGY:LINGY","SALES.HOUNORMAL","SALES.HOUNORMAL.ADD","ctm.PayList","ctm.GatherCommissionList","ctm.BackCommissionList","ctm.achieve.EarnestReport","SALES.LOOKONLINE:MYONLINELIST","SALES.DICTIONARY","sales.newestatedictionary","SALES.APP.MYCUSTOMER","SALES.APP.CMCASELIST","SALES.APP.HOUFAVOR","SALES.APP.GROUPFAVOR","SALES.APP.GROUPPOTENCUST","ctm.Edesk.Processed","ctm.Edesk.ProcessFinished","SALES.HOUREG.WATING.LIST","SALES.APP.LOOKONLINE","SALES.APP.LOOKONLINE","SALES.HOUREG.HOUREGCACEL","ctm.achieve.EarnestChange","SALES.APP.MOBILE","SALES.APP.HOUADVLIST","SALES.APP.SHOWCUSTIMPORT","SALES.APP.CMCUSTLIST","SALES.APP.OTHER","SALES.APP.CUSTLOOKPLAN","SALES.APP.HOUKEYLIST","SALES.APP.DOWNRECORD","SALES.APP.RICHSCAN","SALES.APP.REMINDER","SALES.APP.LOGINOUT","SALES.APP.HOUPOOLLIST","SALES.HOUREG.HOUREGFILEAUTH","SALES.CUSTARCHIVE","SALES.HOUSEPHONE.HISTORY","ctm-web","ctm.Achieve","ctm.case","ctm.Commission","ctm.Edesk","ctm.Querry","ctm.gatherpay","ctm.NewCase","ctm.Edesk.Process"],"realName":"秦琦","roles":["RWYGW"],"serviceCompanyAddress":"虹口区临平路68号","serviceCompanyCode":"033J949","serviceCompanyFax":"55580892","serviceCompanyId":"4665ace96b3a4b96986b47d77aba42bc","serviceCompanyName":"瑞虹二店5组","serviceCompanyPhone":"51787707","serviceDepAddress":"虹口区临平路68号","serviceDepCode":"033J949","serviceDepFax":"55580892","serviceDepHierarchy":"BUSIGRP","serviceDepId":"4665ace96b3a4b96986b47d77aba42bc","serviceDepName":"瑞虹二店5组","serviceDepOrgType":"DEP","serviceDepPhone":"51787707","serviceDepType":"BUSI","serviceJobCode":"JWYGW","serviceJobId":"402809224db41ad5014db42a53290033","serviceJobName":"物业顾问","ssoSessionId":"8ecae128-1882-4817-8ff6-27eea1236120-APP-sales-tomcat","username":"qinqi02"}}
     * empId : 3B7A66423D294203ADE590D0E4DE8E06
     * isSuccess : true
     * msg : 登录成功
     * token : 9fd5b577f6c04b85984b2c61452a6b93
     * tokenExpDate : 1484109137163
     */

    private String empId;
    private boolean isSuccess;
    private String msg;
    private String token;
    private long tokenExpDate;

    public ContentBean getContent() {
        return content;
    }

    public void setContent(ContentBean content) {
        this.content = content;
    }

    public String getEmpId() {
        return empId;
    }

    public void setEmpId(String empId) {
        this.empId = empId;
    }

    public boolean isIsSuccess() {
        return isSuccess;
    }

    public void setIsSuccess(boolean isSuccess) {
        this.isSuccess = isSuccess;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public long getTokenExpDate() {
        return tokenExpDate;
    }

    public void setTokenExpDate(long tokenExpDate) {
        this.tokenExpDate = tokenExpDate;
    }

    public static class ContentBean {
        private String avatarUrl;
        private int ismultiJob;
        /**
         * adminOrg : 4665ace96b3a4b96986b47d77aba42bc
         * busiarId : 78d72e4e880f4cb0a2cd116a27ecc78e
         * busibaId : BA378B64CE8045318B8177B0C96CE192
         * busigrpId : 4665ace96b3a4b96986b47d77aba42bc
         * busiswzId : 351DB28DF786498E8E601CBFC622682D
         * busiwzId : 32348D46E2FA42C2B19FEBABF5CDE359
         * email : qinqi02@centaline.com.cn
         * employeeCode : AA63817
         * employeeType : REGU
         * id : 3B7A66423D294203ADE590D0E4DE8E06
         * menuList : [{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[{"children":[{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUADVLIST","icon":"","id":"ff80808157416b8d01574fcc39f9005e","menuName":"有效房源","orderby":"1","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fbc44c20058","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUADVLIST","resourceName":"有效房源","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUPOOLLIST","icon":"","id":"ff80808157416b8d01574fdca2890067","menuName":"公房","orderby":"2","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fdbc7f50064","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUPOOLLIST","resourceName":"公房","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.CMCASELIST","icon":"","id":"ff80808157416b8d01574fe04020006d","menuName":"我的房源","orderby":"3","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fdf8a28006a","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.CMCASELIST","resourceName":"我的房源","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUFAVOR","icon":"","id":"ff80808157416b8d0157507d6320007e","menuName":"我的收藏","orderby":"8","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157500de51b0078","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUFAVOR","resourceName":"我的收藏","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.GROUPFAVOR","icon":"","id":"ff80808157416b8d0157507e443c0081","menuName":"店组收藏","orderby":"9","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157500ef1f7007b","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.GROUPFAVOR","resourceName":"店组收藏","url":""},"target":"","type":"MEN","url":""}],"code":"SALES.APP.HOUMGR","icon":"","id":"ff808081577014cc0157702709430003","menuName":"房源","orderby":"1","parentId":"ff80808157416b8d01574fcade1b005b","parentIds":"ff80808157416b8d01574fcade1b005b,","target":"","type":"MDL"},{"children":[{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.MYCUSTOMER","icon":"","id":"ff80808157416b8d0157508076bf0087","menuName":"我的客户","orderby":"1","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fd2c9240061","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.MYCUSTOMER","resourceName":"我的客户","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.CMCUSTLIST","icon":"","id":"ff80808157416b8d0157508332100096","menuName":"公客","orderby":"12","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01575082c9360093","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.CMCUSTLIST","resourceName":"公客","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.GROUPPOTENCUST","icon":"","id":"ff80808157416b8d01575081172d008a","menuName":"我的潜客","orderby":"2","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157507fc4000084","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.GROUPPOTENCUST","resourceName":"我的潜客","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.LOOKONLINE","icon":"","id":"ff80808158860ab501588ffbc34d0050","menuName":"网上约看","orderby":"3","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808158860ab501588ff12d62004d","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.LOOKONLINE","resourceName":"网上约看","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.SHOWCUSTIMPORT","icon":"","id":"ff80808157416b8d0157508229e60090","menuName":"我的导入客","orderby":"7","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01575081bf47008d","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.SHOWCUSTIMPORT","resourceName":"我的导入客","url":""},"target":"","type":"MEN","url":""}],"code":"SALES.APP.CUSTMGR","icon":"","id":"ff808081577014cc0157702668e70000","menuName":"客源","orderby":"2","parentId":"ff80808157416b8d01574fcade1b005b","parentIds":"ff80808157416b8d01574fcade1b005b,","target":"","type":"MDL"},{"children":[{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.CUSTLOOKPLAN","icon":"","id":"ff80808157416b8d015750860069009f","menuName":"我的约看","orderby":"1","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508596a2009c","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.CUSTLOOKPLAN","resourceName":"我的约看","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUKEYLIST","icon":"","id":"ff80808157416b8d01575086f2d400a5","menuName":"钥匙管理","orderby":"4","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01575086775b00a2","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.HOUKEYLIST","resourceName":"钥匙管理","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.DOWNRECORD","icon":"","id":"ff80808157416b8d01575087ef5900ab","menuName":"已下载录音","orderby":"5","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508776ff00a8","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.DOWNRECORD","resourceName":"已下载录音","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.RICHSCAN","icon":"","id":"ff80808157416b8d01575089daf400b1","menuName":"扫一扫","orderby":"6","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508848ca00ae","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.RICHSCAN","resourceName":"扫一扫","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.REMINDER","icon":"","id":"ff80808157416b8d0157508ad1ba00b7","menuName":"我的提醒","orderby":"7","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508a66d700b4","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.REMINDER","resourceName":"我的提醒","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.LOGINOUT","icon":"","id":"ff80808157416b8d0157508b985700bd","menuName":"退出登录","orderby":"8","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508b3b7d00ba","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.LOGINOUT","resourceName":"退出登录","url":""},"target":"","type":"MEN","url":""}],"code":"SALES.APP.OTHER","icon":"","id":"ff808081577014cc01577028aee40006","menuName":"其他","orderby":"3","parentId":"ff80808157416b8d01574fcade1b005b","parentIds":"ff80808157416b8d01574fcade1b005b,","target":"","type":"MDL"}],"code":"SALES.APP.MOBILE","icon":"icon-user","id":"ff80808157416b8d01574fcade1b005b","menuName":"三级市场APP","orderby":"0090","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"8a84811c4d6cc498014d6cc681520000","resourceCode":"SALES","resourceName":"三级市场销售平台","url":""},"target":"","type":"APP","url":""}]
         * mobile : 13601631397
         * permissions : ["RWYGW","SALES.HOUTRACK","SALES.CUSTOMER.TOCUSTOMERADD:UPDATE","SALES.CUSTOMERDEL","SALES.CUST.CUSTOMERDEL:LOOK","SALES.CUST.CUSTOMERDEL:UPDATE","SALES.CUST.CUSTOMERDEL:DELETE","sales.REPORT.EMPWORKLOAD","sales.REPORT.EMPHOUTRACKTYPE","SALES.HOUTRACK.LIST:ADD","SALES.HOUSE.HOUSECONTACT:OPER","SALES.BORROWKEYLIST","SALES.SHOWCUSTIMPORT","SALES.CMCUSTLIST.CUST:DETAIL","SALES.CUSTOMER.TOCUSTOMERADD:DELETE","SALES.HOUEXPL.EXPLOBJ:OPER","uam.userorg.user:add","SALES.CUSTLOOKS","SALES.CUSTOMER.MYCUST:LOOK","SALES.CUSTOMER.MYCUST:NOUSE","SALES.CUSTOMER.TOCUSTOMERADD:ADDDEL","SALES.HOUSE.OBJECTION:AR","sales.MYCUSTLIST","salse.MYCUST","sales.CMCUSTLIST","salse.MYCUSTOMER","sales.CUSTDELADD","sales.HOU","sales.HOUADVLIST","SALES.PERSONAL.WORKINGTABLE","SALES.HOUSE.ADDHOUSELIANJIE","SALES.HOUTRACK.LIST:LIST","SALES.HOUKEY.GRPKEY:REPORT","sales.cust.mycustlook","sales.MYKEYLIST","SALES.HOUMGR.HOUSE","sales.ADDHOUSE","sales.PERSONALWORKING","Sales.ctpost.EMPIDPROID","sales.HOUDCPLIST","SALES.HOUDETAIL.ROOMNB","SALES.HOULIST.ROOMNB","SALES.HOUSE.HOUSEACTIVETOR","SALES.CUSTTRACK","SALES.CUSTTRACK.MYTRACK:LIST","sales.MYHOUSEEXPL","SALES.CUSTOMER.POTEN:NOUSE","SALES.CUSTOMER.MYCUST:setVip","SALES.CUSTTRACK.HISTORY","SALES.HOUSOLE","SALES.HOUSOLE.ADD","sales.HOUKEYLIST2","SALES.HOUKEY.MYKEY:RETURN","SALES.HOUKEY.GRPKEY:CONFIRM","SALES.HOUKEY.MYKEY:BACK","SALES.CMCUSTLIST.CUST:GETCUST","SALES.HOUTRACK.MYTRACK:LIST","SALES.HOUSE.HOUSEADD:ADD","sales.CUSTLOOKPLAN","SALES.HOUEXCL.MYEXCL:LIST","SALES.HOUMGR","SALES.CUSTOMER.MYCUST:PUBLIC","sales.REPORT.CUSTAMOUNT","SALES.CUST.MYPOTEN:SETVIP","sales.HOUPOOLLIST","SALES.CUSTOMER.MYCUST:LOOKABOUT","SALES.CUSTOMER.POTENCUST:LOOK","SALES.CUSTOMER.TOCUSTDELADD:ADD","SALES.CUSTOMER.TOCUSTDELADD:SUBMIT","SALES.CUSTOMER.TOCUSTDELADD:ADDCUST","SALES.CUST.CUSTOMERDEL:ERFER","SALES.CUST.CUSTOMERDEL:INSER","SALES.CUSTOMER.TRACK","SALES.CUST.TRACK.INSER","SALES.CUST.TRACK:LOOK","SALES.CUST.TRACK.INSERPUBLI","Sales.HOUREG.ADDSHOWHOUREG:Add","SALES.REG","Sales.HOUREG.OBJSHOWHOUREG:REPORT","SALES.HOUSOLE.QUERYLIST","SALES.HOUSOLE.QUERYLIST","Sales.HOUREG.SHOWHOUREG","Sales.ctpost.ADDEMPIDPROID:Add","SALES.HOUREG.MYREG:LIST","SALES","sales.POOLHOULIST","sales.OPPTHOULIST","sales.HOUADV","sales.HOUROLE","SALES.CUSTMGR","SALES.HOUKEY.BORROWKEY:ADD","SALES.HOUKEY.BORROWKEY:BORROW","SALES.HOUKEY.BORROWKEY:REPORT","SALES.HOUEXPL.EXPLLIST:ADD","SALES.HOUEXPL.EXPLOBJ:REPORT","SALES.HOUEXPL.EXPLOBJ:SUBMIT","SALES.CUSTOMER.VOICE","SALES.HOUSE.HOUSEEDIT:OPER","SALES.CUST.TRACKRADIO","SALES.CUST.MYPOTEN:PLAYPUBLIC","SALES.CUSTARCHIVE.CUST:RECEIVE","sales.ADDHOUSENEW","ctm.Querry.QuerryAll","ctm.ReceiptList","SALES.HOU.GROUPFAVOR","SALES.CTPOST.AGENCYLIST","SALES.CTPOST.AGENCYHOME","SALES.TRACK.RECORD","sales.REPORT.CENTALINECALL","sales.REPORT.TOCALRECORDINGSH","sales.REPORT.TOOTHERLINE","SALES.PHONE.INVALID","SALES.HOUTRACK.HISTORY:VIEW","sales.CUSTOMER","sales.HOUKEY","sales.HOUSE","sales.SELL","SALES.CUSTOMER.SEE","SALES.CSTOMER.SEE:INSER","SALES.CUSTOMER.SEE:LOOK","SALES.HOUPOOL.LINGY:LINGY","SALES.HOUNORMAL","SALES.HOUNORMAL.ADD","ctm.PayList","ctm.GatherCommissionList","ctm.BackCommissionList","ctm.achieve.EarnestReport","SALES.LOOKONLINE:MYONLINELIST","SALES.DICTIONARY","sales.newestatedictionary","SALES.APP.MYCUSTOMER","SALES.APP.CMCASELIST","SALES.APP.HOUFAVOR","SALES.APP.GROUPFAVOR","SALES.APP.GROUPPOTENCUST","ctm.Edesk.Processed","ctm.Edesk.ProcessFinished","SALES.HOUREG.WATING.LIST","SALES.APP.LOOKONLINE","SALES.APP.LOOKONLINE","SALES.HOUREG.HOUREGCACEL","ctm.achieve.EarnestChange","SALES.APP.MOBILE","SALES.APP.HOUADVLIST","SALES.APP.SHOWCUSTIMPORT","SALES.APP.CMCUSTLIST","SALES.APP.OTHER","SALES.APP.CUSTLOOKPLAN","SALES.APP.HOUKEYLIST","SALES.APP.DOWNRECORD","SALES.APP.RICHSCAN","SALES.APP.REMINDER","SALES.APP.LOGINOUT","SALES.APP.HOUPOOLLIST","SALES.HOUREG.HOUREGFILEAUTH","SALES.CUSTARCHIVE","SALES.HOUSEPHONE.HISTORY","ctm-web","ctm.Achieve","ctm.case","ctm.Commission","ctm.Edesk","ctm.Querry","ctm.gatherpay","ctm.NewCase","ctm.Edesk.Process"]
         * realName : 秦琦
         * roles : ["RWYGW"]
         * serviceCompanyAddress : 虹口区临平路68号
         * serviceCompanyCode : 033J949
         * serviceCompanyFax : 55580892
         * serviceCompanyId : 4665ace96b3a4b96986b47d77aba42bc
         * serviceCompanyName : 瑞虹二店5组
         * serviceCompanyPhone : 51787707
         * serviceDepAddress : 虹口区临平路68号
         * serviceDepCode : 033J949
         * serviceDepFax : 55580892
         * serviceDepHierarchy : BUSIGRP
         * serviceDepId : 4665ace96b3a4b96986b47d77aba42bc
         * serviceDepName : 瑞虹二店5组
         * serviceDepOrgType : DEP
         * serviceDepPhone : 51787707
         * serviceDepType : BUSI
         * serviceJobCode : JWYGW
         * serviceJobId : 402809224db41ad5014db42a53290033
         * serviceJobName : 物业顾问
         * ssoSessionId : 8ecae128-1882-4817-8ff6-27eea1236120-APP-sales-tomcat
         * username : qinqi02
         */

        private SessionUserBean sessionUser;

        public String getAvatarUrl() {
            return avatarUrl;
        }

        public void setAvatarUrl(String avatarUrl) {
            this.avatarUrl = avatarUrl;
        }

        public int getIsmultiJob() {
            return ismultiJob;
        }

        public void setIsmultiJob(int ismultiJob) {
            this.ismultiJob = ismultiJob;
        }

        public SessionUserBean getSessionUser() {
            return sessionUser;
        }

        public void setSessionUser(SessionUserBean sessionUser) {
            this.sessionUser = sessionUser;
        }

        public static class SessionUserBean {
            private String adminOrg;
            private String busiarId;
            private String busibaId;
            private String busigrpId;
            private String busiswzId;
            private String busiwzId;
            private String email;
            private String employeeCode;
            private String employeeType;
            private String id;
            private String mobile;
            private String realName;
            private String serviceCompanyAddress;
            private String serviceCompanyCode;
            private String serviceCompanyFax;
            private String serviceCompanyId;
            private String serviceCompanyName;
            private String serviceCompanyPhone;
            private String serviceDepAddress;
            private String serviceDepCode;
            private String serviceDepFax;
            private String serviceDepHierarchy;
            private String serviceDepId;
            private String serviceDepName;
            private String serviceDepOrgType;
            private String serviceDepPhone;
            private String serviceDepType;
            private String serviceJobCode;
            private String serviceJobId;
            private String serviceJobName;
            private String ssoSessionId;
            private String username;
            /**
             * absoluteUrl : http://sales.centaline.com:8082/sales-web
             * children : [{"children":[{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUADVLIST","icon":"","id":"ff80808157416b8d01574fcc39f9005e","menuName":"有效房源","orderby":"1","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fbc44c20058","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUADVLIST","resourceName":"有效房源","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUPOOLLIST","icon":"","id":"ff80808157416b8d01574fdca2890067","menuName":"公房","orderby":"2","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fdbc7f50064","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUPOOLLIST","resourceName":"公房","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.CMCASELIST","icon":"","id":"ff80808157416b8d01574fe04020006d","menuName":"我的房源","orderby":"3","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fdf8a28006a","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.CMCASELIST","resourceName":"我的房源","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUFAVOR","icon":"","id":"ff80808157416b8d0157507d6320007e","menuName":"我的收藏","orderby":"8","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157500de51b0078","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUFAVOR","resourceName":"我的收藏","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.GROUPFAVOR","icon":"","id":"ff80808157416b8d0157507e443c0081","menuName":"店组收藏","orderby":"9","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157500ef1f7007b","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.GROUPFAVOR","resourceName":"店组收藏","url":""},"target":"","type":"MEN","url":""}],"code":"SALES.APP.HOUMGR","icon":"","id":"ff808081577014cc0157702709430003","menuName":"房源","orderby":"1","parentId":"ff80808157416b8d01574fcade1b005b","parentIds":"ff80808157416b8d01574fcade1b005b,","target":"","type":"MDL"},{"children":[{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.MYCUSTOMER","icon":"","id":"ff80808157416b8d0157508076bf0087","menuName":"我的客户","orderby":"1","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fd2c9240061","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.MYCUSTOMER","resourceName":"我的客户","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.CMCUSTLIST","icon":"","id":"ff80808157416b8d0157508332100096","menuName":"公客","orderby":"12","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01575082c9360093","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.CMCUSTLIST","resourceName":"公客","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.GROUPPOTENCUST","icon":"","id":"ff80808157416b8d01575081172d008a","menuName":"我的潜客","orderby":"2","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157507fc4000084","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.GROUPPOTENCUST","resourceName":"我的潜客","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.LOOKONLINE","icon":"","id":"ff80808158860ab501588ffbc34d0050","menuName":"网上约看","orderby":"3","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808158860ab501588ff12d62004d","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.LOOKONLINE","resourceName":"网上约看","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.SHOWCUSTIMPORT","icon":"","id":"ff80808157416b8d0157508229e60090","menuName":"我的导入客","orderby":"7","parentId":"ff808081577014cc0157702668e70000","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702668e70000,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01575081bf47008d","parentId":"ff80808157416b8d01574fb91ad90055","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb91ad90055,","resourceCode":"SALES.APP.SHOWCUSTIMPORT","resourceName":"我的导入客","url":""},"target":"","type":"MEN","url":""}],"code":"SALES.APP.CUSTMGR","icon":"","id":"ff808081577014cc0157702668e70000","menuName":"客源","orderby":"2","parentId":"ff80808157416b8d01574fcade1b005b","parentIds":"ff80808157416b8d01574fcade1b005b,","target":"","type":"MDL"},{"children":[{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.CUSTLOOKPLAN","icon":"","id":"ff80808157416b8d015750860069009f","menuName":"我的约看","orderby":"1","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508596a2009c","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.CUSTLOOKPLAN","resourceName":"我的约看","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUKEYLIST","icon":"","id":"ff80808157416b8d01575086f2d400a5","menuName":"钥匙管理","orderby":"4","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01575086775b00a2","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.HOUKEYLIST","resourceName":"钥匙管理","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.DOWNRECORD","icon":"","id":"ff80808157416b8d01575087ef5900ab","menuName":"已下载录音","orderby":"5","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508776ff00a8","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.DOWNRECORD","resourceName":"已下载录音","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.RICHSCAN","icon":"","id":"ff80808157416b8d01575089daf400b1","menuName":"扫一扫","orderby":"6","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508848ca00ae","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.RICHSCAN","resourceName":"扫一扫","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.REMINDER","icon":"","id":"ff80808157416b8d0157508ad1ba00b7","menuName":"我的提醒","orderby":"7","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508a66d700b4","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.REMINDER","resourceName":"我的提醒","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.LOGINOUT","icon":"","id":"ff80808157416b8d0157508b985700bd","menuName":"退出登录","orderby":"8","parentId":"ff808081577014cc01577028aee40006","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc01577028aee40006,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157508b3b7d00ba","parentId":"ff80808157416b8d01575084ed600099","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01575084ed600099,","resourceCode":"SALES.APP.LOGINOUT","resourceName":"退出登录","url":""},"target":"","type":"MEN","url":""}],"code":"SALES.APP.OTHER","icon":"","id":"ff808081577014cc01577028aee40006","menuName":"其他","orderby":"3","parentId":"ff80808157416b8d01574fcade1b005b","parentIds":"ff80808157416b8d01574fcade1b005b,","target":"","type":"MDL"}]
             * code : SALES.APP.MOBILE
             * icon : icon-user
             * id : ff80808157416b8d01574fcade1b005b
             * menuName : 三级市场APP
             * orderby : 0090
             * resource : {"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"8a84811c4d6cc498014d6cc681520000","resourceCode":"SALES","resourceName":"三级市场销售平台","url":""}
             * target :
             * type : APP
             * url :
             */

            private List<MenuListBean> menuList;
            private List<String> permissions;
            private List<String> roles;

            public String getAdminOrg() {
                return adminOrg;
            }

            public void setAdminOrg(String adminOrg) {
                this.adminOrg = adminOrg;
            }

            public String getBusiarId() {
                return busiarId;
            }

            public void setBusiarId(String busiarId) {
                this.busiarId = busiarId;
            }

            public String getBusibaId() {
                return busibaId;
            }

            public void setBusibaId(String busibaId) {
                this.busibaId = busibaId;
            }

            public String getBusigrpId() {
                return busigrpId;
            }

            public void setBusigrpId(String busigrpId) {
                this.busigrpId = busigrpId;
            }

            public String getBusiswzId() {
                return busiswzId;
            }

            public void setBusiswzId(String busiswzId) {
                this.busiswzId = busiswzId;
            }

            public String getBusiwzId() {
                return busiwzId;
            }

            public void setBusiwzId(String busiwzId) {
                this.busiwzId = busiwzId;
            }

            public String getEmail() {
                return email;
            }

            public void setEmail(String email) {
                this.email = email;
            }

            public String getEmployeeCode() {
                return employeeCode;
            }

            public void setEmployeeCode(String employeeCode) {
                this.employeeCode = employeeCode;
            }

            public String getEmployeeType() {
                return employeeType;
            }

            public void setEmployeeType(String employeeType) {
                this.employeeType = employeeType;
            }

            public String getId() {
                return id;
            }

            public void setId(String id) {
                this.id = id;
            }

            public String getMobile() {
                return mobile;
            }

            public void setMobile(String mobile) {
                this.mobile = mobile;
            }

            public String getRealName() {
                return realName;
            }

            public void setRealName(String realName) {
                this.realName = realName;
            }

            public String getServiceCompanyAddress() {
                return serviceCompanyAddress;
            }

            public void setServiceCompanyAddress(String serviceCompanyAddress) {
                this.serviceCompanyAddress = serviceCompanyAddress;
            }

            public String getServiceCompanyCode() {
                return serviceCompanyCode;
            }

            public void setServiceCompanyCode(String serviceCompanyCode) {
                this.serviceCompanyCode = serviceCompanyCode;
            }

            public String getServiceCompanyFax() {
                return serviceCompanyFax;
            }

            public void setServiceCompanyFax(String serviceCompanyFax) {
                this.serviceCompanyFax = serviceCompanyFax;
            }

            public String getServiceCompanyId() {
                return serviceCompanyId;
            }

            public void setServiceCompanyId(String serviceCompanyId) {
                this.serviceCompanyId = serviceCompanyId;
            }

            public String getServiceCompanyName() {
                return serviceCompanyName;
            }

            public void setServiceCompanyName(String serviceCompanyName) {
                this.serviceCompanyName = serviceCompanyName;
            }

            public String getServiceCompanyPhone() {
                return serviceCompanyPhone;
            }

            public void setServiceCompanyPhone(String serviceCompanyPhone) {
                this.serviceCompanyPhone = serviceCompanyPhone;
            }

            public String getServiceDepAddress() {
                return serviceDepAddress;
            }

            public void setServiceDepAddress(String serviceDepAddress) {
                this.serviceDepAddress = serviceDepAddress;
            }

            public String getServiceDepCode() {
                return serviceDepCode;
            }

            public void setServiceDepCode(String serviceDepCode) {
                this.serviceDepCode = serviceDepCode;
            }

            public String getServiceDepFax() {
                return serviceDepFax;
            }

            public void setServiceDepFax(String serviceDepFax) {
                this.serviceDepFax = serviceDepFax;
            }

            public String getServiceDepHierarchy() {
                return serviceDepHierarchy;
            }

            public void setServiceDepHierarchy(String serviceDepHierarchy) {
                this.serviceDepHierarchy = serviceDepHierarchy;
            }

            public String getServiceDepId() {
                return serviceDepId;
            }

            public void setServiceDepId(String serviceDepId) {
                this.serviceDepId = serviceDepId;
            }

            public String getServiceDepName() {
                return serviceDepName;
            }

            public void setServiceDepName(String serviceDepName) {
                this.serviceDepName = serviceDepName;
            }

            public String getServiceDepOrgType() {
                return serviceDepOrgType;
            }

            public void setServiceDepOrgType(String serviceDepOrgType) {
                this.serviceDepOrgType = serviceDepOrgType;
            }

            public String getServiceDepPhone() {
                return serviceDepPhone;
            }

            public void setServiceDepPhone(String serviceDepPhone) {
                this.serviceDepPhone = serviceDepPhone;
            }

            public String getServiceDepType() {
                return serviceDepType;
            }

            public void setServiceDepType(String serviceDepType) {
                this.serviceDepType = serviceDepType;
            }

            public String getServiceJobCode() {
                return serviceJobCode;
            }

            public void setServiceJobCode(String serviceJobCode) {
                this.serviceJobCode = serviceJobCode;
            }

            public String getServiceJobId() {
                return serviceJobId;
            }

            public void setServiceJobId(String serviceJobId) {
                this.serviceJobId = serviceJobId;
            }

            public String getServiceJobName() {
                return serviceJobName;
            }

            public void setServiceJobName(String serviceJobName) {
                this.serviceJobName = serviceJobName;
            }

            public String getSsoSessionId() {
                return ssoSessionId;
            }

            public void setSsoSessionId(String ssoSessionId) {
                this.ssoSessionId = ssoSessionId;
            }

            public String getUsername() {
                return username;
            }

            public void setUsername(String username) {
                this.username = username;
            }

            public List<MenuListBean> getMenuList() {
                return menuList;
            }

            public void setMenuList(List<MenuListBean> menuList) {
                this.menuList = menuList;
            }

            public List<String> getPermissions() {
                return permissions;
            }

            public void setPermissions(List<String> permissions) {
                this.permissions = permissions;
            }

            public List<String> getRoles() {
                return roles;
            }

            public void setRoles(List<String> roles) {
                this.roles = roles;
            }

            public static class MenuListBean {
                private String absoluteUrl;
                private String code;
                private String icon;
                private String id;
                private String menuName;
                private String orderby;
                /**
                 * absoluteUrl : http://sales.centaline.com:8082/sales-web
                 * app : {"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"}
                 * id : 8a84811c4d6cc498014d6cc681520000
                 * resourceCode : SALES
                 * resourceName : 三级市场销售平台
                 * url :
                 */

                private ResourceBean resource;
                private String target;
                private String type;
                private String url;
                /**
                 * children : [{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUADVLIST","icon":"","id":"ff80808157416b8d01574fcc39f9005e","menuName":"有效房源","orderby":"1","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fbc44c20058","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUADVLIST","resourceName":"有效房源","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUPOOLLIST","icon":"","id":"ff80808157416b8d01574fdca2890067","menuName":"公房","orderby":"2","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fdbc7f50064","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUPOOLLIST","resourceName":"公房","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.CMCASELIST","icon":"","id":"ff80808157416b8d01574fe04020006d","menuName":"我的房源","orderby":"3","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fdf8a28006a","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.CMCASELIST","resourceName":"我的房源","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.HOUFAVOR","icon":"","id":"ff80808157416b8d0157507d6320007e","menuName":"我的收藏","orderby":"8","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157500de51b0078","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUFAVOR","resourceName":"我的收藏","url":""},"target":"","type":"MEN","url":""},{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","children":[],"code":"SALES.APP.GROUPFAVOR","icon":"","id":"ff80808157416b8d0157507e443c0081","menuName":"店组收藏","orderby":"9","parentId":"ff808081577014cc0157702709430003","parentIds":"ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,","resource":{"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d0157500ef1f7007b","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.GROUPFAVOR","resourceName":"店组收藏","url":""},"target":"","type":"MEN","url":""}]
                 * code : SALES.APP.HOUMGR
                 * icon :
                 * id : ff808081577014cc0157702709430003
                 * menuName : 房源
                 * orderby : 1
                 * parentId : ff80808157416b8d01574fcade1b005b
                 * parentIds : ff80808157416b8d01574fcade1b005b,
                 * target :
                 * type : MDL
                 */

                private List<ChildrenBean> children;

                public String getAbsoluteUrl() {
                    return absoluteUrl;
                }

                public void setAbsoluteUrl(String absoluteUrl) {
                    this.absoluteUrl = absoluteUrl;
                }

                public String getCode() {
                    return code;
                }

                public void setCode(String code) {
                    this.code = code;
                }

                public String getIcon() {
                    return icon;
                }

                public void setIcon(String icon) {
                    this.icon = icon;
                }

                public String getId() {
                    return id;
                }

                public void setId(String id) {
                    this.id = id;
                }

                public String getMenuName() {
                    return menuName;
                }

                public void setMenuName(String menuName) {
                    this.menuName = menuName;
                }

                public String getOrderby() {
                    return orderby;
                }

                public void setOrderby(String orderby) {
                    this.orderby = orderby;
                }

                public ResourceBean getResource() {
                    return resource;
                }

                public void setResource(ResourceBean resource) {
                    this.resource = resource;
                }

                public String getTarget() {
                    return target;
                }

                public void setTarget(String target) {
                    this.target = target;
                }

                public String getType() {
                    return type;
                }

                public void setType(String type) {
                    this.type = type;
                }

                public String getUrl() {
                    return url;
                }

                public void setUrl(String url) {
                    this.url = url;
                }

                public List<ChildrenBean> getChildren() {
                    return children;
                }

                public void setChildren(List<ChildrenBean> children) {
                    this.children = children;
                }

                public static class ResourceBean {
                    private String absoluteUrl;
                    /**
                     * appCname : 三级市场销售平台
                     * appKey : sales-web
                     * appName : sales-web
                     * appSecret : sales-web
                     * domain : centaline.com
                     * host : sales.centaline.com
                     * id : ff8080814a7f5f02014a7f93b4d20008
                     * orderby : 24
                     * port : 8082
                     * schemas : http
                     * webContext : /sales-web
                     */

                    private AppBean app;
                    private String id;
                    private String resourceCode;
                    private String resourceName;
                    private String url;

                    public String getAbsoluteUrl() {
                        return absoluteUrl;
                    }

                    public void setAbsoluteUrl(String absoluteUrl) {
                        this.absoluteUrl = absoluteUrl;
                    }

                    public AppBean getApp() {
                        return app;
                    }

                    public void setApp(AppBean app) {
                        this.app = app;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getResourceCode() {
                        return resourceCode;
                    }

                    public void setResourceCode(String resourceCode) {
                        this.resourceCode = resourceCode;
                    }

                    public String getResourceName() {
                        return resourceName;
                    }

                    public void setResourceName(String resourceName) {
                        this.resourceName = resourceName;
                    }

                    public String getUrl() {
                        return url;
                    }

                    public void setUrl(String url) {
                        this.url = url;
                    }

                    public static class AppBean {
                        private String appCname;
                        private String appKey;
                        private String appName;
                        private String appSecret;
                        private String domain;
                        private String host;
                        private String id;
                        private String orderby;
                        private int port;
                        private String schemas;
                        private String webContext;

                        public String getAppCname() {
                            return appCname;
                        }

                        public void setAppCname(String appCname) {
                            this.appCname = appCname;
                        }

                        public String getAppKey() {
                            return appKey;
                        }

                        public void setAppKey(String appKey) {
                            this.appKey = appKey;
                        }

                        public String getAppName() {
                            return appName;
                        }

                        public void setAppName(String appName) {
                            this.appName = appName;
                        }

                        public String getAppSecret() {
                            return appSecret;
                        }

                        public void setAppSecret(String appSecret) {
                            this.appSecret = appSecret;
                        }

                        public String getDomain() {
                            return domain;
                        }

                        public void setDomain(String domain) {
                            this.domain = domain;
                        }

                        public String getHost() {
                            return host;
                        }

                        public void setHost(String host) {
                            this.host = host;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }

                        public String getOrderby() {
                            return orderby;
                        }

                        public void setOrderby(String orderby) {
                            this.orderby = orderby;
                        }

                        public int getPort() {
                            return port;
                        }

                        public void setPort(int port) {
                            this.port = port;
                        }

                        public String getSchemas() {
                            return schemas;
                        }

                        public void setSchemas(String schemas) {
                            this.schemas = schemas;
                        }

                        public String getWebContext() {
                            return webContext;
                        }

                        public void setWebContext(String webContext) {
                            this.webContext = webContext;
                        }
                    }
                }

                public static class ChildrenBean {
                    private String code;
                    private String icon;
                    private String id;
                    private String menuName;
                    private String orderby;
                    private String parentId;
                    private String parentIds;
                    private String target;
                    private String type;
                    /**
                     * absoluteUrl : http://sales.centaline.com:8082/sales-web
                     * children : []
                     * code : SALES.APP.HOUADVLIST
                     * icon :
                     * id : ff80808157416b8d01574fcc39f9005e
                     * menuName : 有效房源
                     * orderby : 1
                     * parentId : ff808081577014cc0157702709430003
                     * parentIds : ff80808157416b8d01574fcade1b005b,ff808081577014cc0157702709430003,
                     * resource : {"absoluteUrl":"http://sales.centaline.com:8082/sales-web","app":{"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"},"id":"ff80808157416b8d01574fbc44c20058","parentId":"ff80808157416b8d01574fb873940052","parentIds":"8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,","resourceCode":"SALES.APP.HOUADVLIST","resourceName":"有效房源","url":""}
                     * target :
                     * type : MEN
                     * url :
                     */

                    private List<ChildrenBean2> children;

                    public String getCode() {
                        return code;
                    }

                    public void setCode(String code) {
                        this.code = code;
                    }

                    public String getIcon() {
                        return icon;
                    }

                    public void setIcon(String icon) {
                        this.icon = icon;
                    }

                    public String getId() {
                        return id;
                    }

                    public void setId(String id) {
                        this.id = id;
                    }

                    public String getMenuName() {
                        return menuName;
                    }

                    public void setMenuName(String menuName) {
                        this.menuName = menuName;
                    }

                    public String getOrderby() {
                        return orderby;
                    }

                    public void setOrderby(String orderby) {
                        this.orderby = orderby;
                    }

                    public String getParentId() {
                        return parentId;
                    }

                    public void setParentId(String parentId) {
                        this.parentId = parentId;
                    }

                    public String getParentIds() {
                        return parentIds;
                    }

                    public void setParentIds(String parentIds) {
                        this.parentIds = parentIds;
                    }

                    public String getTarget() {
                        return target;
                    }

                    public void setTarget(String target) {
                        this.target = target;
                    }

                    public String getType() {
                        return type;
                    }

                    public void setType(String type) {
                        this.type = type;
                    }

                    public List<ChildrenBean2> getChildren() {
                        return children;
                    }

                    public void setChildren(List<ChildrenBean2> children) {
                        this.children = children;
                    }

                    public static class ChildrenBean2 {
                        private String absoluteUrl;
                        private String code;
                        private String icon;
                        private String id;
                        private String menuName;
                        private String orderby;
                        private String parentId;
                        private String parentIds;
                        /**
                         * absoluteUrl : http://sales.centaline.com:8082/sales-web
                         * app : {"appCname":"三级市场销售平台","appKey":"sales-web","appName":"sales-web","appSecret":"sales-web","domain":"centaline.com","host":"sales.centaline.com","id":"ff8080814a7f5f02014a7f93b4d20008","orderby":"24","port":8082,"schemas":"http","webContext":"/sales-web"}
                         * id : ff80808157416b8d01574fbc44c20058
                         * parentId : ff80808157416b8d01574fb873940052
                         * parentIds : 8a84811c4d6cc498014d6cc681520000,ff80808157416b8d01574fb682e8004f,ff80808157416b8d01574fb873940052,
                         * resourceCode : SALES.APP.HOUADVLIST
                         * resourceName : 有效房源
                         * url :
                         */

                        private ResourceBean resource;
                        private String target;
                        private String type;
                        private String url;
                        private List<?> children;

                        public String getAbsoluteUrl() {
                            return absoluteUrl;
                        }

                        public void setAbsoluteUrl(String absoluteUrl) {
                            this.absoluteUrl = absoluteUrl;
                        }

                        public String getCode() {
                            return code;
                        }

                        public void setCode(String code) {
                            this.code = code;
                        }

                        public String getIcon() {
                            return icon;
                        }

                        public void setIcon(String icon) {
                            this.icon = icon;
                        }

                        public String getId() {
                            return id;
                        }

                        public void setId(String id) {
                            this.id = id;
                        }

                        public String getMenuName() {
                            return menuName;
                        }

                        public void setMenuName(String menuName) {
                            this.menuName = menuName;
                        }

                        public String getOrderby() {
                            return orderby;
                        }

                        public void setOrderby(String orderby) {
                            this.orderby = orderby;
                        }

                        public String getParentId() {
                            return parentId;
                        }

                        public void setParentId(String parentId) {
                            this.parentId = parentId;
                        }

                        public String getParentIds() {
                            return parentIds;
                        }

                        public void setParentIds(String parentIds) {
                            this.parentIds = parentIds;
                        }

                        public ResourceBean getResource() {
                            return resource;
                        }

                        public void setResource(ResourceBean resource) {
                            this.resource = resource;
                        }

                        public String getTarget() {
                            return target;
                        }

                        public void setTarget(String target) {
                            this.target = target;
                        }

                        public String getType() {
                            return type;
                        }

                        public void setType(String type) {
                            this.type = type;
                        }

                        public String getUrl() {
                            return url;
                        }

                        public void setUrl(String url) {
                            this.url = url;
                        }

                        public List<?> getChildren() {
                            return children;
                        }

                        public void setChildren(List<?> children) {
                            this.children = children;
                        }

                        public static class ResourceBean {
                            private String absoluteUrl;
                            /**
                             * appCname : 三级市场销售平台
                             * appKey : sales-web
                             * appName : sales-web
                             * appSecret : sales-web
                             * domain : centaline.com
                             * host : sales.centaline.com
                             * id : ff8080814a7f5f02014a7f93b4d20008
                             * orderby : 24
                             * port : 8082
                             * schemas : http
                             * webContext : /sales-web
                             */

                            private AppBean app;
                            private String id;
                            private String parentId;
                            private String parentIds;
                            private String resourceCode;
                            private String resourceName;
                            private String url;

                            public String getAbsoluteUrl() {
                                return absoluteUrl;
                            }

                            public void setAbsoluteUrl(String absoluteUrl) {
                                this.absoluteUrl = absoluteUrl;
                            }

                            public AppBean getApp() {
                                return app;
                            }

                            public void setApp(AppBean app) {
                                this.app = app;
                            }

                            public String getId() {
                                return id;
                            }

                            public void setId(String id) {
                                this.id = id;
                            }

                            public String getParentId() {
                                return parentId;
                            }

                            public void setParentId(String parentId) {
                                this.parentId = parentId;
                            }

                            public String getParentIds() {
                                return parentIds;
                            }

                            public void setParentIds(String parentIds) {
                                this.parentIds = parentIds;
                            }

                            public String getResourceCode() {
                                return resourceCode;
                            }

                            public void setResourceCode(String resourceCode) {
                                this.resourceCode = resourceCode;
                            }

                            public String getResourceName() {
                                return resourceName;
                            }

                            public void setResourceName(String resourceName) {
                                this.resourceName = resourceName;
                            }

                            public String getUrl() {
                                return url;
                            }

                            public void setUrl(String url) {
                                this.url = url;
                            }

                            public static class AppBean {
                                private String appCname;
                                private String appKey;
                                private String appName;
                                private String appSecret;
                                private String domain;
                                private String host;
                                private String id;
                                private String orderby;
                                private int port;
                                private String schemas;
                                private String webContext;

                                public String getAppCname() {
                                    return appCname;
                                }

                                public void setAppCname(String appCname) {
                                    this.appCname = appCname;
                                }

                                public String getAppKey() {
                                    return appKey;
                                }

                                public void setAppKey(String appKey) {
                                    this.appKey = appKey;
                                }

                                public String getAppName() {
                                    return appName;
                                }

                                public void setAppName(String appName) {
                                    this.appName = appName;
                                }

                                public String getAppSecret() {
                                    return appSecret;
                                }

                                public void setAppSecret(String appSecret) {
                                    this.appSecret = appSecret;
                                }

                                public String getDomain() {
                                    return domain;
                                }

                                public void setDomain(String domain) {
                                    this.domain = domain;
                                }

                                public String getHost() {
                                    return host;
                                }

                                public void setHost(String host) {
                                    this.host = host;
                                }

                                public String getId() {
                                    return id;
                                }

                                public void setId(String id) {
                                    this.id = id;
                                }

                                public String getOrderby() {
                                    return orderby;
                                }

                                public void setOrderby(String orderby) {
                                    this.orderby = orderby;
                                }

                                public int getPort() {
                                    return port;
                                }

                                public void setPort(int port) {
                                    this.port = port;
                                }

                                public String getSchemas() {
                                    return schemas;
                                }

                                public void setSchemas(String schemas) {
                                    this.schemas = schemas;
                                }

                                public String getWebContext() {
                                    return webContext;
                                }

                                public void setWebContext(String webContext) {
                                    this.webContext = webContext;
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}
