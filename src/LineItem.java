public class LineItem {
    private int quantity;
    private Product product;
    private double total;

    public LineItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.total = quantity * this.product.getUnitPrice();
    }

    public Product getProduct()
    {
        return product;
    }
    public int getQuantity(){
        return quantity;
    }
    public double getTotal()
    {
        return total;
    }
}
