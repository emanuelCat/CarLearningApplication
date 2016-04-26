package com.emanuelcatoui.me.schoolproject;


import android.os.Parcel;
import android.os.Parcelable;


/**
 * Created by Me on 18/03/2016.
 */
public class Subject implements Parcelable
{
    private int mImageId;
    private String [] mLearningMaterial;
    private String mTitle;

    public Subject(int imagedId, String [] material, String title)
    {
        this.mImageId = imagedId;
        this.mLearningMaterial = material;
        this.mTitle = title;
    }

    public Subject(Parcel source) {
        this.mImageId = source.readInt();
        this.mLearningMaterial = source.createStringArray();
        this.mTitle = source.readString();
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(mImageId);
        dest.writeStringArray(mLearningMaterial);
        dest.writeString(mTitle);
    }

    public static final Creator<Subject> CREATOR = new Creator<Subject>() {
        @Override
        public Subject[] newArray(int size) {
            return new Subject[size];
        }

        @Override
        public Subject createFromParcel(Parcel source) {
            return new Subject(source);
        }
    };


    public void setImageId(int imageId)
    {
        this.mImageId = imageId;
    }

    public void setLearningMaterial(String[] learningMaterial)
    {
        this.mLearningMaterial = learningMaterial;
    }

    public int getMaterialLength()
    {
        return this.mLearningMaterial.length;
    }

    public int getImageId()
    {
        return this.mImageId;
    }

    public String getMaterialAtIndex(int index)
    {
        return this.mLearningMaterial[index];
    }

    public void setTitle(String newTitle)
    {
        this.mTitle = newTitle;
    }

    public String getTitle()
    {
        return this.mTitle;
    }


}
