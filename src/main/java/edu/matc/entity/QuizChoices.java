package edu.matc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

// #TODO FK to QUIZ and QUIZ QUESTIONS
/**
 * Class Represents a quiz choice and whether it is a correct answer.
 *
 * @author josephcaughlin
 */
@ToString
@NoArgsConstructor
@Entity
@Table(name="quiz_choices")
public class QuizChoices {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter @Setter int id;

    @Column(name="quiz_choices")
    @Getter @Setter String quizChoices;

    @Column(name="correct_answer")
    @Getter @Setter Boolean isCorrect = false;
}
