import java.util.ArrayList;

public class Monster  implements ISaveable{
    private String name;
    private String power;

    public Monster(String name, String power) {
        this.name = name;
        this.power = power;
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

    @Override
    public ArrayList<String> write() {
        ArrayList<String> v = new ArrayList<>();
        v.add(getName()+ " : ");
        v.add(getPower()+ " : ");
        return v;
    }

    @Override
    public void setValues(ArrayList<String> values) {
        setName(values.get(0));
        setPower(values.get(1));
    }


    @Override
    public String toString() {
        return "Monster{" +
                "name='" + name + '\'' +
                ", power='" + power + '\'' +
                '}';
    }
}
