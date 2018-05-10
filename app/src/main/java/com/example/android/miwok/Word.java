package com.example.android.miwok;

public class Word {
    private String miwokTranslation;
    private String defaultTranslation;
    private int imageResourceId = NO_IMAGE_PROVIDED;
    private int soundResourceId;
    private static final int NO_IMAGE_PROVIDED = -1;

    public Word(String defaultTranslation, String miwokTranslation, int soundResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.soundResourceId = soundResourceId;
    }

    public Word(String defaultTranslation, String miwokTranslation, int imageResourceId, int soundResourceId) {
        this.miwokTranslation = miwokTranslation;
        this.defaultTranslation = defaultTranslation;
        this.imageResourceId = imageResourceId;
        this.soundResourceId = soundResourceId;
    }

    public String getDefaultTranslation() {
        return defaultTranslation;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public int getImageResourceId() { return imageResourceId; }

    public int getSoundResourceId() { return soundResourceId; }

    public boolean hasImage() { return imageResourceId != NO_IMAGE_PROVIDED; }

    @Override
    public String toString() {
        return "Word{" +
                "mDefaultTranslation='" + defaultTranslation + '\'' +
                ", mMiwokTranslation='" + miwokTranslation + '\'' +
                ", mAudioResourceId=" + soundResourceId +
                ", mImageResourceId=" + imageResourceId +
                '}';
    }
}
