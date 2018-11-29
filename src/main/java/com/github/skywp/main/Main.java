package com.github.skywp.main;

import com.github.skywp.entity.Student;
import com.github.skywp.util.AnnotationUtil;

/**
 * @author WangPeng
 * @ClassName: Main
 * @Description: 测试
 * @Package com.github.skywp.main
 * @date 2018/11/1
 */
public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("注解测试");
        student.setAge("1");
        //student.setGender("man");
        boolean flag = AnnotationUtil.validateField(student);
        System.out.println(flag);
    }

}
