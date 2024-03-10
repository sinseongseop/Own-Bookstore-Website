package com.seongseop.mybookstore.books;

public class BookDTO {
    private String title; // 책 제목
    private String author; //저자
    private String publisher; //출판사

    private String imageAddress;// 이미지가 저장된 서버의 주소

    public BookDTO(String title, String author, String publisher, String imageAddress) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.imageAddress = imageAddress;
    }

    static public BookDTO from(Book book){
        return new BookDTO(book.getTitle(), book.getAuthor(), book.getPublisher(), book.getImageAddress());
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public void setImageAddress(String imageAddress) {
        this.imageAddress = imageAddress;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getPublisher() {
        return publisher;
    }

    public String getImageAddress() {
        return imageAddress;
    }
}
