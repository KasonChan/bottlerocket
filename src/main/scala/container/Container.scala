package container

import asset.{Image, Video, VideoAd}

/**
 * Created by kasonchan on 10/2/15.
 */
/**
 * Container
 * @param videos Sequence of video: Seq[Video]
 * @param images Sequence of images: Seq[Image]
 * @param videoAds Sequence of video ads: Seq[VideoAd]
 */
case class Container(videos: Seq[Video],
                     images: Seq[Image],
                     videoAds: Seq[VideoAd])
