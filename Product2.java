public class Product2 {
    public String name;
    public static int id=0;

    Product2(String n){
        this.id++;
        this.name=n;
    }
    public String toString(){
        String display=String.format("%d\t%s",id,name);
        return display;
    }

}
