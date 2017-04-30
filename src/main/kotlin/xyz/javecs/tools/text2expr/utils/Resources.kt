package xyz.javecs.tools.text2expr.utils

import com.google.common.io.Resources
import org.reflections.Reflections
import org.reflections.scanners.ResourcesScanner
import java.util.regex.Pattern
import kotlin.streams.toList

private val reflections = Reflections(null, ResourcesScanner())
fun read(path: String) = Resources.toString(Resources.getResource(path), Charsets.UTF_8)!!
fun resources(prefix: String): List<String> {
    return reflections.getResources(Pattern.compile(".+\\.txt")).stream()
            .peek{ println(it) }
            .filter { it.startsWith("$prefix/") }
            .toList()
}