package com.kyunghwan.controller;

import com.kyunghwan.domain.Comment;
import com.kyunghwan.domain.ToDoList;
import com.kyunghwan.service.CommentService;
import com.kyunghwan.service.ToDoListService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@Controller
@RequiredArgsConstructor
@RequestMapping("/comment")
public class CommentController {

    private final CommentService commentService;

    @PostMapping
    public ResponseEntity<?> postComment(@RequestBody Map<String, String> map) {
        commentService.registerComment(map);
        return new ResponseEntity<>("{}", HttpStatus.CREATED);
    }
}