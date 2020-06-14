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
public class Yi {
    public void skill(){
        QSkill qSkill=new QSkill();
        qSkill.YQ();
        WSkill wSkill=new WSkill();
        wSkill.YW();
        ESkill eSkill=new ESkill();
        eSkill.YE();
    }
    public void kill(int x){
        if (x==1){
            QSkill qSkill=new QSkill();
            qSkill.Yq();
        }
        else if (x==2){
            WSkill wSkill=new WSkill();
            wSkill.Yw();
        }
        else {
            ESkill eSkill=new ESkill();
            eSkill.Ye();
        }
    }
}
