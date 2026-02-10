package com.hhy.extends6constructor;

public class Teacher extends Person {
  private String skill;

    public Teacher(String name, int age, String skill) {
        //为父类中的属性赋值
        super(name, age);
        this.skill = skill;
    }

    public Teacher(String skill) {
        this.skill = skill;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Teacher() {
    }

}
