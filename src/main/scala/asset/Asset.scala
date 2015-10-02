package asset

/**
 * Created by kasonchan on 10/2/15.
 */
case class Asset(id: String,
                 name: String,
                 typeIndicator: String,
                 expirationDate: String)

case class Video(asset: Asset,
                 expirationDate: String,
                 movieIndicator: Option[String],
                 fullEpisodeIndicator: Option[String],
                 clipIndicator: Option[String])

case class Image(asset: Asset)

case class VideoAds(asset: Asset,
                    productDescription: String)
