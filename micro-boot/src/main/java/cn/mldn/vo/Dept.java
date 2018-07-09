package cn.mldn.vo;

import java.io.Serializable;

import javax.persistence.Cacheable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Cacheable(true) 
@Entity
@SuppressWarnings("serial")
public class Dept implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	private Long deptno ;
	private String dname ;
	public Long getDeptno() {
		return deptno;
	}
	public void setDeptno(Long deptno) {
		this.deptno = deptno;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
}
