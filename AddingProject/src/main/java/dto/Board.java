package dto;

import java.sql.Date;

public class Board {
	public int bdNo;
	public String bdName;
	public String bdTitle;
	public String bdContent;
	public Date bdDate;
	
	public Board() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Board [bdNo=" + bdNo + ", bdName=" + bdName + ", bdTitle=" + bdTitle + ", bdContent=" + bdContent
				+ ", bdDate=" + bdDate + "]";
	}

	public Board(int bdNo, String bdName, String bdTitle, String bdContent, Date bdDate) {
		super();
		this.bdNo = bdNo;
		this.bdName = bdName;
		this.bdTitle = bdTitle;
		this.bdContent = bdContent;
		this.bdDate = bdDate;
	}

	public int getBdNo() {
		return bdNo;
	}

	public void setBdNo(int bdNo) {
		this.bdNo = bdNo;
	}

	public String getBdName() {
		return bdName;
	}

	public void setBdName(String bdName) {
		this.bdName = bdName;
	}

	public String getBdTitle() {
		return bdTitle;
	}

	public void setBdTitle(String bdTitle) {
		this.bdTitle = bdTitle;
	}

	public String getBdContent() {
		return bdContent;
	}

	public void setBdContent(String bdContent) {
		this.bdContent = bdContent;
	}

	public Date getBdDate() {
		return bdDate;
	}

	public void setBdDate(Date bdDate) {
		this.bdDate = bdDate;
	}
	
	
}