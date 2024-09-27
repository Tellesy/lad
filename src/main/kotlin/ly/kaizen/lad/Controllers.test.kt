package ly.kaizen.lad

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController("/api")
class Controllers {

    //add get endpoint to retrun hello word in a json body
    @GetMapping("/hello")
    fun hello(): String {
        return "Hello World gggg"
    }
}