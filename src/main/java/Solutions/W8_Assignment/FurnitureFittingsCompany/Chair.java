package Solutions.W8_Assignment.FurnitureFittingsCompany;

class Chair implements FurnitureItem {
    private String itemName;
    private double price;
    private double width;
    private double height;

    public Chair(double price, double width, double height) {
        this.itemName = "Chair";
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


