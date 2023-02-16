package ie.atu.Producttv6;

public class Software extends Product{
    public String version;

    public Software(){
        version = "";
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }
}
