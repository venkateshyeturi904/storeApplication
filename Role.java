package model;

import java.util.ArrayList;
import java.util.List;

public class Role {
    String roleName;
    int experience;

    String location;
    List<String> skillsRequired = new ArrayList<>();

    public Role(String roleName, int experience, String location,List<String> skillsRequired){
        this.roleName=roleName;
        this.experience=experience;
        this.location=location;
        this.skillsRequired=skillsRequired;

    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }



    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<String> getSkillsRequired() {
        return skillsRequired;
    }

    public void setSkillsRequired(List<String> skillsRequired) {
        this.skillsRequired = skillsRequired;
    }

    @Override
    public String toString() {
        return "Role{" +
                "roleName='" + roleName + '\'' +
                ", experience=" + experience +
                ", location='" + location + '\'' +
                ", skillsRequired=" + skillsRequired +
                '}';
    }
}
