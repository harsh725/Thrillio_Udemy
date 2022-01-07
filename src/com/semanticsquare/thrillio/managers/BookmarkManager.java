package com.semanticsquare.thrillio.managers;

import com.semanticsquare.thrillio.entities.Book;
import com.semanticsquare.thrillio.entities.Movie;

public class BookmarkManager {
    private  static BookmarkManager instance = new BookmarkManager();
    private BookmarkManager(){}

    public static BookmarkManager getInstance(){
        return instance;
    }

    public Book createBook(long id , String title , int publicationYear , String publisher, String[] author, String genre, double amazonRating){

        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setPublisher(publisher);
        book.setPublicationYear(publicationYear);
        book.setGenre(genre);
        book.setAuthors(author);
        book.setAmazonRating(amazonRating);

        return book;
    }
    public Movie createMovie(long id , String title, String profileUrl , int releaseYear, String[] cast, String[] directors, String genre, double imdbRating){
        Movie movie = new Movie();
        movie.setId(id);
        movie.setTitle(title);
        movie.setProfileUrl(profileUrl);
        movie.setCast(cast);
        movie.setReleaseYear(releaseYear);
        movie.setImdbRating(imdbRating);
        movie.setDirectors(directors);
        movie.setGenre(genre);

        return movie;
    }



}

