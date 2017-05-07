package xyz.javecs.tools.text2expr.templates

import org.yaml.snakeyaml.Yaml
import xyz.javecs.tools.text2expr.utils.read

private val printValue = "<if(value)><value><endif>"

data class Templates(var templates: List<RuleTemplate> = ArrayList<RuleTemplate>())
data class RuleTemplate(var rule: String = "", var template: String = "")

class TemplateLoader(path: String = "rule-template.yml", val defaultTemplate: String = printValue) {
    private val config = Yaml().loadAs(read(path), Templates::class.java)
    fun templateOf(rule: String): String {
        val item = config.templates.find { it.rule == rule }
        return if (item == null) defaultTemplate else read(item.template)
    }
}
