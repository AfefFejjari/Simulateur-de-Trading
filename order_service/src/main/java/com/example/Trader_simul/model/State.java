package com.example.Trader_simul.model;

public enum State{
	PENDING,
    OPEN,
    EXPIRED,
    CANCEL,
    FILLED,
    PARTIAL,
    CONTRAGENT_CANCEL,
    SYSTEM_REJECT,
    SYSTEM_CANCEL;
}