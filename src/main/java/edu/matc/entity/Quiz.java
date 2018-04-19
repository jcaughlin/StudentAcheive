package edu.matc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.time.LocalDate;

@ToString
@NoArgsConstructor
@Entity
@Table(name="quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter @Setter private int id;


    @Column(name = "created_date")
    @Getter @Setter private LocalDate quizCreatedDate;

    @Column(name = "quiz_author")
    @Getter @Setter private String quizAuthor;

    @Column(name = "quiz_name")
    @Getter @Setter private String quizName;

    @Getter @Setter private String questionA;

    @Getter @Setter private String questionB;

    @Getter @Setter private String questionC;

    @Getter @Setter private String correctAnswer;

}
