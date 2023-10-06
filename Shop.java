

public class Shop{
    public static void main(String[] args){
        Product pro1=new Product("Bag",100,10,new Date(15,10,23));
        Product pro2=new Product("watch",200,20,new Date(15,9,23));

        System.out.println(pro1.latestProduct(pro1,pro2));
//        System.out.println(pro1);
//        System.out.println(pro2);
    }
}