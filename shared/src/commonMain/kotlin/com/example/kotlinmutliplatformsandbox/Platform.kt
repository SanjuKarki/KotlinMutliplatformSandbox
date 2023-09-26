package com.example.kotlinmutliplatformsandbox

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform