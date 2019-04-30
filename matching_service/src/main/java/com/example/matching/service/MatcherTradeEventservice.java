package com.example.matching.service;

import java.util.Objects;

import com.example.matching.model.MatcherEventType;
import com.example.matching.model.MatcherTradeEvent;




public class MatcherTradeEventservice {
	private MatcherEventType eventType;


	public MatcherTradeEvent copy() {
        MatcherTradeEvent evt = new MatcherTradeEvent();
        evt.eventType = this.eventType;
        evt.activeOrderId = this.activeOrderId;
        evt.activeOrderUid = this.activeOrderUid;
        evt.activeOrderCompleted = this.activeOrderCompleted;
        evt.activeOrderAction = this.activeOrderAction;
        evt.matchedOrderId = this.matchedOrderId;
        evt.matchedOrderUid = this.matchedOrderUid;
        evt.matchedOrderCompleted = this.matchedOrderCompleted;
        evt.price = this.price;
        evt.size = this.size;
        evt.timestamp = this.timestamp;
        return evt;
    }

	
    @Override
    public boolean equals(Object o) {
        if (o == this) return true;
        if (o == null) return false;
        if (!(o instanceof MatcherTradeEvent)) return false;
        MatcherTradeEvent other = (MatcherTradeEvent) o;
        return new EqualsBuilder()
                .append(symbol, other.symbol)
                .append(activeOrderId, other.activeOrderId)
                .append(activeOrderUid, other.activeOrderUid)
                .append(activeOrderCompleted, other.activeOrderCompleted)
                .append(activeOrderAction, other.activeOrderAction)
                .append(matchedOrderId, other.matchedOrderId)
                .append(matchedOrderUid, other.matchedOrderUid)
                .append(matchedOrderCompleted, other.matchedOrderCompleted)
                .append(price, other.price)
                .append(size, other.size)
                
                .append(nextEvent, other.nextEvent)
                .isEquals();
    }

    
    @Override
    public int hashCode() {
        return Objects.hash(
                symbol,
                activeOrderId,
                activeOrderUid,
                activeOrderCompleted,
                activeOrderAction,
                matchedOrderId,
                matchedOrderUid,
                matchedOrderCompleted,
                price,
                size,
                nextEvent);
    }
}
