package guru.springframework.msscbrewery.web.model;

import lombok.*;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Null;
import javax.validation.constraints.Size;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerDto {

    @Null
    private UUID id;

    @NotEmpty
    @Size(min = 3, max = 100)
    private String name;

}
