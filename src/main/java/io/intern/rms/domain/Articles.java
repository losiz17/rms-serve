package io.intern.rms.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Articles {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private Integer count;

    private String content;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="author_id")
    @JsonIgnore
    private Authors author;



//    @ManyToMany(mappedBy = "articles")
//    private List<Word2s> word2sList ;


    private Articles(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public Authors getAuthor() {
        return author;
    }

    public void setAuthor(Authors author) {
        this.author = author;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    //    public List<Word2s> getWords() {
//        return word2sList;
//    }
//
//    public void setWords(List<Word2s> words) {
//        this.word2sList = words;
//    }
}
