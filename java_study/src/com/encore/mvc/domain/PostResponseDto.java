package com.encore.mvc.domain;

public class PostResponseDto {

    private int idx ;
    private String title ;
    private String content ;
    private String writer ;
    public PostResponseDto() {
        super();
        // TODO Auto-generated constructor stub
    }
    public PostResponseDto(int idx, String title, String content, String writer) {
        super();
        this.idx = idx;
        this.title = title;
        this.content = content;
        this.writer = writer;
    }
    public int getIdx() {
        return idx;
    }
    public void setIdx(int idx) {
        this.idx = idx;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getContent() {
        return content;
    }
    public void setContent(String content) {
        this.content = content;
    }
    public String getWriter() {
        return writer;
    }
    public void setWriter(String writer) {
        this.writer = writer;
    }
    @Override
    public String toString() {
        return "PostResponseDto [idx=" + idx + ", title=" + title + ", content=" + content + ", writer=" + writer + "]";
    }

}











