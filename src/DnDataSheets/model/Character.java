package DnDataSheets.model;

public class Character
{
    private String name;
    private String race;
    private String classType;
    private String alignment;
    private int level;
    private int proficiency;
    private int maxHP;
    private int currentHP;
    private CharacterAttributes attributes;
    private CharacterSkills skills;

    public Character(String playerName, String playerRace, String playerClass, String playerAlignment, int playerLevel, int playerProf, int maxHealth, int currentHealth)
    {
        name = playerName;
        race = playerRace;
        classType = playerClass;
        alignment = playerAlignment;
        level = playerLevel;
        proficiency = playerProf;
        maxHP = maxHealth;
        currentHP = currentHealth;
    }

    public void setAttributes(CharacterAttributes atts)
    {
        attributes = atts;
    }

    public void setSkills(CharacterSkills skillz)
    {
        skills = skillz;
    }
}
