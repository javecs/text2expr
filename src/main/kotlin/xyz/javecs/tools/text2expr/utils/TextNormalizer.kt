package xyz.javecs.tools.text2expr.utils

import java.text.Normalizer

fun normalize(text: String) = Normalizer
        .normalize(text, Normalizer.Form.NFKC)!!
        .toLowerCase()