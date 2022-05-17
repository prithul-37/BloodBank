package my;

public class my {
    String name;
    int roll;

    my(String name, int roll)
    {
        this.name=name;
        this.roll=roll;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }
}
