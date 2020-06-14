package com.company.wildarea;

import com.company.creeps.AnYingLang;
import com.company.creeps.LanBuff;
import com.company.creeps.MoZhaoWa;
import com.company.hero.AiKe;

import java.util.Scanner;

/**
 * @description:
 * @author: 袁海
 * @date: Created in 2020/6/8 11:09
 * @version:
 * @modified By:
 */
public class EnemyDownWildArea {
    public void selection(int x){
        System.out.println("当前野区的野怪：\n"+
                "1.苍蓝魔纹雕像 2.魔沼蛙 3.暗影狼");
        Scanner input=new Scanner(System.in);
        int selection=input.nextInt();
        if (selection==1){
            LanBuff lanBuff=new LanBuff();
            lanBuff.crepp(x);
        }
        else if (selection==2){
            MoZhaoWa moZhaoWa=new MoZhaoWa();
            moZhaoWa.crepp(x);
        }
        else if (selection==3){
            AnYingLang anYingLang=new AnYingLang();
            anYingLang.creep(x);
        }
    }
}
