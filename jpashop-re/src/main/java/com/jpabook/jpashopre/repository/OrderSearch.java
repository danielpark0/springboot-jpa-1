package com.jpabook.jpashopre.repository;

import com.jpabook.jpashopre.domain.OrderStatus;
import lombok.Getter;

@Getter
public class OrderSearch {

    private String memberName;
    private OrderStatus orderStatus;

}
