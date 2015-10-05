package com.techarha.java.manin.domain;

import javax.persistence.*;

/**
 * Created by ankit on 05/10/15.
 */
@Entity
@Table(name = "ratings", schema = "", catalog = "manin")
public class RatingsEntity {
    private int id;
    private String score;
    private String comment;
    private String userName;
    private String userEmail;

    @Id
    @Column(name = "id")
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Basic
    @Column(name = "score")
    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    @Basic
    @Column(name = "comment")
    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    @Basic
    @Column(name = "user_name")
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    @Basic
    @Column(name = "user_email")
    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RatingsEntity that = (RatingsEntity) o;

        if (id != that.id) return false;
        if (score != null ? !score.equals(that.score) : that.score != null) return false;
        if (comment != null ? !comment.equals(that.comment) : that.comment != null) return false;
        if (userName != null ? !userName.equals(that.userName) : that.userName != null) return false;
        if (userEmail != null ? !userEmail.equals(that.userEmail) : that.userEmail != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (score != null ? score.hashCode() : 0);
        result = 31 * result + (comment != null ? comment.hashCode() : 0);
        result = 31 * result + (userName != null ? userName.hashCode() : 0);
        result = 31 * result + (userEmail != null ? userEmail.hashCode() : 0);
        return result;
    }
}
