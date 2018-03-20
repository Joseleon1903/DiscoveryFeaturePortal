package com.discovery.feature.portal.mvc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Comments_Tab")
@NamedQueries({
		 @NamedQuery(name="CommentsTab.BuscarTodos", query="SELECT c FROM CommentsTab c") ,
		 @NamedQuery(name="CommentsTab.BuscarPorId", query="SELECT c FROM CommentsTab c WHERE c.commentId = :commentId")
})
public class CommentsTab implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7906686523783369896L;
	
	private Long commentId;
	private String value;

	public CommentsTab() {
		// TODO Auto-generated constructor stub
	}

	@SequenceGenerator(name="Comments_Gen", sequenceName="Comments_Seq")
	@Id @GeneratedValue(generator="Comments_Gen")
    @Column(name="COMMENT_ID", nullable= false)
	public Long getCommentId() {
		return commentId;
	}

	public void setCommentId(Long commentId) {
		this.commentId = commentId;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "CommentsTab [CommentId=" + commentId + ", value=" + value + "]";
	}

}
