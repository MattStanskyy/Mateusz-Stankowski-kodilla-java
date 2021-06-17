package com.kodilla.testing.forum.statistics;

public class ForumStatistics {

    private Statistics statistics;
    private int usersQuantity;
    private int postsQuantity;
    private int commentsQuantity;
    private double postAveragePerUser;
    private double commentsAveragePerUser;
    private double commentsAveragePerPost;

    public ForumStatistics(Statistics statistics) {
        this.statistics = statistics;
    }

    public void calculateAdvStatistics(Statistics statistics) {
        usersQuantity = statistics.usersNames().size();
        postsQuantity = statistics.postsCount();
        commentsQuantity = statistics.commentsCount();

        if (postsQuantity == 0 || usersQuantity == 0) {
            postAveragePerUser = 0.0;
        } else {
            postAveragePerUser = postsQuantity / usersQuantity;
        }

        if (commentsQuantity == 0 || usersQuantity == 0) {
            commentsAveragePerUser = 0.0;
        } else {
            commentsAveragePerUser = commentsQuantity / usersQuantity;
        }

        if (commentsQuantity == 0 || postsQuantity == 0) {
            commentsAveragePerPost = 0.0;
        } else {
            commentsAveragePerPost = commentsQuantity / postsQuantity;
        }
    }

    public int getUsersQuantity() {
        return usersQuantity;
    }

    public int getPostsQuantity() {
        return postsQuantity;
    }

    public int getCommentsQuantity() {
        return commentsQuantity;
    }

    public double getPostAveragePerUser() {
        return postAveragePerUser;
    }

    public double getCommentsAveragePerUser() {
        return commentsAveragePerUser;
    }

    public double getCommentsAveragePerPost() {
        return commentsAveragePerPost;
    }

    public void showStatistics() {
        System.out.println("Statistics:" + "\nUsers quantity: " + usersQuantity + "\nPosts quantity: " + postsQuantity + "\nComments quantity: " + commentsQuantity + "\nPost average per user : " + postAveragePerUser + "\nComments average per user: " + commentsAveragePerUser + "\nComments average per post: " + commentsAveragePerPost);
    }
}
