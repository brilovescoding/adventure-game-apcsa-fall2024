public class Role {
    private String name;
    public Role(String _name) {
        if (_name.equals("Paladin")) {
            //set bonusHardiness to 2
            //set bonusWisdom to 0
        }
        else {
            throw new java.lang.Error("Oops");
        }
    }
}
