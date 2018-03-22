package edu.matc.entity;

import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

public class Assessment {

    @Getter @Setter private int id;
    @Getter @Setter private LocalDate assessmentCreatedDate;
    @Getter @Setter private String assessmentName;
    // JSON STRING OF QUESTIOND

    public Assessment() {

    }
}
