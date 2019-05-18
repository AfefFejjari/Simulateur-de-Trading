package com.example.matching.model;


import java.util.List;

import org.bson.types.ObjectId;
import org.springframework.data.annotation.*;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import lombok.Getter;
import lombok.Setter;


@Getter @Setter
@Document(collection = "watchlist")
public class watchlist {
	
	@Id
    @Field("_id")
    private ObjectId id;
    private List<Contract> contracts;



    public String getId() { return id.toHexString(); }

}
