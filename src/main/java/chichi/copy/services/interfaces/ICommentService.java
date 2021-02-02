package chichi.copy.services.interfaces;

import chichi.copy.entity.Comments;
import chichi.copy.entity.Employees;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ICommentService {

    Comments addComment(Comments comments);

    List<Comments> getAllComments();

    Comments getComment(int id);

    void removeComments(int id);

    List<Comments> getCommentsBySalon(int id);

}
