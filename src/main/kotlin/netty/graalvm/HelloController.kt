package netty.graalvm

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono

@RestController
@RequestMapping("hello")
class HelloController {

    @GetMapping("/")
    fun hello(): Mono<String> = Mono.just("Hello, Netty!")
}
