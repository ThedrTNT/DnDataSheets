package DnDataSheets.model;

public class CharacterAttributes
{
    private int str; //Strength
    private int strMod; //Strength modifier
    private int dex; //Dexterity
    private int dexMod; //Dexterity modifier
    private int con; //Constitution
    private int conMod; //Constitution modifier
    private int intel;
    private int intelMod;
    private int wis; //Wisdom
    private int wisMod; //Wisdom modifier
    private int cha; //Charisma
    private int chaMod; //Charisma modifier

    public CharacterAttributes()
    {
        str = 0;
        strMod = 0;
        dex = 0;
        dexMod = 0;
        con = 0;
        conMod = 0;
        intel = 0;
        intelMod = 0;
        wis = 0;
        wisMod = 0;
        cha = 0;
        chaMod = 0;
    }

    public int getModifier(int score)
    {
        switch(score)
        {
            case 1: return -5;
            case 2: case 3: return -4;
            case 4: case 5: return -3;
            case 6: case 7: return -2;
            case 8: case 9: return -1;
            case 10: case 11: return 0;
            case 12: case 13: return 1;
            case 14: case 15: return 2;
            case 16: case 17: return 3;
            case 18: case 19: return 4;
            case 20: case 21: return 5;
            case 22: case 23: return 6;
            case 24: case 25: return 7;
            case 26: case 27: return 8;
            case 28: case 29: return 9;
            case 30: return 10;
        }
        return -1;
    }

    public void setStrength(int strength)
    {
        str = strength;
        strMod = getModifier(str);
    }

    public void setDexterity(int dexterity)
    {
        dex = dexterity;
        dexMod = getModifier(dex);
    }

    public void setConstitution(int constitution)
    {
        con = constitution;
        conMod = getModifier(con);
    }

    public void setIntelligence(int intelligence)
    {
        intel = intelligence;
        intelMod = getModifier(intel);
    }

    public void setWisdom(int wisdom)
    {
        wis = wisdom;
        wisMod = getModifier(wis);
    }

    public void setCharisma(int charisma)
    {
        cha = charisma;
        chaMod = getModifier(cha);
    }

    public int getStrength()
    {
        return str;
    }

    public int getStrengthMod()
    {
        return strMod;
    }

    public int getDexterity()
    {
        return dex;
    }

    public int getDexterityMod()
    {
        return dexMod;
    }

    public int getConstitution()
    {
        return con;
    }

    public int getConstitutionMod()
    {
        return conMod;
    }

    public int getIntelligence()
    {
        return intel;
    }

    public int getIntelligenceMod()
    {
        return intelMod;
    }

    public int getWisdom()
    {
        return wis;
    }

    public int getWisdomMod()
    {
        return wisMod;
    }

    public int getCharisma()
    {
        return cha;
    }

    public int getCharismaMod()
    {
        return chaMod;
    }
}
