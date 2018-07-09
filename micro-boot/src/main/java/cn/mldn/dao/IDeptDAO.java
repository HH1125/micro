package cn.mldn.dao;

import org.springframework.data.jpa.repository.JpaRepository;
 
import cn.mldn.vo.Dept;
public interface IDeptDAO extends JpaRepository<Dept, Long>{
}
