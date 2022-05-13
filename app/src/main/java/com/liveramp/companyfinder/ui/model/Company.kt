package com.liveramp.companyfinder.ui.model

import java.io.Serializable


data class Company(
    val Id: String? = null,
    val picture: String? = null,
    val name: String? = null,
    val email: String? = null,
    val phone: String? = null,
    val address: String? = null
) : Serializable