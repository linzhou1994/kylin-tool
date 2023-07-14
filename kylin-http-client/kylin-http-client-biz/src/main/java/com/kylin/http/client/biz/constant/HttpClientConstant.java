package com.kylin.http.client.biz.constant;

/**
 * ////////////////////////////////////////////////////////////////////
 * //                          _ooOoo_                               //
 * //                         o8888888o                              //
 * //                         88" . "88                              //
 * //                         (| ^_^ |)                              //
 * //                         O\  =  /O                              //
 * //                      ____/`---'\____                           //
 * //                    .'  \\|     |//  `.                         //
 * //                   /  \\|||  :  |||//  \                        //
 * //                  /  _||||| -:- |||||-  \                       //
 * //                  |   | \\\  -  /// |   |                       //
 * //                  | \_|  ''\---/''  |   |                       //
 * //                  \  .-\__  `-`  ___/-. /                       //
 * //                ___`. .'  /--.--\  `. . ___                     //
 * //              ."" '<  `.___\_<|>_/___.'  >'"".                  //
 * //            | | :  `- \`.;`\ _ /`;.`/ - ` : | |                 //
 * //            \  \ `-.   \_ __\ /__ _/   .-` /  /                 //
 * //      ========`-.____`-.___\_____/___.-`____.-'========         //
 * //                           `=---='                              //
 * //      ^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^        //
 * //         佛祖保佑           永无BUG           永不修改              //
 * //          佛曰:                                                  //
 * //                 写字楼里写字间，写字间里程序员;                      //
 * //                 程序人员写程序，又拿程序换酒钱.                      //
 * //                 酒醒只在网上坐，酒醉还来网下眠;                      //
 * //                 酒醉酒醒日复日，网上网下年复年.                      //
 * //                 但愿老死电脑间，不愿鞠躬老板前;                      //
 * //                 奔驰宝马贵者趣，公交自行程序员.                      //
 * //                 别人笑我忒疯癫，我笑自己命太贱;                      //
 * //                 不见满街漂亮妹，哪个归得程序员?                      //
 * ////////////////////////////////////////////////////////////////////
 *
 * @date : 2021/12/26 17:38
 * @author: linzhou
 * @description : HttpClientConstant
 */
public class HttpClientConstant {
    /**
     * 启动注解上设置需要扫描的httpclient的包名
     *
     * @see com.kylin.http.client.biz.annotation.EnableHttpClient
     */
    public static final String BASE_PACKAGES = "basePackages";

    /**
     * http的分隔符
     */
    public static final String HTTP_SPLIT = "/";
    /**
     * URL带参数的字符
     */
    public static final String URL_SPLIT_PARAM = "?";
    /**
     * URL参数的分隔符
     */
    public static final String URL_PARAM_SPLIT = "&";

    /**
     * 默认的http文件下载的文件名称
     */
    public static final String DEFAULT_HTTP_CLIENT_DOWN_FILE_NAME = "HttpClientDownFile";

    /**
     * 文件路径的分隔符
     */
    public static final String FILE_PATH_SPLIT = "/";

    public static final String APPLICATION_X_WWW_FORM_URLENCODED = "application/x-www-form-urlencoded";


    public static final String UTF8 = "UTF-8";


}
