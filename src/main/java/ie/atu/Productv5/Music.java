package ie.atu.Productv5;

import java.text.NumberFormat;

public class Music {
    private String artist;
    private String code;
    private String description;
    private double price;
    protected static int count = 0;

    public Book() {
        description = "";
        code = "";
        artist = "";
        price = 0.0;
        count++;
    }
    public void setArtist(String artist) {
        this.artist = artist;
    }

    public String getArtist() {
        return artist;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getPriceFormatted() {
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        return currency.format(price);
    }

    public String toString() {
        return description + " by " + author;
    }

    public static int getCount() {
        return count;
    }

}

