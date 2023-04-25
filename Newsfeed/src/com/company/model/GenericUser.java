package com.company.model;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericUser {

     private String userName;
     private String password;
     private Map<Integer, GenericPost> postList ;
     private Map<String, GenericUser> following ;

    public GenericUser(String userName, String password) {
        this.userName = userName;
        this.password = password;
        postList = new HashMap<Integer, GenericPost>();
        following = new HashMap<String, GenericUser>();
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Map<Integer, GenericPost> getPostList() {
        return postList;
    }

    public void setPostList(Map<Integer, GenericPost> postList) {
        this.postList = postList;
    }

    public Map<String, GenericUser> getFollowing() {
        return following;
    }

    public void setFollowing(Map<String, GenericUser> following) {
        this.following = following;
    }
}
