package com.example.myapplication;

public class Doc {
    private String docName;
    private String SpecializationName;
    private int docImage;
    private int starImage;

    public Doc(String docName, String specializationName, int docImage, int starImage) {
        this.docName = docName;
        this.SpecializationName = specializationName;
        this.docImage = docImage;
        this.starImage = starImage;
    }

    public String getDocName() {
        return docName;
    }

    public void setDocName(String docName) {
        this.docName = docName;
    }

    public String getSpecializationName() {
        return SpecializationName;
    }

    public void setSpecializationName(String specializationName) {
        SpecializationName = specializationName;
    }

    public int getDocImage() {
        return docImage;
    }

    public void setDocImage(int docImage) {
        this.docImage = docImage;
    }

    public int getStarImage() {
        return starImage;
    }

    public void setStarImage(int starImage) {
        this.starImage = starImage;
    }


    }


