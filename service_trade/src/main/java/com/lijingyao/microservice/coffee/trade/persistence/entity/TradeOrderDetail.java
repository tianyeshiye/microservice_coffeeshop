package com.lijingyao.microservice.coffee.trade.persistence.entity;

import com.lijingyao.microservice.coffee.base.durid.entity.UtcTimeLongIdEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

/**
 * Created by lijingyao on 2018/7/8 22:35.
 */
@Entity
@Table(name = "trade_order_detail")
public class TradeOrderDetail extends UtcTimeLongIdEntity {

    @NotNull
    @Column(name = "order_id", length = 64)
    private String orderId;

    @NotNull
    @Column(name = "main_order_id", length = 64)
    private String mainOrderId;


    @Column(name = "user_id")
    private Long userId;

    @Column(name = "item_id")
    private Integer itemId;


    @Column(name = "price")
    private Long price;

    // 重量或者是数量
    private Long quantity;


    @Column(name = "item_name", length = 64)
    private String itemName;

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getMainOrderId() {
        return mainOrderId;
    }

    public void setMainOrderId(String mainOrderId) {
        this.mainOrderId = mainOrderId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Integer getItemId() {
        return itemId;
    }

    public void setItemId(Integer itemId) {
        this.itemId = itemId;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}
