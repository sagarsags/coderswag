package com.practice.sagar.coderswag.Services

import com.practice.sagar.coderswag.Model.Category
import com.practice.sagar.coderswag.Model.Product

object DataServices {

    val catogaries = listOf(

          Category("SHIRTS","shirtimage"),
          Category("HOODIES","hoodieimage"),
          Category("HATS","hatimage"),
          Category("DIGITAL","digitalgoodsimage")
    )
    val hats= listOf(

        Product("Royal Challenger Hat","200 Rs","hat1"),
        Product("Mumbai Indians Hat","100 Rs","hat2"),
        Product("Chennai Super king Hat","150 Rs","hat3"),
        Product("Kolkata Night Riders Hat","250 Rs","hat4")

    )

    val hoodies= listOf(

        Product("Royal Challenger Hoodies","500 RS","hoodie1"),
        Product("Mumbai Indians Hoodies","400 RS","hoodie2"),
        Product("Chennai Super kings Hoodies","600 RS","hoodie3"),
        Product("Kolkata Night Riders Hoodies","700 RS","hoodie4")

    )
    val shirts = listOf(

        Product("Royal Challengers Shirts","890 RS","shirt1"),
        Product("Mumbai Indians Shirts","650 RS","shirt2"),
        Product("Chennai Super kings Shirts","450 RS","shirt3"),
        Product("Kolkata Night Riders Shirts","750 RS","shirt4"),
        Product("Delhi Daredevils Shirts","550 RS","shirt5")

    )
}