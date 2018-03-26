package com.discovery.feature.portal.mvc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Cells_Tab")
@NamedQueries({
		 @NamedQuery(name="CellsTab.BuscarTodos", query="SELECT c FROM CellsTab c") ,
		 @NamedQuery(name="CellsTab.BuscarPorId", query="SELECT c FROM CellsTab c WHERE c.cellId = :cellId")
})
public class CellsTab implements Serializable{
	
	private long cellId;
	private RowsTab row;
	private String content;
	
	public CellsTab() {
		super();
	}

	public CellsTab(long cellId, RowsTab row, String content) {
		super();
		this.cellId = cellId;
		this.row = row;
		this.content = content;
	}

	@SequenceGenerator(name="Cells_Gen", sequenceName="Cells_Seq")
	@Id @GeneratedValue(generator="Cells_Gen")
    @Column(name="CELL_ID", nullable= false)
	public long getCellId() {
		return cellId;
	}

	public void setCellId(long cellId) {
		this.cellId = cellId;
	}

	@ManyToOne
    @JoinColumn(name="ROW_ID", nullable=false)
	public RowsTab getRow() {
		return row;
	}

	public void setRow(RowsTab row) {
		this.row = row;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
	
}