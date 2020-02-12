package com.study.template;

import java.util.ArrayList;

/**
 * @author lxy
 * @date 2020-02-11-20:40
 */


//模板大部分取自于  setting - Editor - Live Templates
//               setting - General - Postfix Completion
public class TemplateTest {

    //模板6： prsf
    private static final String name = "lxy";
    //变形:   psf
    public static final  int num = 1;
    


    //模板1：psvm
    public static void main(String[] args) {

        //模板2:sout
        System.out.println("Hello");
        //变形:soutp / soutm / soutv / xxx.sout
        System.out.println("args = [" + args + "]");
        System.out.println("TemplateTest.main");
        int num1 = 10;
        System.out.println("num1 = " + num1);//soutv
        int num2 = 10;
        System.out.println("num2 = " + num2);//soutv
        System.out.println(num1);//num1.sout


        //模版3:一般for循环 fori
        String[] arr = new String[]{"Tom","John","Mike","Lily"};
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr[i]);
        }
        //变形:增加for循环 iter
        for (String s : arr) {
            System.out.println("s = " + s);
        }
        //变形:一般for循环 itar
        for (int i = 0; i < arr.length; i++) {
            String s = arr[i];
            System.out.println("s = " + s);
        }

        //模版4:  list.for
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);

        for (Integer integer : list) {

        }
        //变形: list.fori
        for (int i = 0; i < list.size(); i++) {

        }
        //变形: list.forr  倒序遍历
        for (int i = list.size() - 1; i >= 0; i--) {

        }

        //模版5: ifn
        if (list == null) {

        }

    }
}
