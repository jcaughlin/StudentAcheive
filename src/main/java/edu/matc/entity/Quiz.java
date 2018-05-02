package edu.matc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

/**
 * This Class Represents a Quiz.
 *
 * @author josephcaughlin
 */
@ToString
@NoArgsConstructor
@Entity
@Table(name="quiz")
public class Quiz {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter @Setter private int id;

    @Column(name="quiz_name", unique = true, nullable = false)
    @Getter @Setter private String quizName;

    @Column(name="quiz_author")
    @Getter @Setter private String quizAuthor;

    @Column(name="quiz_created_date")
    @Getter @Setter private LocalDate quizCreatedDate;

    @Column(name="quiz_last_updated")
    @Getter @Setter private LocalDate quizLastUpDated;

    @OneToMany(mappedBy = "quiz", cascade = CascadeType.ALL, orphanRemoval = true,fetch=FetchType.EAGER)
    @Getter @Setter private Set<QuizQuestions> questions = new HashSet<>();

   public Quiz(String quizName,String quizAuthor,QuizQuestions questions) {
       this.quizName = quizName;
       this.quizAuthor = quizAuthor;

   }


}
