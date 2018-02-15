package edu.matc.entity;

import lombok.Data;

@Data
public class LearningModules {

    private long learningModuleid_pk;
    private String category;
    // Reading Language Arts Site Words
    // Math
    // Writing
    // Science
    private int gradeLevel; // k-4
    private String moduleName;

}
