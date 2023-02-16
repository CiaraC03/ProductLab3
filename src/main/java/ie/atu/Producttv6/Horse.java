package ie.atu.Producttv6;

public class Horse {
    private String dam;
    private String sire;
    private String height;
    protected static int count = 0;


    public Horse(){

        dam = "";
        sire = "";
        height = "";
    }

    public String getDam() {
        return dam;
    }

    public void setDam(String dam) {
        this.dam = dam;
    }

    public String getSire() {
        return sire;
    }

    public void setSire(String sire) {
        this.sire = sire;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Horse.count = count;
    }
}

