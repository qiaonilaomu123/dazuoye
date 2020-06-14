package com.company.hero;

import com.company.skills.ESkill;
import com.company.skills.QSkill;
import com.company.skills.WSkill;

/**
 * @description:
 * @author: 袁海
 * @date: Created in 2020/6/8 11:03
 * @version:
 * @modified By:
 */
public class LeiKeSai {
    public void skill(){
        QSkill qSkill=new QSkill();
        qSkill.LKSQ();
        WSkill wSkill=new WSkill();
        wSkill.LKSW();
        ESkill eSkill=new ESkill();
        eSkill.LKSE();
    }
    public void kill(int x){
        if (x==1){
            QSkill qSkill=new QSkill();
            qSkill.LKSq();
        }
        else if (x==2){
            WSkill wSkill=new WSkill();
            wSkill.LKSw();
        }
        else {
            ESkill eSkill=new ESkill();
            eSkill.LKSe();
        }
    }
}
