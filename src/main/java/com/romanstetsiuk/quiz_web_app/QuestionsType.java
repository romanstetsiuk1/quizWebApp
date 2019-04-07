package com.romanstetsiuk.quiz_web_app;

import javax.persistence.*;
import java.util.List;

@Entity
public class QuestionsType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;

    @OneToMany
    List<Questions> questionsList;


}
