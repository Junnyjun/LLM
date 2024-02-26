package git.io.llm

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class LlmApplication

fun main(args: Array<String>) {
	runApplication<LlmApplication>(*args)
}
