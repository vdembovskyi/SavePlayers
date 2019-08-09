import java.util.ArrayList;

public class Player implements ISaveable {
    private String name;
    private String power;
    private String weapon;

    public Player(String name, String power, String weapon) {
        this.name = name;
        this.power = power;
        this.weapon = weapon;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPower() {
        return power;
    }

    public void setPower(String power) {
        this.power = power;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    @Override
    public ArrayList<String> write() {
        ArrayList<String> v = new ArrayList<>();
        v.add(getName()+ " : ");
        v.add(getPower()+ " : ");
        v.add(getWeapon()+ " : ");
        return v;
    }

    @Override
    public void setValues(ArrayList<String> values) {
        setName(values.get(0));
        setPower(values.get(1));
        setWeapon(values.get(2));
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                ", weapon='" + weapon + '\'' +
                '}';
    }
}
