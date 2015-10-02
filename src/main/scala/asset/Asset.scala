package asset

/**
 * Created by kasonchan on 10/2/15.
 */
/**
 * Asset
 * @param id ID: String
 * @param name Name: String
 * @param typeIndicator Type indicator: String video, image or videoAd
 * @param url URL: String
 * @param expirationDate Expiration date: String
 */
case class Asset(id: String,
                 name: String,
                 typeIndicator: String,
                 url: String,
                 expirationDate: String)

/**
 * Video
 * @param asset Asset
 * @param expirationDate Expiration date: String
 * @param indicator Movie/Full episode/Clip indicator: String
 */
case class Video(asset: Asset,
                 expirationDate: String,
                 indicator: String)

/**
 * Image
 * @param asset Asset
 */
case class Image(asset: Asset)

/**
 * Video ads
 * @param asset Asset
 * @param productDescription Product Description: String
 */
case class VideoAd(asset: Asset,
                   productDescription: String)
