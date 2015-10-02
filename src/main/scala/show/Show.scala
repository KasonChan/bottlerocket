package show

import container.Container

/**
 * Created by kasonchan on 10/2/15.
 */
/**
 * Show
 * @param id ID: String
 * @param name Name: String
 * @param description Description: String
 * @param containers Sequence of containers: Seq[Container]
 */
case class Show(id: String,
                name: String,
                description: String,
                containers: Seq[Container])
