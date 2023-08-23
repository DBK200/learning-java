package com.sessions.session12.homework.OOP;

public class Team extends Employee
{
    public String teamLeadName;
    public int teamLeadAge;
    public String teamLeadEmail;

    Team(String teamLeadName,String teamLeadEmail,int teamLeadAge)
    {
        this.teamLeadEmail=teamLeadEmail;
        this.teamLeadAge=teamLeadAge;
        this.teamLeadName=teamLeadName;
    }
    public String getTeamLeadName()
    {
        return teamLeadName;
    }
    public String getTeamLeadEmail()
    {
        return teamLeadEmail;
    }
    public int getTeamLeadAge()
    {
        return teamLeadAge;
    }
    public void displayTeamLead()
    {
        System.out.println("Echipa este condusa de: "+teamLeadName);
        System.out.println("Lider de echipa:");
        System.out.println("Numele:" +teamLeadName);
        System.out.println("Varsta:" +teamLeadAge);
        System.out.println("Adresa de email:" +teamLeadEmail);
    }

    public static void main(String[] args)
    {
        Team team=new Team("Anca Vacareanu","ancavac23@gmail.com",18);
        team.displayTeamLead();
    }

}
