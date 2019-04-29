package com.example.matching.model;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.commons.lang3.builder.EqualsBuilder;

import java.util.Objects;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class MatcherTradeEvent {

    public MatcherEventType eventType; // TRADE, REDUCE or REJECTION (rare)

    public int symbol;

    public long activeOrderId;
    public long activeOrderUid;
    public boolean activeOrderCompleted; // false, except when activeOrder is completely filled
    public OrderAction activeOrderAction; // assume matched order has opposite action
//    public long activeOrderSeq;

    public long matchedOrderId;
    public long matchedOrderUid; // 0 for rejection
    public boolean matchedOrderCompleted; // false, except when matchedOrder is completely filled

    public long price; // 0 for rejection
    public long size;  // ? unmatched size for rejection
    public long timestamp; // same as activeOrder related event timestamp

    


  
   

}