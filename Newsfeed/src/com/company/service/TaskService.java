package com.company.service;

import com.company.exception.InvalidUserException;
import com.company.exception.NoPostExistWithTheIDException;
import com.company.model.GenericPost;
import com.company.model.GenericUser;

import java.util.*;

public class TaskService {

    private static Map<String, GenericUser> userData = new HashMap<String, GenericUser>();
    private static Map<Integer, GenericPost> postData = new TreeMap<Integer, GenericPost>();
    private Scanner sc = new Scanner(System.in);
    public static String userName = null;

    public String signupUser(){
        System.out.println("Enter userName - ");
        String userName = sc.next();
        if (userData.containsKey(userName)){
            return "User already Exist";
        }
        userData.put(userName, new GenericUser(userName,userName));
        return "Successfully created new user";
    }

    public String loginUser() throws InvalidUserException {
        System.out.println("Enter userName - ");
        String userName = sc.next();
        if (userData.containsKey(userName)){
            this.userName = userName;
            return userName ;
        }else throw new InvalidUserException("User not exist");
    }

    public String postComment(String userName) {
        System.out.println("Enter Post - ");
        String postComment = sc.next();
        GenericPost post = new GenericPost(postComment,userName);
        postData.put(post.getPostId(), post);
        return "Post added successfully";
    }

    public String showNewsFeed() {
        final StringBuilder sb = new StringBuilder();
        for (Map.Entry<Integer, GenericPost> entry : postData.entrySet()){
            sb.append(entry.getValue().toString());
            sb.append("\n\n\n");
        }
        return sb.toString();
    }

    public String upVoteComment() {
        System.out.println("Enter postid to upvote- ");
        try {
            int postId = sc.nextInt();
            GenericPost post = postData.get(postId);
            if (post == null) {
                throw new NoPostExistWithTheIDException("No post found");
            }
            post.setUpVote();
        }catch (NoPostExistWithTheIDException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Upvoted successfully";

    }

    public String downVoteComment() {

        System.out.println("Enter postid to downvote- ");
        try {
            int postId = sc.nextInt();
            GenericPost post = postData.get(postId);
            if (post == null) {
                throw new NoPostExistWithTheIDException("No post found");
            }
            post.setDownVote();
        }catch (NoPostExistWithTheIDException e) {
            e.printStackTrace();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Downvoted successfully";
    }

    public String followUser() {
        System.out.println("Enter user name to follow - ");
        System.out.println(userData);
        try {
            String userName = sc.next();
            GenericUser userToFollow = userData.get(userName);
            if (userToFollow == null) {
                throw new RuntimeException("No user found");
            };
            GenericUser currentUser = userData.get(this.userName);
            var userFollower = currentUser.getFollowing();
            userFollower.put(userName, userToFollow);

            currentUser.setFollowing(userFollower);

        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "User followed successfully";
    }

    public String reply() {
        System.out.println("Enter the post id - ");
        System.out.println(postData);
        Integer postId = sc.nextInt();

        try {
            GenericPost postToReply = postData.get(postId);

            if (postToReply == null) {
                throw new RuntimeException("Post not found");
            };

            System.out.println("Enter your reply - ");
            String replyText = sc.nextLine();

            GenericPost post = new GenericPost(replyText,userName);
            postData.put(post.getPostId(), post);

            var postReply = postToReply.getReplies();
            postReply.put(post.getPostId(), post);

            postToReply.setReplies(postReply);
            System.out.println(postData);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return "Reply Posted successfully";
    }
}
