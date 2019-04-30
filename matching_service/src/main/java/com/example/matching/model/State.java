package com.example.matching.model;

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