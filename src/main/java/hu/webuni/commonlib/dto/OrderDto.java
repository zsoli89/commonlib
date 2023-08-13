package hu.webuni.commonlib.dto;

import lombok.Data;

import java.util.Map;

@Data
public class OrderDto {

    private Long addressId;
    private Map<Long, Long> products;


}
