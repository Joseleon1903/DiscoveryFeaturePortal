package com.discovery.feature.portal.mvc.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="Rows_Tab")
@NamedQueries({
		 @NamedQuery(name="RowsTab.BuscarTodos", query="SELECT r FROM RowsTab r") ,
		 @NamedQuery(name="RowsTab.BuscarPorId", query="SELECT r FROM RowsTab r WHERE r.rowId = :rowId")
})
public class RowsTab implements Serializable{
	
	private long rowId;
	private String id;
	private ExampleTab example;
	private List<CellsTab> cells;

	public RowsTab() {
		// TODO Auto-generated constructor stub
	}

	@SequenceGenerator(name="Rows_Gen", sequenceName="Rows_Seq")
	@Id @GeneratedValue(generator="Rows_Gen")
    @Column(name="ROW_ID", nullable= false)
	public long getRowId() {
		return rowId;
	}

	public void setRowId(long rowId) {
		this.rowId = rowId;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	@OneToMany(mappedBy="row")
	public List<CellsTab> getCells() {
		return cells;
	}

	public void setCells(List<CellsTab> cells) {
		this.cells = cells;
	}	

	@ManyToOne
    @JoinColumn(name="EXAMPLE_ID", nullable=false)
	public ExampleTab getExample() {
		return example;
	}

	public void setExample(ExampleTab example) {
		this.example = example;
	}

	@Override
	public String toString() {
		return "RowsTab [rowId=" + rowId + ", id=" + id + ", example=" + example + ", cells=" + cells + "]";
	}

}
