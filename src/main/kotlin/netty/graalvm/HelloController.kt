package netty.graalvm

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
class HelloController {

    @GetMapping("/hello")
    fun hello(): Mono<String> = Mono.just("Hello, Netty!")
}
