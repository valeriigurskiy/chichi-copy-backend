package chichi.copy.controllers;

import chichi.copy.entity.Comments;
import chichi.copy.entity.Salon;
import chichi.copy.services.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/comments")
@CrossOrigin(origins = "*")
public class CommentController {

    @Autowired
    private CommentService commentService;

    @GetMapping()
    public List<Comments> getAll() {
        return commentService.getAllComments();
    }

    @GetMapping(value = "/{id}")
    public Comments findSalon(@PathVariable int id) {
        return commentService.getComment(id);
    }

    @PostMapping()
    public Comments addSalon(@RequestBody Comments comment) {
        return commentService.addComment(comment);
    }

    @GetMapping(value = "/salon/{id}")
    public List<Comments> getSalonsByType(@PathVariable int id) {
        return commentService.getCommentsBySalon(id);
    }

}
