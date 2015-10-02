package container

import asset.{Image, Video, VideoAds}

/**
 * Created by kasonchan on 10/2/15.
 */
case class Container(videos: List[Video],
                     image: List[Image],
                     videoAds: List[VideoAds])
