package container

import asset.{Asset, Image, Video, VideoAd}

/**
 * Created by kasonchan on 10/2/15.
 */
trait Containers {

  /**
   * Generate videos
   * @param count Number of videos to be generated: Int
   * @return Sequence of videos: Seq[Video]
   */
  def generateVideos(count: Int): Seq[Video] = {
    for {
      c <- 1 to count
      a = Asset("v" + c, "Video " + c, "video", "10/02/2015")
      v = Video(a, "10/02/2015", "movie")
    } yield v
  }

  /**
   * Generate images
   * @param count Number of images to be generated: Int
   * @return Sequence of images: Seq[Image]
   */
  def generateImages(count: Int): Seq[Image] = {
    for {
      c <- 1 to count
      a = Asset("i" + c, "Image " + c, "image", "10/02/2015")
      i = Image(a)
    } yield i
  }

  /**
   * Generate video ads
   * @param count Number of video ads to be generated: Int
   * @return Sequence of video ads: Seq[VideoAd]
   */
  def generateVideoAds(count: Int): Seq[VideoAd] = {
    for {
      c <- 1 to count
      a = Asset("va" + c, "Video ad " + c, "videoAd", "10/02/2015")
      va = VideoAd(a, "This is the video ad " + c + ".")
    } yield va
  }

  /**
   * Generate container
   * @param videoCount Number of videos to be generated: Int
   * @param imageCount Number of images to be generated: Int
   * @param videoAdCount Number of videos to be generated: Int
   * @return container: Container
   */
  def generateContainer(videoCount: Int, imageCount: Int, videoAdCount: Int): Container = {
    Container(generateVideos(videoCount),
      generateImages(imageCount),
      generateVideoAds(videoAdCount))
  }

  /**
   * Print asset
   * @param a Asset
   */
  def printAsset(a: Asset) = {
    println("ID: " + a.id)
    println("Name: " + a.name)
    println("Type indicator: " + a.typeIndicator)
    println("Expiration date: " + a.expirationDate)
  }

  /**
   * Print videos
   * @param videos Sequence of videos: Seq[Video]
   */
  def printVideos(videos: Seq[Video]) = {
    for (v <- videos) {
      v match {
        case Video(a: Asset, ved: String, i: String) =>
          printAsset(a)
          println("Expiration date: " + ved)
          println("Indicator: " + i)
        case _ =>
      }
    }
  }

  /**
   * Print images
   * @param images Sequence of images: Seq[Image]
   */
  def printImages(images: Seq[Image]) = {
    for (i <- images) {
      i match {
        case Image(a: Asset) =>
          printAsset(a)
        case _ =>
      }
    }
  }

  /**
   * Print video ads
   * @param videoAds Sequence of video ads: Seq[VideoAd]
   */
  def printVideoAds(videoAds: Seq[VideoAd]) = {
    for (va <- videoAds) {
      va match {
        case VideoAd(a: Asset, pd: String) =>
          printAsset(a)
          println("Product Description: " + pd)
        case _ =>
      }
    }
  }

  /**
   * Print container
   * @param container Container to be printed: Container
   */
  def printContainer(container: Container) = {
    printVideos(container.videos)
    printImages(container.images)
    printVideoAds(container.videoAds)
  }

}
