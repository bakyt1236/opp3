public class Rectangle {
    private String name;
    private int Acorner;
    private int Bcorner;

    private String color;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.length()>3) {
            this.name = name;
        }else
            System.out.println("aty tyra emes");
    }

    public int getAcorner() {
        return Acorner;
    }

    public void setAcorner(int acorner) {
        Acorner = acorner;
    }

    public int getBcorner() {
        return Bcorner;
    }

    public void setBcorner(int bcorner) {
        Bcorner = bcorner;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return " Rectangle " +
                "name='" + name + "\n" +
                ", Acorner=" + Acorner +
                ", Bcorner=" + Bcorner +
                ", color='" + color;
    }
}


