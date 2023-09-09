package Solutions.W8_Assignment_CFFC_and_LMS.FurnitureFittingsCompany;

class Bookshelf implements FurnitureItem {
    private String itemName;
    private double price;
    private double width;
    private double height;

    public Bookshelf(double price, double width, double height) {
        this.itemName = "Bookshelf";
        this.price = price;
        this.width = width;
        this.height = height;
    }

    @Override
    public String getItemName() {
        return itemName;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public double getWidth() {
        return width;
    }

    @Override
    public double getHeight() {
        return height;
    }
}

