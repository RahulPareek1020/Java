package com.company.model;

public enum InputCommand {

    SIGNUP(1),
    LOGOUT(2),
    LOGIN(3),
    POST(4),
    UPVOTE(5),
    DOWNVOTE(6),
    FOLLOW(7),
    REPLY(8),
    SHOWNEWSFEED(9)
    ;

    int code;

    InputCommand(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }
}
