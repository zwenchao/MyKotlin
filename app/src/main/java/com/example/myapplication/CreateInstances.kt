package com.example.myapplication

import android.os.Parcel
import android.os.Parcelable

class CreateInstances() : Parcelable {
    constructor(parcel: Parcel) : this() {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<CreateInstances> {
        override fun createFromParcel(parcel: Parcel): CreateInstances {
            return CreateInstances(parcel)
        }

        override fun newArray(size: Int): Array<CreateInstances?> {
            return arrayOfNulls(size)
        }
    }
}