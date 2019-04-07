package com.romanstetsiuk.quiz_web_app;

import javax.persistence.*;
import java.util.List;

@Entity
public class QuestionType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String kategory;

    @OneToMany
    List<Question> questionList;


}
