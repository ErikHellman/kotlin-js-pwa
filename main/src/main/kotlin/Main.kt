import kotlin.browser.document
import kotlin.browser.window

fun main() {
    val element = document.querySelector("#installServiceWorker")
    element?.addEventListener("click", {
        window.navigator.serviceWorker.register("/service-worker.js")
            .then { console.log("Service worker registered!") }
            .catch { console.error("Service Worker registration failed: $it") }
    })


}