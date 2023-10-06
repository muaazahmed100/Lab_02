public class Product {
    private int id;
    private String name;
    private int quantity;
    private float price;
    public static int counter=1;


    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }

    public float getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public Date getMfcdate() {
        return mfcdate;
    }

    public void setMfcdate(Date mfcdate) {
        this.mfcdate = mfcdate;
    }
    private Date mfcdate;
    public Product latestProduct(Product p1,Product p2){

        Date temp = mfcdate.largestDate(p1.mfcdate,p2.mfcdate);
        if (temp==p1.mfcdate)
            return p1;
        else
            return p2;
    }



    Product (String n, float p, int q,Date date){
        this.id=counter++;
        this.name=n;
        this.price=p;
        this.quantity=q;
        this.mfcdate=date;

    }


    public String toString(){
        String Display=String.format("%d\t%-10s%10.2f%10d%s",id,name,price,quantity,mfcdate);
        return Display;
    }
}
