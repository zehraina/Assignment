package com.example.beans;

import java.util.Date;
import org.springframework.stereotype.Component;

@Component
public class StudentCreateResponse {

    private String id;
    private Date UpdatedTime;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Date getUpdatedTime() {
        return UpdatedTime;
    }
    public void setUpdatedTime(Date updatedTime) {
        UpdatedTime = updatedTime;
    }
}
