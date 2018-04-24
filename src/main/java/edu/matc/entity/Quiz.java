package edu.matc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.Set;

@ToString
@NoArgsConstructor
@Entity
@Table(name="quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter @Setter private int id;



    @Getter @Setter private LocalDate quizCreatedDate;

    @Getter @Setter private String quizName;

    @Getter @Setter private String quizAuthor;

    @Getter @Setter private String student;

    @Getter @Setter private int totalQuizQuestions;

    @Getter @Setter private int studentResults;

    @Getter @Setter private Set quizQuestion;

    @Getter @Setter private LocalDate quizLastModifiedDate;

}
