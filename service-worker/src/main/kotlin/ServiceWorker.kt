import org.w3c.workers.ServiceWorkerGlobalScope

external val self: ServiceWorkerGlobalScope

fun main() {
    self.addEventListener("install", { console.log("Service Worker installed!")})
}