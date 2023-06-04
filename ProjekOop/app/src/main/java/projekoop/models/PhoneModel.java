package projekoop.models;

public class PhoneModel {
    private String name;
    private String background;
    private String image;
    private String storeUrl;
    private int price;
    
    public PhoneModel(String name, String background, String image, String storeUrl, int price) {
        this.name = name;
        this.background = background;
        this.image = image;
        this.storeUrl = storeUrl;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    

    public void setName(String name) {
        this.name = name;
    }

    public String getDesc() {
        return background;
    }

    public void setDesc(String desc) {
        this.background = desc;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStoreUrl() {
        return storeUrl;
    }

    public void setStoreUrl(String storeUrl) {
        this.storeUrl = storeUrl;
    }
    
    public void setPrice(int price){
        this.price = price;
    }

    public String getBackground() {
        return background;
    }

    public int getPrice() {
        return price;
    }
}
