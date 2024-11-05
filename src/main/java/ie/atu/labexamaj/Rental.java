package ie.atu.labexamaj;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Rental {

    @NotBlank(message = "Rental code must be entered")
    private String rentalCode;

    @Max(value = 50, message = "Max 50 characters")
    private String carModel;

    @Max(value = 100, message = "Max 100 characters")
    private String renterName;

    @Email(message = "Must be a valid email format")
    private String renterEmail;


    private String rentalStartDate;

    private String rentalEndDate;

    @Positive(message = "Must be a positive decimal value")
    private double dailyRate;

}
