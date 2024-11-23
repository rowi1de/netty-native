package netty.graalvm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
@EnableConfigurationProperties
@EnableWebFlux
class NettyNativeApiApplication

fun main(args: Array<String>) {
    runApplication<NettyNativeApiApplication>(*args)
}
