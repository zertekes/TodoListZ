package com.nazoweb.TodoListZ.datamodel;

import java.time.LocalDate;

/**
 * Created by zertekes on 24/05/2016.
 */
public class TodoItem {
    private String sortdescription;
    private String details;
    private LocalDate deadLine;

    public TodoItem(String sortdescription, String details, LocalDate deadLine) {
        this.sortdescription = sortdescription;
        this.details = details;
        this.deadLine = deadLine;
    }

    public String getSortdescription() {
        return sortdescription;
    }

    public void setSortdescription(String sortdescription) {
        this.sortdescription = sortdescription;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    @Override
    public String toString() {
        return sortdescription;
    }
}
