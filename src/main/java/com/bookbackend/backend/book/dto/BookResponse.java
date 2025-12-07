package com.bookbackend.backend.book.dto;

import com.bookbackend.backend.book.entity.Book;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class BookResponse {
    private Long bookId;
    private String title;
    private String description;
    private String content;
    private String genre;
    private String author;
    private String imageUrl;

    public static BookResponse from(Book book) {
        BookResponse dto = new BookResponse();
        dto.setBookId(book.getBookId());
        dto.setTitle(book.getTitle());
        dto.setDescription(book.getDescription());
        dto.setContent(book.getContent());
        dto.setGenre(book.getGenre());
        dto.setAuthor(book.getAuthor());
        dto.setImageUrl(book.getImageUrl());

        return dto;
    }
}
