package homeWork_16_Team;

import java.util.ArrayList;

public class Skill<T> {
    private T skill1;
    private T skill2;
    private T skill3;
    private T skill4;
    private T skill5;




    public Skill(T skill1, T skill2, T skill3, T skill4, T skill5) {
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skill3 = skill3;
        this.skill4 = skill4;
        this.skill5 = skill5;
    }

    public Skill(T skill1, T skill2, T skill3, T skill4) {
        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skill3 = skill3;
        this.skill4 = skill4;
    }

    public Skill(T skill1, T skill2, T skill3) {

        this.skill1 = skill1;
        this.skill2 = skill2;
        this.skill3 = skill3;
    }

    public Skill(T skill1, T skill2) {
        this.skill1 = skill1;
        this.skill2 = skill2;
    }

    public Skill(String arraySkill) {
    }

    public T getSkill1() {
        return skill1;
    }

    public void setSkill1(T skill1) {
        this.skill1 = skill1;
    }

    public T getSkill2() {
        return skill2;
    }

    public void setSkill2(T skill2) {
        this.skill2 = skill2;
    }

    public T getSkill3() {
        return skill3;
    }

    public void setSkill3(T skill3) {
        this.skill3 = skill3;
    }

    public T getSkill4() {
        return skill4;
    }

    public void setSkill4(T skill4) {
        this.skill4 = skill4;
    }

    @Override
    public String toString() {
        return "  Список скилов:  " +
                " [" + skill1 +
                ", " + skill2 +
                ", " + skill3 +
                ", " + skill4 +
                ", " + skill5 +
                "]\n";
    }
}
