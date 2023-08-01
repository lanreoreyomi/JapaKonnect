package com.example.japakonnect

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform