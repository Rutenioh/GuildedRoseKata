package es.rutenioh;

public class Item {
    private String name;
    private int sellInValue;
    private int qualityValue;

    public Item(String name, int sellInValue, int qualityValue) {
        this.setName(name);
        this.setSellInValue(sellInValue);
        this.setQualityValue(qualityValue);
    }


    public String getName() {
        return name;
    }

    public int getSellInValue() {
        return sellInValue;
    }

    public int getQualityValue() {
        return qualityValue;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setSellInValue(int sellInValue) {
        this.sellInValue = sellInValue;
    }

    public void setQualityValue(int qualityValue) {
        this.qualityValue = qualityValue;
    }
}
