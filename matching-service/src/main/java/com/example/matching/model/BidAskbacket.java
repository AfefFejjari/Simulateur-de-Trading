package com.example.matching.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
@Getter @Setter
@Document(collection = "BidAskbacket")
public class BidAskbacket {

	public int askSize;
    public int bidSize;

    public long[] askPrices;
    public long[] askVolumes;
    public long[] bidPrices;
    public long[] bidVolumes;
    
    
    public BidAskbacket(long[] askPrices, long[] askVolumes, long[] bidPrices, long[] bidVolumes) {
        this.askPrices = askPrices;
        this.askVolumes = askVolumes;
        this.bidPrices = bidPrices;
        this.bidVolumes = bidVolumes;

        this.askSize = askPrices.length;
        this.bidSize = bidPrices.length;
    }
    
    public BidAskbacket(int askSize, int bidSize) {
        this.askPrices = new long[askSize];
        this.bidPrices = new long[bidSize];
        this.askVolumes = new long[askSize];
        this.bidVolumes = new long[bidSize];
    }
}
