package pl_tecna_data_service.api;

import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl_tecna_data_service.service.GroovyRunnerService;

@RestController
@RequestMapping("/groovyrunner")
@AllArgsConstructor
public class GroovyRunnerController {

    private final GroovyRunnerService runnerService;

    @GetMapping("/{name}")
    @ResponseBody
    public ResponseEntity<String> getScriptResult(@PathVariable String name){
        String result = runnerService.runScriptByName(name);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
