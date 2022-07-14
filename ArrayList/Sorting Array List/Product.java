class Product{
    private String prdtName,manuf;
    private int cost,disc;

    Product(String prdtName, String manuf,int cost, int disc ){
        this.prdtName = prdtName;
        this.manuf = manuf;
        this.cost = cost;
        this.disc = disc;
    }
    public int getDisc() {
        return disc;
    }

    public int getCost() {
        return cost;
    }

    public String getManuf() {
        return manuf;
    }

    public String toString(){
        return("Product Name : " + this.prdtName + "\n" + "Manufacturer Name : " + this.manuf + "\n" +"Product Cost : " + this.cost + "\n" + "Product Discount : " + this.disc + "\n");
    }
}