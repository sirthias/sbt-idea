import sbt._
class Project(info: ProjectInfo) extends ParentProject(info) {
  lazy val backend   = project("Backend", "Backend", new BackendProject(_))
  lazy val frontend  = project("Frontend", "Frontend", new FrontendProject(_))
  lazy val utils     = project("Utils", "Utils", new UtilsProject(_))

  class BackendProject(info: ProjectInfo) extends DefaultProject(info) {
    val dependsOnUtils = utils
  }

  class FrontendProject(info: ProjectInfo) extends DefaultProject(info) {
    val dependsOnUtils = utils
  }

  class UtilsProject(info: ProjectInfo) extends DefaultProject(info) {
  }
}

