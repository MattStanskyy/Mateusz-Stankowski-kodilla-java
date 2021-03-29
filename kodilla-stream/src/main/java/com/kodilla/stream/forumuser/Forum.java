package com.kodilla.stream.forumuser;

import java.util.ArrayList;
import java.util.List;

public class Forum {
    private final List<ForumUser> theUserList = new ArrayList<>();

    public Forum() {
        theUserList.add(new ForumUser(1, "James Hetfield", 'M', 1963, 8, 3, 1978));
        theUserList.add(new ForumUser(2, "Bruce Dickinson", 'M', 1958, 8, 7, 666));
        theUserList.add(new ForumUser(3, "Tarja Turunen", 'F', 1977, 8, 17, 6));
        theUserList.add(new ForumUser(4, "Rob Halford", 'F', 1951, 8, 25, 1998));
        theUserList.add(new ForumUser(5, "Tom Araya", 'M', 1961, 6, 6, 213));
        theUserList.add(new ForumUser(6, "Ozzy Osbourne", 'M', 1948, 12, 3, 2017));
        theUserList.add(new ForumUser(7, "Christina Aguilera", 'F', 1980, 12, 18, 4));
        theUserList.add(new ForumUser(8, "Robert Plant", 'M', 1948, 8, 20, 0));
        theUserList.add(new ForumUser(9, "Daria Zawiałow", 'F', 1992, 8, 18, 357));
        theUserList.add(new ForumUser(10, "Roman Kostrzewski", 'M', 1960, 2, 15,2003));
    }

    public List<ForumUser> getUserList() {
        return new ArrayList<>(theUserList);
    }
}
