package com.liveramp.companyfinder.ui.model

import java.io.Serializable


data class Company(
    val Id: String? = null,
    val name: String? = null,
    val picture: String? = null,
    val age: Int? = null,
    val gender: String? = null,
    val company: String? = null,
    val email: String? = null,
    val phone: String? = null,
    val address: String? = null
) : Serializable