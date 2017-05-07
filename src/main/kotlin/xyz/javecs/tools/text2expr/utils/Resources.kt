package xyz.javecs.tools.text2expr.utils

import com.google.common.io.Resources
import org.reflections.Reflections
import org.reflections.scanners.ResourcesScanner
import java.util.regex.Pattern
import kotlin.streams.toList

private val reflections = Reflections(null, ResourcesScanner())
internal fun read(path: String) = Resources.toString(Resources.getResource(path), Charsets.UTF_8)!!
internal fun resources(prefix: String, extension: String = "txt") = reflections.getResources(Pattern.compile(".+\\.$extension")).stream()
        .filter { it.startsWith("$prefix/") }
        .toList()