package com.ipap.springmongocacheabledata.entity;

import lombok.Data;
import lombok.Generated;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.MongoId;

@RequiredArgsConstructor
@Data
@Document("employee")
public class Employee {
    @MongoId
    @Generated
    private String id;
    @NonNull
    private String name;
    @NonNull
    private String code;
    private Department department;

}
