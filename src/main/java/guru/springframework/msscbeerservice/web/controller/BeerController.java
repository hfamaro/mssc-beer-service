package guru.springframework.msscbeerservice.web.controller;

import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import guru.springframework.msscbeerservice.web.model.BeerDto;

@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {
    
    @GetMapping("/{beerid}")
    public ResponseEntity<BeerDto> getBeerByID(@PathVariable("beerId") UUID beerId){
        // TODO impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> saveNewBeer(@RequestBody BeerDto beerDto){
        // TODO impl
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @PostMapping("/{beerid}")
    public ResponseEntity<?> getBeerByID(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto) {
        // TODO impl
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
