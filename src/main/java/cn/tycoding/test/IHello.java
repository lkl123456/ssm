/**
 * Copyright (C), 2018-2019, www.yonyou.com
 * FileName: IHello
 * Author:   Administrator
 * Date:     2019/9/26 10:52
 * Description: 测试接口1
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

package cn.tycoding.test;

import java.util.List;

/**
 * @Description 测试接口1
 * @author liuklm
 * @create 2019/9/26 10:52
 */
public interface IHello<T>{

    String getParams(List<T> beanObjects);
}
