package com.example.hospitalcleaner.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

public class FeedbackEntityDRequest implements Serializable {
    private int id;

    public FeedbackEntityDRequest(int id) {
        this.id = id;
    }

    public FeedbackEntityDRequest() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
