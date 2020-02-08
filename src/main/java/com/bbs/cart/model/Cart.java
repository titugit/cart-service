package com.bbs.cart.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@JsonInclude(value = JsonInclude.Include.NON_NULL)
public class Cart {

    private String cartId;
    private String userType;
    private String userId;
    private Date createdDate;
    private Date lastUpdatedTime;
    private String itemCount;
}
