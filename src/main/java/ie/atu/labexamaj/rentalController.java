package ie.atu.labexamaj;


import jakarta.validation.Valid;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("rentals")
public class rentalController {

    private List<Rental> rentalList = new ArrayList<>();

    public rentalController(){

        rentalList.add(new Rental("1234", "Mini", "Adam", "Adam@123.ie", "14", "20", 10));
    }

    @PostMapping("/addRentals")
    public Rental addRental(@RequestBody Rental newRental) {

        rentalList.add(newRental);
        return newRental;

    }
    @GetMapping("/getRentals")
    public List<Rental> getRentalList() {

        return rentalList;

    }



}
