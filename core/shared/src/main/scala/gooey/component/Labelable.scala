package gooey.component

/** API for components that can have an attached label. */
trait Labelable[Self] { self: Self =>
  def label: Option[String]
  def withLabel(label: String): Self
  def withoutLabel: Self
}
