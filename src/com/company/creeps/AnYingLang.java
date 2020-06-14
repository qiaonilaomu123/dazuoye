package com.company.creeps;

import com.company.hero.AiKe;
import com.company.hero.LeiKeSai;
import com.company.hero.Yi;

import java.util.Scanner;

/**
 * @description:
 * @author: 袁海
 * @date: Created in 2020/6/8 11:13
 * @version:
 * @modified By:
 */
public class AnYingLang {
    public void creep(int x){
        System.out.println("当前的野怪是暗影狼，可以选择的技能有：");
        if (x==1){
            AiKe aiKe=new AiKe();
            aiKe.skill();
            Scanner input=new Scanner(System.in);
            aiKe.kill(input.nextInt());
            System.out.println("暗影狼\n");
        }
        else if (x==2) {
            LeiKeSai leiKeSai = new LeiKeSai();
            leiKeSai.skill();
            Scanner input=new Scanner(System.in);
            leiKeSai.kill(input.nextInt());
            System.out.println("暗影狼\n");
        }
        else {
            Yi yi=new Yi();
            yi.skill();
            Scanner input=new Scanner(System.in);
            yi.kill(input.nextInt());
            System.out.println("暗影狼\n");
        }
    }
}
