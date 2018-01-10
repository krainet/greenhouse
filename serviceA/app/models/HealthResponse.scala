package models

import play.api.libs.json._

case class HealthResponse(statusCode:Int, msg:String)
object HealthResponse {
  implicit val healthResponseWrites = Json.writes[HealthResponse]
}
