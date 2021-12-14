package Character;

public class characterInfo {
    int HP; //data member
    int MP; //data member
    int ATTACK; //datamember


    characterInfo(int roleHP, int roleMP, int roleATTACK){
        HP = roleHP;
        MP = roleMP;
        ATTACK = roleATTACK;
    }
    void getCurrrntStatus(){
        System.out.println("HP:" + HP);
        System.out.println("MP;" + MP);
        System.out.println("ATTACK:" + ATTACK);
    }
}
