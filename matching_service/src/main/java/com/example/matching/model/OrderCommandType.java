package com.example.matching.model;

import lombok.Getter;


@Getter 
public enum OrderCommandType {
    PLACE_ORDER,
    CANCEL_ORDER,
    MOVE_ORDER,

    ORDER_BOOK_REQUEST,

    ADD_USER,
    BALANCE_ADJUSTMENT,

    CLEARING_OPERATION,

    NOP,
    SHUTDOWN_SIGNAL;

  
}