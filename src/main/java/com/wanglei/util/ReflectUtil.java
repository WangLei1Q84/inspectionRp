package com.wanglei.util;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by wangl on 2018/4/28.
 */
public class ReflectUtil
{
    public static List<Field> getNotNUllFields(Object obj) throws Exception{
        List<Field> notNullList = new ArrayList<Field>();
        Class stuCla = (Class) obj.getClass();// 得到类对象
        Field[] fs = stuCla.getDeclaredFields();//得到属性集合
        for (Field f : fs) {//遍历属性
            f.setAccessible(true); // 设置属性是可以访问的(私有的也可以)
            int mod = f.getModifiers();
            //过滤 private static final 的属性
            if(Modifier.toString(mod).equals("private static final")){
                continue;
            }
            Object val = f.get(obj);// 得到此属性的值
            if(val!=null&&!val.equals("")) {//返回不会空的列
                notNullList.add(f);
            }
        }
        return notNullList;
    }
    public  static String upperCase(String str) {
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }

}
