package com.company.wildarea;

import com.company.creeps.*;

import java.util.Scanner;

/**
 * @description:
 * @author: 袁海
 * @date: Created in 2020/6/8 11:08
 * @version:
 * @modified By:
 */
public class OurDownWildArea {
    public void selection(int x){
        System.out.println("当前野区的野怪：\n"+
                "1.绯红印记树怪 2.石甲虫 3.锋喙鸟");
        Scanner input=new Scanner(System.in);
        int selection=input.nextInt();
        if (selection==1){
            HongBuff hongBuff=new HongBuff();
            hongBuff.crepp(x);
        }
        else if (selection==2){
            ShiJiaChong shiJiaChong=new ShiJiaChong();
            shiJiaChong.crepp(x);
        }
        else if (selection==3){
            FengHunNiao fengHunNiao=new FengHunNiao();
            fengHunNiao.crepp(x);
        }
    }
}
