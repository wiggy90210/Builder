package com.movi_przemek.sample.builder.house

class House private constructor(
    val walls: String,
    val floors: String,
    val rooms: String,
    val windows: String,
    val doors: String,
    val garage: String) {

    data class Builder(
        var walls: String = "",
        var floors: String = "",
        var rooms: String = "",
        var windows: String = "",
        var doors: String = "",
        var garage: String = ""
    ) {
        fun walls(walls: String) = apply { this.walls = walls }
        fun floors(floors: String) = apply { this.floors = floors }
        fun rooms(rooms: String) = apply { this.rooms = rooms }
        fun windows(windows: String) = apply { this.windows = windows }
        fun doors(doors: String) = apply { this.doors = doors }
        fun garage(garage: String) = apply { this.garage = garage }

        fun build() = House(walls, floors, rooms, windows, doors, garage)
    }
}