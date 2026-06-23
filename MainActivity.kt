package com.example.weatherapp

class MainActivity {

    private val repository = WeatherRepository()

    fun afficherMeteo() {

        val weather = repository.getWeather("Montréal")

        println("Ville : ${weather.city}")
        println("Température : ${weather.temperature}°C")
        println("Humidité : ${weather.humidity}%")
        println("Vent : ${weather.windSpeed} km/h")
        println("Description : ${weather.description}")
    }
}
