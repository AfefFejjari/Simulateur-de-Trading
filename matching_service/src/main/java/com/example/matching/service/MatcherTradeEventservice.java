package com.example.matching.service;

import java.util.Objects;

import com.example.matching.model.EqualsBuilder;
import com.example.matching.model.MatcherTradeEvent;

//reference to next event in chain
public MatcherTradeEvent nextEvent;
//testing only
public class MatcherTradeEventservice {
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

	/**
     * Compare next events chain as well.
     */
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
                // ignore timestamp
                .append(nextEvent, other.nextEvent)
                .isEquals();
    }

    /**
     * Includes chaining events
     */
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
