package com.company.controller;

import com.company.exception.InvalidUserException;
import com.company.exception.NoUserLoggedInException;
import com.company.model.InputCommand;
import com.company.service.TaskService;

public class CommandDelegator {


    public static String delegateDesiredOperation(InputCommand command) throws InvalidUserException, NoUserLoggedInException {

        TaskService service = new TaskService();
        switch (command)
        {
            case SIGNUP:
                return service.signupUser();
            case LOGOUT:
                return "User logged out successfully";
            case LOGIN:
                 String userName = service.loginUser();
                return "User *" + userName + "* logged in successfully";
            case POST:
                String user = service.userName;
                if (user == null) throw new NoUserLoggedInException("Please login first to post");
                return service.postComment(user);
            case UPVOTE:
                service.upVoteComment();
            case DOWNVOTE:
                service.downVoteComment();
            case FOLLOW:
               return service.followUser();
            case REPLY:
                return service.reply();
            case SHOWNEWSFEED:
                return service.showNewsFeed();
        }
        return null;
    }
}
