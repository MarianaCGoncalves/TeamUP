package pt.iade.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity

@Table(name = "comment")

public class Comment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comm_id") private int commentId;
    @Column(name = "comm_mes_id") private int commentMessageIid;
    @Column(name = "comm_ug_id") private int commentUserGroupIid;
    @Column(name = "comm_mes_text") private String commentText;
    
    public Comment(int commentMessageIid, int commentUserGroupIid, String commentText) {
        this.commentMessageIid = commentMessageIid;
        this.commentUserGroupIid = commentUserGroupIid;
        this.commentText = commentText;
    }

    public int getCommentId() {
        return commentId;
    }

    public int getCommentMessageIid() {
        return commentMessageIid;
    }

        public int getCommentUserGroupIid() {
        return commentUserGroupIid;
    }

    public String getCommentText() {
        return commentText;
    }

    public void setCommentText(String commentText) {
        this.commentText = commentText;
    }
  
}

