package chichi.copy.dao;

import chichi.copy.entity.Comments;
import chichi.copy.entity.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CommentDao extends JpaRepository<Comments, Integer> {

    @Query(value = "select c from Comments c where c.salon=:salon")
    List<Comments> getCommentsBySalon(int salon);

}
