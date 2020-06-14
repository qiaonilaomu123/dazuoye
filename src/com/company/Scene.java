package com.company;

import com.company.wildarea.EnemyDownWildArea;
import com.company.wildarea.EnemyUpWildArea;
import com.company.wildarea.OurDownWildArea;
import com.company.wildarea.OurUpWildArea;

import java.util.Scanner;

/**
 * @description:
 * @author: 袁海
 * @date: Created in 2020/6/8 11:09
 * @version:
 * @modified By:
 */
public class Scene {
    public int start(){
        System.out.println("欢迎来到英雄联盟！\n"+"召唤师，请选择\n"+"1.进入召唤师峡谷  2.退出游戏");
        Scanner input=new Scanner(System.in);
        return input.nextInt();
    }
    public int after(){
        System.out.println("召唤师，请选择要使用的英雄：（-1退出游戏）\n"+"1.时间刺客-艾克  2.虚空遁地兽-雷克赛  3.无极剑圣-易");
        Scanner input =new Scanner(System.in);
        return input.nextInt();
    }
    public int then(){
        System.out.println("请选择要去往的野区：（-1退出游戏 0重新选择英雄）\n"+"1.我方上野区  2.我方下野区  3.敌方上野区  4.敌方下野区");
        Scanner input=new Scanner(System.in);
        return input.nextInt();
    }
    public void selection(int x,int y){
        if (y==1){
            OurUpWildArea ourUpWildArea=new OurUpWildArea();
            ourUpWildArea.selection(x);
        }
        else if (y==2){
            OurDownWildArea ourDownWildArea=new OurDownWildArea();
            ourDownWildArea.selection(x);
        }
        else if (y==3){
            EnemyUpWildArea enemyUpWildArea=new EnemyUpWildArea();
            enemyUpWildArea.selection(x);

        }
        else {
            EnemyDownWildArea enemyDownWildArea=new EnemyDownWildArea();
            enemyDownWildArea.selection(x);
        }
    }
}
