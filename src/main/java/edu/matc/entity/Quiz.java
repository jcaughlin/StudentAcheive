package edu.matc.entity;

import edu.matc.entity.QuizQuestions;
import edu.matc.entity.User;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


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

    @ManyToOne
    @Getter @Setter private User quizAuthor;

    @OneToMany(mappedBy = "quiz")
    @Getter @Setter private List<QuizQuestions> quizQuestions;

    @Column(name="quiz_created_date")
    @Getter @Setter private LocalDate quizCreatedDate;

    @Column(name="quiz_last_updated")
    @Getter @Setter private LocalDate quizLastUpDated;

   public Quiz(String quizName,User quizAuthor, List<QuizQuestions> quizQuestions) {
       this.quizName = quizName;
       this.quizAuthor = quizAuthor;
       this.quizQuestions = quizQuestions;

   }

   public Quiz(String quizName){
       this.quizName = quizName;
   }


}
