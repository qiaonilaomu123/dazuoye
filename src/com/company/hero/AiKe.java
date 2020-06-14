package com.company.hero;

import com.company.skills.ESkill;
import com.company.skills.QSkill;
import com.company.skills.WSkill;

/**
 * @description:
 * @author: 袁海
 * @date: Created in 2020/6/8 11:04
 * @version:
 * @modified By:
 */
public class AiKe {
    public void skill(){
        QSkill qSkill=new QSkill();
        qSkill.AKQ();
        WSkill wSkill=new WSkill();
        wSkill.AKW();
        ESkill eSkill=new ESkill();
        eSkill.AKE();
    }
    public void kill(int x){
        if (x==1){
            QSkill qSkill=new QSkill();
            qSkill.Akq();
        }
        else if (x==2){
            WSkill wSkill=new WSkill();
            wSkill.Akw();
        }
        else {
            ESkill eSkill=new ESkill();
            eSkill.Ake();
        }
    }
}
