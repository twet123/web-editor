import kotlinx.browser.document

@JsModule("monaco-editor")
@JsNonModule
external class MonacoEditor {
    companion object {
        fun create(container: dynamic, options: dynamic): dynamic
        fun getModels(): Array<dynamic>
    }
}

fun main() {
    createEditor()
}

fun createEditor() {
    val editorContainer = document.getElementById("editor")

    MonacoEditor.create(editorContainer, js("{}"))
}