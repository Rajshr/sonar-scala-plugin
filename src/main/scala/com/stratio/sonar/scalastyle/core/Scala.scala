/*
 * Sonar Scalastyle Plugin
 * Copyright (C) 2014 All contributors
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this program; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02
 */
package com.stratio.sonar.scalastyle.core

import com.stratio.sonar.scalastyle.Constants
import org.sonar.api.config.Settings
import org.sonar.api.resources.AbstractLanguage

/**
 * Defines Scala as a language for SonarQube.
 * It creates two Scala languages if used with the Sonar Scala Plugin.
 * When the Sonar Scala Plugin relased this class should be deleted and the plugin should depend on it.
 */
class Scala(s: Settings) extends AbstractLanguage(Constants.ScalaKey, "Scala") {
  override def getFileSuffixes: Array[String] = Array("scala")
}
