package com.wp.annotationscan.main;

import com.wp.annotationscan.entity.Student;
import com.wp.annotationscan.util.AnnotionUtils;

/**
 * @author WangPeng
 * @ClassName: Main
 * @Description: 测试
 * @Package com.wp.annotationscan.main
 * @date 2018/11/1
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("注解测试");
        student.setAge("1");
        //student.setGender("man");
        boolean flag = AnnotionUtils.validateField(student);
        System.out.println(flag);
    }

}
