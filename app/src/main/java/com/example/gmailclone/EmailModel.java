package com.example.gmailclone;

public class EmailModel {
    String title;
    String preview;
    String time;
    Boolean isStarred ;

    public EmailModel(String title, String preview, String time) {
        this.title = title;
        this.preview = preview;
        this.time = time;
        this.isStarred = false;
    }
}
