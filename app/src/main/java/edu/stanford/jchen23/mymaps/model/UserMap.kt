package edu.stanford.jchen23.mymaps.model

import java.io.Serializable

data class UserMap (val title: String, val places: List<Place>) : Serializable