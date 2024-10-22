public class Role {
    private String name;
    private int roleLevel;
    public Role(String _name) {
        if (_name.equals("Paladin")) {
            //set bonusHardiness to 2
            //set bonusWisdom to 0
        }
        else if (_name.equals("Rogue") || _name.equals("Assassin")) {

        }
        else {
            throw new java.lang.Error("Oops");
        }

        if (10 > roleLevel && roleLevel > 5) {

        }
    }

    public void setName(String _name) {
        name = _name;
    }

    public String getName() {
        return name;
    }
}
//nbjdskubgdbsuakbgdasukgas
