package com.asjy.utils;

import lombok.Data;

/**
 * ClassName: R
 * Package: com.asjy.utils
 * Description:
 *
 * @Author 梓维李
 * @Create 2023/2/26 15:59
 * @Version 2.0
 */
@Data
public class R {

    //状态码 成功为1
    private Integer code ;

    //返回数据
    private Object data ;

    public static R success(Object data){
        R r = new R() ;
        r.setCode(1);
        r.setData(data);
        return r ;
    }


}
