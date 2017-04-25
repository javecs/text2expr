package xyz.javecs.tools.text2expr.utils

import com.google.common.io.Resources

fun read(path: String) = Resources.toString(Resources.getResource(path), Charsets.UTF_8)!!


