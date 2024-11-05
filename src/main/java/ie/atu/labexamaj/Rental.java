package ie.atu.labexamaj;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class Rental {

    @NotBlank(message = "Rental code must be entered")
    public String rentalCode;

    @Max(value = 50, message = "Max 50 characters")
    public String carModel;

    @Max(value = 100, message = "Max 100 characters")
    public String renterName;

    @Email(message = "Must be a valid email format")
    public String renterEmail;


    public String rentalStartDate;

    public String rentalEndDate;

    @Positive(message = "Must be a positive decimal value")
    public double dailyRate;

}
