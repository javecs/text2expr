package xyz.javecs.tools.text2expr.utils

import java.text.Normalizer

internal fun normalize(text: String) = Normalizer
        .normalize(text, Normalizer.Form.NFKC)!!
        .toLowerCase()