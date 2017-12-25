package com.example.knifestart.domain.responses

import android.os.Parcel
import android.os.Parcelable

/**
 * Created by glebkalinichenko on 19.12.17.
 */
data class PostResponse(var title: String?, var author: String?, var numComments: Int?, var created: Long?, var thumbnail: String?,
                        var url: String?) : Parcelable {
    constructor(parcel: Parcel) : this(
            parcel.readString(),
            parcel.readString(),
            parcel.readValue(Int::class.java.classLoader) as? Int,
            parcel.readValue(Long::class.java.classLoader) as? Long,
            parcel.readString(),
            parcel.readString()) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeString(title)
        parcel.writeString(author)
        parcel.writeValue(numComments)
        parcel.writeValue(created)
        parcel.writeString(thumbnail)
        parcel.writeString(url)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<PostResponse> {
        override fun createFromParcel(parcel: Parcel): PostResponse {
            return PostResponse(parcel)
        }

        override fun newArray(size: Int): Array<PostResponse?> {
            return arrayOfNulls(size)
        }
    }
}