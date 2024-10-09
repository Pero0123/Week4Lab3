package ie.atu.week3lab3;

import jakarta.validation.constraints.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Person {
    @NotBlank(message = "Must Enter Name")
    String name;

    @NotBlank(message = "Must Enter Title")
    String title;

    @NotBlank(message = "Must enter employee id")
    @PositiveOrZero(message = "employee id cannot be negative")
    int employeeId;

    @NotBlank(message = "Must Enter age")
    @PositiveOrZero(message = "age must be 0 or greater")
    int age;

    @NotBlank(message = "Must enter email")
    @Email(message = "Not a valid email")
    String email;

    @NotBlank(message = "Must Enter position")
    String position;

    @NotBlank(message = "Must Enter department")
    String department;
}
