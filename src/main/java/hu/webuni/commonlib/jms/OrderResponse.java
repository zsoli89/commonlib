package hu.webuni.commonlib.jms;

import lombok.Data;

@Data
public class OrderResponse {
    private Long orderId;
    private String orderStatus;
    private String shippingId;
}
