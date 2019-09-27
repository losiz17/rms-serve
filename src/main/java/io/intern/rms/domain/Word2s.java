package io.intern.rms.domain;

import javax.persistence.*;


@Entity
public class Word2s {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String word;

    private Integer count;

//    @ManyToMany
////    @JoinTable(name="word_article2s", joinColumns = @JoinColumn( name = "word_id"),
////            inverseJoinColumns = @JoinColumn(name="article_id"))
////    private List<Articles> articlesList;

    private Word2s(){
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

//    public List<Articles> getArticlesList() {
//        return articlesList;
//    }
//
//    public void setArticlesList(List<Articles> articlesList) {
//        this.articlesList = articlesList;
//    }
}
