
class Order {

    int orderId;
    String orderDate;

    Order(int id, String date) {
        orderId = id;
        orderDate = date;
    }
}

class ShippedOrder extends Order {

    String trackingNumber;

    ShippedOrder(int id, String date, String track) {
        super(id, date);
        trackingNumber = track;
    }
}

class DeliveredOrder extends ShippedOrder {

    String deliveryDate;

    DeliveredOrder(int id, String date, String track, String dDate) {
        super(id, date, track);
        deliveryDate = dDate;
    }

    String getOrderStatus() {
        return "Delivered on " + deliveryDate;
    }
}

public class OrderTest {

    public static void main(String[] args) {
        DeliveredOrder d = new DeliveredOrder(101, "2025-09-21", "TRK123", "2025-09-25");
        System.out.println(d.getOrderStatus());
    }
}
