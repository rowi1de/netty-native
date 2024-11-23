package netty.graalvm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.context.properties.EnableConfigurationProperties
import org.springframework.boot.runApplication

@SpringBootApplication
@EnableConfigurationProperties
class NettyNativeApiApplication

fun main(args: Array<String>) {
    runApplication<NettyNativeApiApplication>(*args)
}
