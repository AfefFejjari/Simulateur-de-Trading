package com.example.matching.model;

//import com.google.common.collect.Lists;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

//import com.example.matching.model.OrderCommandType.*;

@Builder
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class OrderCommand {

    public OrderCommandType command;

    public long orderId;
    public int symbol;
    public long price;  
    public long quantity;

   
    public TransactionType action;
    public OrderType orderType;

    public long uid;

    public long timestamp;

    
    public long eventsGroup;

    
    public CommandResultCode resultCode;

    public MatcherTradeEvent matcherEvent;

   

    public static OrderCommand limitOrder(long orderId, int uid, long price, long quantity, TransactionType action) {
        OrderCommand cmd = new OrderCommand();
        cmd.command = OrderCommandType.PLACE_ORDER;
        cmd.orderId = orderId;
        cmd.uid = uid;
        cmd.price = price;
        cmd.quantity = quantity;
        cmd.action = action;
        cmd.orderType = OrderType.LIMIT;
        cmd.resultCode = CommandResultCode.VALID_FOR_MATCHING_ENGINE;
        return cmd;
    }

    public static OrderCommand marketOrder(long orderId, int uid, long size, TransactionType action) {
        OrderCommand cmd = new OrderCommand();
        cmd.command = OrderCommandType.PLACE_ORDER;
        cmd.orderId = orderId;
        cmd.uid = uid;
        cmd.price = 0;
        cmd.size = size;
        cmd.action = action;
        cmd.orderType = OrderType.MARKET;
        cmd.resultCode = CommandResultCode.VALID_FOR_MATCHING_ENGINE;
        return cmd;
    }


    public static OrderCommand cancel(long orderId, int uid) {
        OrderCommand cmd = new OrderCommand();
        cmd.command =OrderCommandType. CANCEL_ORDER;
        cmd.orderId = orderId;
        cmd.uid = uid;
        cmd.resultCode = CommandResultCode.VALID_FOR_MATCHING_ENGINE;
        return cmd;
    }

    public static OrderCommand update(long orderId, int uid, long price, long quantity) {
        OrderCommand cmd = new OrderCommand();
        cmd.command = OrderCommandType.MOVE_ORDER;
        cmd.orderId = orderId;
        cmd.uid = uid;
        cmd.price = price;
        cmd.quantity = quantity;
        cmd.resultCode = CommandResultCode.VALID_FOR_MATCHING_ENGINE;
        return cmd;
    }


    public void processMatherEvents(Consumer<MatcherTradeEvent> handler) {
        MatcherTradeEvent mte = this.matcherEvent;
        while (mte != null) {
            handler.accept(mte);
            mte = mte.nextEvent;
        }
    }

    public List<MatcherTradeEvent> extractEvents() {
        List<MatcherTradeEvent> list = new ArrayList<>();
        processMatherEvents(list::add);
        return Lists.reverse(list);
           }

    // Traverse and remove:
//    private void cleanMatcherEvents() {
//        MatcherTradeEvent ev = this.matcherEvent;
//        this.matcherEvent = null;
//        while (ev != null) {
//            MatcherTradeEvent tmp = ev;
//            ev = ev.nextEvent;
//            tmp.nextEvent = null;
//        }
//    }
//


    
    public void writeTo(OrderCommand cmd2) {
        cmd2.command = this.command;
        cmd2.orderId = this.orderId;
        cmd2.symbol = this.symbol;
        cmd2.uid = this.uid;
        cmd2.timestamp = this.timestamp;

        cmd2.price = this.price;
        cmd2.size = this.size;
        cmd2.action = this.action;
        cmd2.orderType = this.orderType;
    }

    public OrderCommand copy() {

        OrderCommand newCmd = new OrderCommand();
        writeTo(newCmd);
        newCmd.resultCode = this.resultCode;

        List<MatcherTradeEvent> events = extractEvents();

        System.out.println(">>> events: " + events);
        for (MatcherTradeEvent event : events) {
            MatcherTradeEvent copy = event.copy();
            copy.nextEvent = newCmd.matcherEvent;
            newCmd.matcherEvent = copy;


            System.out.println(">>> newCmd.matcherEvent: " + newCmd.matcherEvent);
        }


        System.out.println(">>> newCmd: " + newCmd);
        return newCmd;
    }
    /*  @param handler - MatcherTradeEvent handler
    
   public void processMatherEvents(Consumer<MatcherTradeEvent> handler) {
       MatcherTradeEvent mte = this.matcherEvent;
       while (mte != null) {
           handler.accept(mte);
           mte = mte.nextEvent;
       }
   }*/
}