package edu.matc.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.util.*;

/**
 *
 */
@NoArgsConstructor
@ToString
@Table(name ="quiz_questions")
@Entity(name = "QuizQuestions")
public class QuizQuestions {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO, generator = "native")
    @GenericGenerator(name = "native", strategy = "native")
    @Getter @Setter private int id;

    @Column(name="quiz_question")
    @Getter @Setter private String question;

    @ManyToOne
    @Getter @Setter private Quiz quiz;

    @OneToMany(mappedBy = "question")
    @Getter @Setter private List<QuestionChoices> choices = new ArrayList<>();

    public QuizQuestions(String question, Quiz quiz, List<QuestionChoices> choices){
            this.question = question;
            this.quiz = quiz;
            this.choices = choices;

    }



}
