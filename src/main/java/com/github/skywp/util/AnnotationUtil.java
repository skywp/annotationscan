package com.github.skywp.util;

import com.github.skywp.annotation.RequiredMe;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * @author WangPeng
 * @ClassName: AnnotionUtils
 * @Description: 注解校验工具
 * @Package com.github.skywp.util
 * @date 2018/11/1
 */
public final class AnnotationUtil {
    /**
     * 注解在字段上
     */
    public static boolean validateField(Object obj) {
        StringBuffer message = new StringBuffer();
        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();
        try {
            for (Field field : fields) {
                field.setAccessible(true);
                Object object = field.get(obj);
                if (field.isAnnotationPresent(RequiredMe.class)) {
                    if (object == null || String.valueOf(object).trim().equals("")) {
                        message.append(field.getName() + "不能为空");
                        return false;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("校验失败" + e);
        }
        return true;
    }

    /**
     * 注解在方法上
     */
    public static boolean validateMethod(Object obj) {
        StringBuffer message = new StringBuffer();
        Class<?> clazz = obj.getClass();
        Method[] methods = clazz.getDeclaredMethods();
        try {
            for (Method method : methods) {
                if (method.isAnnotationPresent(RequiredMe.class)) {
                    method.setAccessible(true);
                    if (method.invoke(obj, new Object[] {}) == null
                            || String.valueOf(method.invoke(obj, new Object[] {})).trim().equals("")) {
                        message.append(splitGetMethod(method.getName()) + "不能为空");
                        return false;
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("校验失败" + e);
        }
        return true;
    }

    /**
     * 分割 get 方法获取字段
     */
    private static String splitGetMethod(String methodName) {
        if (methodName == null || methodName.equals("")) {
            return "";
        }
        methodName = methodName.trim();
        if (methodName.startsWith("get") && methodName.length() > 3) {
            return methodName.substring(3);
        } else {
            return methodName;
        }
    }

}
