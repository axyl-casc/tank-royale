package dev.robocode.tankroyale.server.mapper

import dev.robocode.tankroyale.schema.HealthPack
import dev.robocode.tankroyale.server.model.IPoint

object PointToHealthPackMapper {
    fun map(point: IPoint): HealthPack {
        return HealthPack().apply {
            x = point.x
            y = point.y
        }
    }
}
