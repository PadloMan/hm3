package app;

class Order {
    int orderNo;
    String product;
    int day;
    double S1 = 12153.41;
    int D1 = 5;
    double o = S1/D1;
    double S2 = 10486.85f;
    int D2 = 7;
    double two = S2/D2;
    public Order (int orderNo, String product, int day){
        this.orderNo = orderNo;
        this.product = product;
        this.day = day;
    }
    public void displayOrderDetails (){
        System.out.println("Product No " + orderNo + ": " + product + "," );
        System.out.println("total sales for " + day + " day is EUR " + Math.round(S1) + ",");
        System.out.println("sales by day is EUR " + o );

    }
}
public class Main {
    public static void main(String[] args) {
        Order order1 = new Order(1, "smartphone", 5);
        Order order2 = new Order(2, "laptop", 7);
        order1.displayOrderDetails();
        System.out.println();
        order2.displayOrderDetails();



    }
}
