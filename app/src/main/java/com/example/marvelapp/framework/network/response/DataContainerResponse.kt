package com.example.marvelapp.framework.network.response

import android.location.GnssAntennaInfo.PhaseCenterOffset

data class DataContainerResponse(
    val offset: Int,
    val total : Int,
    val results : List<CharacterResponse>
)
