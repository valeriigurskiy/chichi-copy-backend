package chichi.copy.services;

import chichi.copy.dao.CommentDao;
import chichi.copy.entity.Comments;
import chichi.copy.services.interfaces.ICommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommentService implements ICommentService {
    @Autowired
    private CommentDao commentDao;

    @Override
    public Comments addComment(Comments comments) {
        return commentDao.save(comments);
    }

    @Override
    public List<Comments> getAllComments() {
        return commentDao.findAll();
    }

    @Override
    public Comments getComment(int id) {
        return commentDao.findById(id).orElseThrow(() -> new RuntimeException("Error"));
    }

    @Override
    public void removeComments(int id) {
        commentDao.deleteById(id);
    }

    @Override
    public List<Comments> getCommentsBySalon(int id) {
        return commentDao.getCommentsBySalon(id);
    }
}
