package com.emilabdurahmanli.doctorapplication.model

import java.io.Serializable

data class Doctor(var image : Int, var name : String, var profession : String, var hospital : String, var openClose : Int, var viewCount : Int):Serializable
