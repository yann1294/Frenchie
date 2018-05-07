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
}
