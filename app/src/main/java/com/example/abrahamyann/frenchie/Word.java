package com.example.abrahamyann.frenchie;

/**
 * {@link Word} represents a vocabulary word that the user wish to learn
 * It contains a defaultTranslation and a french translation for that word.
 * Created by Abraham on 07/05/18.
 */
public class Word {
    /* default translation for the word */
    private String mDefaultTranslation;

    /* french translation for the word */
    private String mFrenchTranslation;
    /* * Image resource ID for the word */
    private int mImageResourceId = NO_IMAGE_PROVIDED;
    //constant checking if the word has an image or not
    private static final int NO_IMAGE_PROVIDED = -1;
    /**
     *
     * @return image resource ID for the word
     */
    public int getImageResourceId() {
        return mImageResourceId;
    }

    /**
     * Parameterized constructor
     * @param defaultTranslation holds the default translation of the word.
     * @param frenchTranslation  holds the french  translation of the word.
     */
    public Word(String defaultTranslation, String frenchTranslation) {
        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = frenchTranslation;
    }

    /**
     *
     * @param defaultTranslation holds the default translation of the word.
     * @param frenchTranslation  holds the default translation of the word.
     * @param imageResourceId holds the image for the word.
     */
    public Word(String defaultTranslation, String frenchTranslation, int imageResourceId) {
        mDefaultTranslation = defaultTranslation;
        mFrenchTranslation = frenchTranslation;
        mImageResourceId = imageResourceId;
    }

    /**
     * get the default translation of the word.
     * @return the default translation.
     */
    public String getDefaultTranslation() {
        return mDefaultTranslation;
    }

    /**
     * get the french translation of the word.
     * @return the french translation.
     */
    public String getFrenchTranslation() {
        return mFrenchTranslation;
    }

    /**
     *
     * @return whether or not there are an image for
     * this word.
     */
    public boolean hasImage(){
        return mImageResourceId != NO_IMAGE_PROVIDED;
    }
}
