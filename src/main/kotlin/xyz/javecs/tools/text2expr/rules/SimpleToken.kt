package xyz.javecs.tools.text2expr.rules

import com.atilika.kuromoji.ipadic.Token

private val Number = "数"

internal fun List<Token>.toSimpleTokens(): List<SimpleToken> {
    val merged = ArrayList<SimpleToken>()
    for (token in this) {
        if (merged.isEmpty()) {
            merged.add(SimpleToken(token))
            continue
        }
        if (token.partOfSpeechLevel2 == Number || token.surface == ".") {
            val last = merged.last()
            if (last.partOfSpeechLevel2 == Number) {
                last.surface = last.surface + token.surface
                continue
            }
        }
        merged.add(SimpleToken(token))
    }
    return merged
}

internal class SimpleToken(token: Token) {
    var surface: String = ""
    var partOfSpeechLevel1: String = ""
    var partOfSpeechLevel2: String = ""
    var partOfSpeechLevel3: String = ""
    var partOfSpeechLevel4: String = ""
    var baseForm: String = ""
    var reading: String = ""
    var pronunciation: String = ""

    init {
        surface = token.surface
        partOfSpeechLevel1 = token.partOfSpeechLevel1
        partOfSpeechLevel2 = token.partOfSpeechLevel2
        partOfSpeechLevel3 = token.partOfSpeechLevel3
        partOfSpeechLevel4 = token.partOfSpeechLevel4
        baseForm = token.baseForm
        reading = token.reading
        pronunciation = token.pronunciation
    }
}