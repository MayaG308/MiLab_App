package com.example.himym;

public class ModelClass {

    private int imageView1;
    private String textView1;
    private String divider;

    ModelClass(int imageView1, String textView1, String divider){
        this.imageView1= imageView1;
        this.textView1= textView1;
        this.divider= divider;
    }

    public int getImageView1() {
        return imageView1;
    }

    public String getTextView1() {
        return textView1;
    }

    public String getDivider() {
        return divider;
    }
}
