package it.elhawy.lastapp;

class designers {
    int userimg,rating;
    String username;

    public designers(int userimg, int rating, String username) {
        this.userimg = userimg;
        this.rating = rating;
        this.username = username;
    }

    public int getUserimg() {
        return userimg;
    }

    public int getRating() {
        return rating;
    }

    public String getUsername() {
        return username;
    }
}
