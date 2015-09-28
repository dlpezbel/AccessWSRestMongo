package test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import vo.Word;

@RestController
public class GreetingController {

    private static final String template = "Respuesta, %s!";
    //private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/EngToSp")
    public Word engToSp(@RequestParam(value="word", defaultValue="hello") String name) {
        return new Word("", String.format(template, name));
    }

    @RequestMapping("/SpToEng")
    public Word spToEng(@RequestParam(value="word", defaultValue="hello") String name) {
        return new Word("", String.format(template, name));
    }

}